package classification;

import java.util.ResourceBundle;

public class ClassificationContext 
{
	// Constantes
	private static String resultsPath;
	private static String regressionDatabase;
	
	static
	{
		// L� arquivo de propriedades
		ResourceBundle properties = ResourceBundle.getBundle("comite.comite");
		resultsPath = properties.getString("results.path");					
	}
	
	public static String getResultsPath()
	{
		return resultsPath;
	}
	
	public static String getRegressionDatabase()
	{
		return regressionDatabase;
	}
	
	public static void setRegressionDatabase(String regressionDatabase)
	{
		ClassificationContext.regressionDatabase = regressionDatabase;
	}
}
