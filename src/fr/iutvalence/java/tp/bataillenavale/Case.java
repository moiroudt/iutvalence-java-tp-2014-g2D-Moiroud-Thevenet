package fr.iutvalence.java.tp.bataillenavale;

/**
 * @author moiroudt
 *represente une case d'u plateau
 */
public class Case
{
	/**
	 * La bateau pose sur la case
	 */
	private Bateau bateau;
	
	/**
	 * Construire une case vide
	 */
	public Case()
	{
		this.bateau = null;
	}
	
	/**
	 * Obtenir le bateau pose sur la case
	 * @return le bateau pose sur la case, ou null si il n'y a pas de bateau
	 */
	public Bateau obtenirBateau()
	{
		return this.bateau;
	}
	
	/**
	 * Poser un bateau sur la case
	 * @param bateau le bateau a poser
	 */
	public void poserBateau(Bateau bateau)
	{
		this.bateau = bateau;
	}
	
}
