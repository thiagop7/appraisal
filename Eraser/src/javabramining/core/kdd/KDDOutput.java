package javabramining.core.kdd;

import javabramining.core.kdd.output.KDDTextResult;

public class KDDOutput 
{
	// Vari�veis de Resultado
	private KDDTextResult result;
	
	public KDDOutput()
	{
		
	}
	
	public KDDTextResult getTextResult()
	{
		if (result == null)
			result = new KDDTextResult();
		
		return(result);
	}	
}