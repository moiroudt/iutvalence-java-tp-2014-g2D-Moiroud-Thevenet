package jeudebataillenavale;

/**
 * 
 * 
 * @author moiroudt
 *
 */
public class Bateau //definition de la pièce Bateau.
{
	
	private int longueur; //la longueur du Bateau
	private int largeur; //la largeur du Bateau
	private String nom; //le nom du Bateau
	
	/**
	 * 
	 * 
	 * @param longueur
	 * @param largeur
	 */
	Bateau(int longueur, int largeur) //creation de la piece Bateau avec comme parametre une longueur et une largeur.
	{
		this.longueur=longueur; //déclarations d'un parametre d'une piece Bateau qui est la longueur
		this.largeur=largeur; //déclarations d'un parametre d'une piece Bateau qui est la largeur
	}
	
	void public taille() //methode qui contraint la longueur en fonction de largeur et inversement
	{
		
		if ((this.longueur>1) && (this.longueur<6)) //si la longueur est superieur a 1
		{
			this.largeur=1; //alors la largeur est egale à 1
		}
		if ((this.largeur>1) && (this.largeur<6)); //si la largeur est superieur a 1
		{
			this.longueur=1; //alors la largeur est egale a 1
		}
		
	public nomdonne() //methode qui renvoi le nom de la piece en fonctionde sa longueur
		
	switch (longueur)
	{
		case 5: //si la longeur est egale a 5
			nom = "Porte-Avion" //alors le nom du bateau est Porte-avion
			break;
		case 4: //si la logneur est egale a 4
			nom = "Croiseur" //alors le nom du bateau est Croiseur
			break;
		case 3: //si la logneur est egale a 3
			nom = "Contre-torpilleurs" //alors le nom du bateau est Contre-torpilleurs
			break;
		case 2: //si la logneur est egale a 2
			nom = "Torpilleur" //alors le nom du bateau est Torpilleur
			break;
		}
	}
	
}
