package fr.iutvalence.java.tp.bataillenavale;

/**
 * enumeration qui permet de manipuler les differents types de bateau
 * @author moiroudt
 *
 */
public enum TypeDeBateau
{
	/**
	 * un type de bateau de taille 5
	 */
	PorteAvion(5),
	/**
	 * un type de bateau de taille 4
	 */
	Croiseur(4),
	/**
	 * un type de bateau de taille 3
	 */
	Destroyer(3),
	/**
	 * un type de bateau de taille 3
	 */
	Sousmarin(3),
	/**
	 * un type de bateau de taille 2
	 */
	Torpilleur(2);
	
	/**
	 * La taille d'un bateau
	 */
	private int tailleBateau;
	
	/**
	 * definit un type de bateau avec une taille donnee
	 * @param taille la taille du bateau
	 */
	private TypeDeBateau(int taille)
	{
		this.tailleBateau = taille;
	}
	
	/**
	 * obtenir la taille du bateau
	 * @return la taille du bateau
	 */
	public int obtenirTailleBateau()
	{
		return this.tailleBateau;
	}
}
