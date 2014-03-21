/**
 * 
 */
package fr.iutvalence.java.tp.bataillenavale;

/**
 * represente un plateau
 * @author moiroudt
 *
 */
public class Plateau
{
	/**
	 * nombre_de_cases_en_abscisse definit le nombre de cases horizontales
	 */
	private final int nombre_de_cases_en_abscisse = 10;
	
	/**
	 * nombre_de_cases_en_ordonnee definit le nombre de cases verticales
	 */
	private final int nombre_de_cases_en_ordonnee = 10;
	
	/**
	 * les cases du plateau
	 */
	private Case[][] cases;
	
	/**
	 * construire un nouveau plateau vide
	 */
	public Plateau()
	{
		this.cases = new Case[nombre_de_cases_en_abscisse][nombre_de_cases_en_ordonnee];
		
	}
}
