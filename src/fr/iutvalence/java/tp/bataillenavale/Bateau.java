package fr.iutvalence.java.tp.bataillenavale;

// TODO écrire un commentaire (done)
/**
* represente un bateau sur un plateau
* @author moiroudt
*
*/
public class Bateau
{	
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

	// TODO écrire un commentaire plus précis (done)
	/** 
	 *  construire un bateau a la position donne
	 * @param taille la taille du bateau
	 * @param estHorizontal la direction du bateau
	 * @param positionProue la position du bateau a la proue
	 * 
	 */
	public Bateau (boolean estHorizontal, int taille, Position positionProue)
	{
		this.taille = taille;
		this.positionProue = positionProue;
	}
	
	/**
	 * @param positionProue
	 * @return
	 */
	public boolean estVide(Position positionProue)
	{
		if ( == null){
			return true;
		}
		else return false;
	}
	
	/**
	 * @param position
	 * @return
	 */
	public boolean estTouché(Position position)
	{
		
	}
	
	/**
	 * @return
	 */
	public boolean estCoulé()
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