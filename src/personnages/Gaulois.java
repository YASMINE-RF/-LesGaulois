package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;
	private Village village;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void setVillage(Village village) { 
		this.village = village;
	}

	public Village getVillage() {
		return village;
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
    	int forceCoup = force * effetPotion; 
    	romain.recevoirCoup(forceCoup);
    	effetPotion--;
    	if (effetPotion<1) {
    		effetPotion=1;
    	}
		
	}
    public void boirePotion(int forcePotion) {
    	effetPotion = forcePotion;
    	
    }
	
    
    public void sePresenter() {
		System.out.print("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom + ". ");

		if (village == null) {
			
			System.out.println("Je voyage de villages en villages.\"");
		} else if (village.getChef() == this) {
			
			System.out.println("Je suis le chef du village " + village.getNom() + ".\"");
		} else {
			
			System.out.println("J'habite le village " + village.getNom() + ".\"");
		}
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
