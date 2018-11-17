/*
 * Projeto JavaBraMining
 * NUPAC - UNIVERCIDADE
 *  
 * Desenvolvedor:
 * 	Rafael Castaneda Ribeiro
 * 
 * Orientadores:
 * 	Prof. Cl�udia Ferlin	
 * 	Prof. Ronaldo Ribeiro Goldschmitd
 * 
 */

package javabramining.core.kdd;

/**
 *	Classe Componente
 *
 *	TODO: Documentar Classe
 *
 *	@author: rafaelcastaneda@brfree.com.br
 *
 *	Data de Cria��o:
 *	Data de Modifica��o:
 */

public interface KDDMethod 
{
	public abstract void run(KDDInput input,KDDOutput output) throws KDDMethodException;    
}

