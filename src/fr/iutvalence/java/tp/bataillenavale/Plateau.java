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
	private static final int nombre_de_cases_en_abscisse = 10;
	
	/**
	 * nombre_de_cases_en_ordonnee definit le nombre de cases verticales
	 */
	private static final int nombre_de_cases_en_ordonnee = 10;
	
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
	
	/**
	 * Obtenir la case de l'echiquier a une position donnee
	 * @param position la position
	 * @return la case du plateau a la postion donnee
	 */
	private Case obtenirCase(Position position)
	{
		return this.cases[position.getx()][position.gety()];
	}
	
	/**
	 * Obtenir le bateau pose sur une case de position donee
	 * @param positionProue la postion de la proue du bateau
	 * @return le bateau pose sur la case
	 */
	public Bateau obtenirBateau(Position positionProue)
	{
		return this.cases[positionProue.getx()][positionProue.gety()].obtenirBateau();
	}
	
}
