package appraisal.proccess.plans.impl;

import java.util.List;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import entities.dataset.Dataset;
import entities.results.InstanceResult;
import entities.results.PlanResult;
import entities.results.RegressionResult;

import appraisal.proccess.plans.Plan;
import appraisal.proccess.stages.RegressionStage;


public class RegressionPlan extends Plan
{
	// Logger
	private static final Log LOGGER = LogFactory.getLog(RegressionPlan.class);
	
	//
	// Atributos
	// 
	RegressionStage regressionStage;
	
	public RegressionPlan (RegressionStage regressionStage)
	{
		this.regressionStage = regressionStage;		
	}
	
	//
	// M�todo Principal
	//
	
	public PlanResult runPlan(Dataset dataset, String regressionColumn, Dataset originalColumn)
	{
		LOGGER.info("## PLANO DE REGRESS�O SIMPLES ##");
		LOGGER.info(">> Etapa de Regress�o: "+regressionStage.getClass().getSimpleName());
		
		// Vari�vel de retorno
		PlanResult planResult = new PlanResult(regressionStage.getClass().getSimpleName());
		
		// 1. Prepara os dados
		Dataset[] splitDataset = dataset.splitTrainTest(regressionColumn);
		
		Dataset trainDataset = splitDataset[0];
		Dataset targetDataset = splitDataset[1];
		
		// 2. Monta as colunas selecionadas
		List<String> columns = dataset.getColumns();
		columns.remove(regressionColumn);
		
		// 3. Prepara regress�o
		regressionStage.resetCombinations(1,trainDataset.getTupleCount(),1);
		
		do
		{
			// 3.0. Marca tempo
			long start = System.currentTimeMillis();
			
			// 3.1. Realiza regress�o
			String rrId = regressionStage.getPropertiesCombiner().getPresentCombination();
			RegressionResult rr = regressionStage.run(columns, regressionColumn, trainDataset, targetDataset);

			// 3.2. Marca tempo
			long end = System.currentTimeMillis();
			
			// 3.2. Adiciona o resultado da inst�ncia no plano
			LOGGER.debug("("+((double)(end-start)/1000)+"s) \t"+rrId);			
			planResult.addInstance(new InstanceResult(rrId,rr,end-start));	
			
			// 4. Se h� mais de um, compara o melhor
			if (planResult.getResults().size() > 1)
				planResult.dropWorstResults(originalColumn);
		}
		while(regressionStage.nextCombination());
		
		// retorno
		return planResult;						
	}
}