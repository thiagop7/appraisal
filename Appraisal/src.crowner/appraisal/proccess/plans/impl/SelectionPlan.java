package appraisal.proccess.plans.impl;

import java.util.List;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import entities.dataset.Dataset;
import entities.results.InstanceResult;
import entities.results.PlanResult;
import entities.results.RegressionResult;
import entities.results.SelectionResult;

import appraisal.proccess.plans.Plan;
import appraisal.proccess.stages.RegressionStage;
import appraisal.proccess.stages.SelectionStage;

public class SelectionPlan extends Plan
{
	// Logger
	private static final Log LOGGER = LogFactory.getLog(SelectionPlan.class);
	
	//
	// Atributos
	// 
	SelectionStage selectionStage;
	RegressionStage regressionStage;
	
	public SelectionPlan (SelectionStage selectionStage, RegressionStage regressionStage)
	{
		this.selectionStage = selectionStage;
		this.regressionStage = regressionStage;		
	}
	
	//
	// M�todo Principal
	//	
	public PlanResult runPlan(Dataset dataset, String regressionColumn, Dataset originalColumn)
	{
		LOGGER.info("## PLANO DE SELE��O E REGRESS�O ##");
		LOGGER.info(">> Etapa de Sele��o: "+selectionStage.getClass().getSimpleName());
		LOGGER.info(">> Etapa de Regress�o: "+regressionStage.getClass().getSimpleName());
		
		// Vari�vel de retorno
		PlanResult planResult = new PlanResult(selectionStage.getClass().getSimpleName(),
											   regressionStage.getClass().getSimpleName());
		
		// 1. Prepara dados para o PCA
		Dataset pcaDataset = dataset.copyDataset();
		pcaDataset.pairWiseDeletion(dataset.getColumns());
		pcaDataset.removeColumn(regressionColumn);
				
		// 2. Prepara dados para o KNN
		Dataset[] splitDataset = dataset.splitTrainTest(regressionColumn);
		Dataset trainDataset = splitDataset[0];
		Dataset targetDataset = splitDataset[1];
				
		// 3. Prepara sele��o
		selectionStage.resetCombinations(1,dataset.getColumnCount()-2,1);

		do
		{
			// Marca tempo
			long start = System.currentTimeMillis();
			
			// 3.1. Realiza sele��o
			SelectionResult selectionResult = selectionStage.run(pcaDataset);
			List<String> selectedColumns = selectionResult.getAttributes();
			
			// 4. Prepara regress�o
			regressionStage.resetCombinations(1,trainDataset.getTupleCount(),1);
			
			do
			{
				// Marca tempo
				if (start==0) start = System.currentTimeMillis();
				
				// 4.2. Realiza regress�o
				String rrId = selectionStage.getPresentCombination()+";"+regressionStage.getPresentCombination();
				RegressionResult rr = regressionStage.run(selectedColumns, regressionColumn, trainDataset, targetDataset);

				// Marca tempo
				long end = System.currentTimeMillis();
				
				// 5. Adiciona o resultado da inst�ncia
				LOGGER.debug("("+((double)(end-start)/1000)+"s) \t"+rrId);
				planResult.addInstance(new InstanceResult(rrId,rr,end-start));
				
				start=0;
				
				// 6. Se h� mais de um, compara o melhor
				if (planResult.getResults().size() > 1)
					planResult.dropWorstResults(originalColumn);
			}
			while(regressionStage.nextCombination());
		}
		while(selectionStage.nextCombination());
		
		return planResult;						
	}
}