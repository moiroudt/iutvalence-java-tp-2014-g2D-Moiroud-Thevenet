package fr.iutvalence.java.tp.bataillenavale;


// TODO écrire un commentaire précis (celui-ci ne l'est pas)
/**
 * 
 * 
 * @author moiroudt
 * 
 */
public class BatailleNavale
{
	/**
	 * les 2 joueurs d'une partie de bataille navale
	 */
	private Joueur joueur1;
	private Joueur joueur2;
	
	/**
	 * le plateau ou sont positionnes les bteaux de chaque joueur
	 */
	private Bateau[] bateauxJoueur1;
	private Bateau[] bateauxJoueur2;
	
	/**
	 * le plateau qui indique ou les joueurs ont tire
	 */
	private boolean[][] tirsJoueur1;
	private boolean[][] tirsJoueur2;
	
	/**
	 * @param bateauxJoueur1
	 * @param bateauxJoueur2
	 */
	public BatailleNavale(Bateau[] bateauxJoueur1, Bateau[] bateauxJoueur2)
	{
		super();
		this.bateauxJoueur1 = bateauxJoueur1;
		this.bateauxJoueur2 = bateauxJoueur2;
	}
	
	
	/**
	 * 
	 */
	public void jouer()
	{
		
	}
	
}
