package appraisal;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import appraisal.proccess.strategies.Strategy;
import appraisal.proccess.strategies.impl.ClusteringSelectionStrategy;
import appraisal.proccess.strategies.impl.ClusteringStrategy;
import appraisal.proccess.strategies.impl.RegressionStrategy;
import appraisal.proccess.strategies.impl.SelectionClusteringStrategy;
import appraisal.proccess.strategies.impl.SelectionStrategy;

import context.AppraisalContext;

import database.DatabaseException;
import database.DatabaseHandler;
import database.MySQLHandler;

import entities.dataset.Dataset;

@SuppressWarnings("unchecked")
public class Appraisal extends TestCase 
{
	// Logger
	private static final Log LOGGER = LogFactory.getLog(Appraisal.class);
	
	//
	// Atributos
	//
	
	ResourceBundle properties;	// Arquivo fonte de propriedades
				
	//
	// Construtor
	//
	
	public Appraisal()
	{
		LOGGER.info("Inicializando...");
		
		// 1. Carrega contexto
		AppraisalContext.initializeContext();
		
		try
		{
			// L� arquivo de propriedades
			properties = ResourceBundle.getBundle("appraisal.strategies");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//
	// Interface de invoca��o (Primeiro m�todo a ser chamado)
	//
	
	public void test() 
	{
		// Infra-Estrutura
		DatabaseHandler databaseHandler = MySQLHandler.getInstance();
				
		//
		// 1. Recupera par�metros principais
		//
		String originalDatabase = getStringProperty("original.database");
		String regressionDatabase = getStringProperty("regression.database");
		String regressionColumn = getStringProperty("regression.column");		
		
		LOGGER.info("Base Original: "+originalDatabase);
		LOGGER.info("Base de Regress�o: "+regressionDatabase);
		LOGGER.info("Coluna de Regress�o: "+regressionColumn);
		
		Dataset originalDataset;
		Dataset regressionDataset;
		
		//
		// 2. Recupera a base original
		//
		try 
		{
			databaseHandler.selectDatabase(originalDatabase);
			originalDataset = databaseHandler.toDataset();
		}
		catch (DatabaseException e) 
		{
			e.printStackTrace();
			return;
		}
				
		//
		// 3. Recupera a base de regress�o
		//
		try 
		{
			databaseHandler.selectDatabase(regressionDatabase);
			regressionDataset = databaseHandler.toDataset();
		}
		catch (DatabaseException e) 
		{
			e.printStackTrace();
			return;
		}
		
		//
		// 4. Monta as estrat�gias a serem executadas
		//
		List<Strategy> strategies = new ArrayList<Strategy>();
		
		if (getBooleanProperty("regression.enabled"))
		{
			strategies.add(new RegressionStrategy());
		}
		if (getBooleanProperty("selection.regression.enabled"))
		{
			strategies.add(new SelectionStrategy());
		}
		if (getBooleanProperty("clustering.regression.enabled"))
		{
			strategies.add(new ClusteringStrategy(getBooleanProperty("clustering.regression.pso"),
												  getBooleanProperty("clustering.regression.kmeans"),
												  getBooleanProperty("clustering.regression.knn"),
												  getBooleanProperty("clustering.regression.bkprop"),
												  getBooleanProperty("clustering.regression.avg")));
		}
		if (getBooleanProperty("selection.clustering.regression.enabled"))
		{
			strategies.add(new SelectionClusteringStrategy(getBooleanProperty("selection.clustering.regression.pso"),
														  getBooleanProperty("selection.clustering.regression.kmeans"),
														  getBooleanProperty("selection.clustering.regression.knn"),
														  getBooleanProperty("selection.clustering.regression.bkprop"),
														  getBooleanProperty("selection.clustering.regression.avg")));
		}
		if (getBooleanProperty("clustering.selection.regression.enabled"))
		{
			strategies.add(new ClusteringSelectionStrategy(getBooleanProperty("clustering.selection.regression.pso"),
														  getBooleanProperty("clustering.selection.regression.kmeans"),
														  getBooleanProperty("clustering.selection.regression.knn"),
														  getBooleanProperty("clustering.selection.regression.bkprop"),
														  getBooleanProperty("clustering.selection.regression.avg")));
		}		
		
		//
		// 5. Roda as estrat�gias
		//
		Dataset originalColumn = originalDataset.copyColumn(regressionColumn);
		
		for (Strategy strategy : strategies) 
		{
			// Roda a estrat�gia atual
			strategy.runStrategy(originalColumn, regressionDataset, regressionColumn); 			
		}		
	}
	
	
	//////////////////////////////////////////////////////
	// M�todos auxiliares para extra��o de propriedades //
	//////////////////////////////////////////////////////
	private boolean getBooleanProperty(String propertyName) 
	{
		String property = properties.getString(propertyName);
		return Boolean.parseBoolean(property);
	}
	
	private String getStringProperty(String propertyName) 
	{
		return properties.getString(propertyName);		
	}
	
	public static void main (String[] args)
	{
		new Appraisal().test();
	}
}