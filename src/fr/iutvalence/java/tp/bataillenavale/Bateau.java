package fr.iutvalence.java.tp.bataillenavale;

// TODO écrire un commentaire (done)
/**
* represente un bateau sur un plateau
* @author moiroudt
*
*/
public class Bateau
{	

	/**
	 * plateau definit le plateau d'une partie
	 */
	private int plateau[][] =
		{
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		};
			
	// TODO écrire un commentaire (done)
	/**
	 * taille definit le nombre de cases qu'occupe un bateau
	 */
	private int taille;
	
	//TODO écrire un commentaire (done)
	/**
	 * horizontal definit la direction d'un bateau
	 */
	private boolean estHorizontal;

	// TODO écrire un commentaire (done)
	/**
	 * positionProue definit les coordonnees de la proue du bateau
	 */
	private final Position positionProue;

	/**
	 * l definit une ligne du plateau
	 */
	private int l;
	
	/**
	 * c definit une colonne du plateau
	 */
	private int c;
	
	/**
	 * i definit un compteur pour la boucle for du constructeur Bateau
	 */
	private int i;
	
	// TODO écrire un commentaire plus précis (done)
	/** 
	 *  construire un bateau a la position donne
	 * @param taille la taille du bateau
	 * @param estHorizontal la direction du bateau
	 * 
	 */
	public Bateau (int taille, int plateau[l][c], boolean estHorizontal)
	{
		for(i=0;i<taille;i++){
			plateau[l][c] = 1;
			if (estHorizontal = 0){
				l++;
			}
			else {
				c++;
			};
		};
	}
	
	/**
	 * @param positionProue
	 * @return
	 */
	public boolean occupePosition(Position position)
	{
		
	}
	
	/**
	 * @param position
	 * @return
	 */
	public boolean estTouche(Position position)
	{
		
	}
	
	/**
	 * @return
	 */
	public boolean estCoule()
	{
		
	}
	
	/**
	 * @param position
	 * @return
	 */
	public boolean estIntact(Position position)
	{
		
	}
}