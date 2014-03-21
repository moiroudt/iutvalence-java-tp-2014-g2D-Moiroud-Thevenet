/**
 * 
 */
package fr.iutvalence.java.tp.bataillenavale;

/**
 * represente une position, a l'intersection d'une abscisse et d'une ordonnee
 * @author moiroudt
 *
 */
public class Position
{
	/**
	 * x definit l'abscisse de la position de la proue
	 */
	private final int x;
	
	/**
	 * y definit l'ordonnee de la position de la proue
	 */
	private final int y;
	
	/** 
	 * construit une nouvelle position, a l'intersection de l'abscisse et de l'ordonnee passees en parametre
	 * @param x l'abscisse
	 * @param y l'ordonnee
	 */
	public Position(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	 
	/**
	 * @return l'abscisse
	 */
	public int getx()
	{
	        return this.x;
	}
	
	/**
	 * @return l'ordonnee
	 */
	public int gety()
	{
		return this.y;
	}
}
