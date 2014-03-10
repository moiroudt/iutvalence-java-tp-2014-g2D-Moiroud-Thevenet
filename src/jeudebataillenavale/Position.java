/**
 * 
 */
package jeudebataillenavale;

/**
 * @author moiroudt
 *
 */
public class Position
{
	private final int x; //x definit l'abscisse de la position de la proue
	private final int y; //y definit l'ordonnee de la position de la proue
	
	/** On créer l'objet position */
	public Position(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	  public int getx()
	  {
	        return x;
	  }
	  public int gety()
	  {
	        return y;
	  }
}
