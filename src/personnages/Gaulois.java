package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
    public void parler(String texte) {
    	System.out.println(prendreParole() + "\"" + texte + "\"");
    }
    public String prendreParole() {
    	return  "Le gaulois " + nom + " : "; 
    }
    public void frapper(Romain romain) {
    	String nomRomain = romain.getNom();
    	System.out.println(nom+"envoyer un grand coup dans la machoire de "+ nomRomain);
    	int forceCoup = force / 3; 
    	romain.recevoirCoup(forceCoup);
		
	}
    public void boirePotion(int forcePotion) {
    	effetPotion = forcePotion;
    	
    }
	

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix);
	}
    
	
	
	
}
