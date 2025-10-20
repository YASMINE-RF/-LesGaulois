package personnages;

public class Village {
	private String nom;
	private Gaulois chef;
	private int nbVillageois=0;
    private int nbVillageoisMax=30;
    private Gaulois[] villageois;
	

	public Village(String nom, Gaulois chef) {
		this.nom = nom;
		this.chef = chef;
		this.villageois = new Gaulois[nbVillageoisMax];
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}
	
   
	public void ajouterVillageois(Gaulois gaulois) {
		 if (nbVillageois < nbVillageoisMax) {
	            villageois[nbVillageois] = gaulois;
	            nbVillageois++;
	            gaulois.setVillage(this); // important pour le lien inverse
	        } else {
	            System.out.println("Le village est plein !");
	        }
	}
	
	public Gaulois trouverVillageois(int i) {
		if (i >=0 && i <=nbVillageois) {
			   return villageois[i-1]; 
		}
			else {		
			System.out.println("Il n’y a pas autant d’habitants dans notre village !");
			return null;
		}
	}
		
	
	public void afficherVillageois() {
	        System.out.println(
	            "Dans le village \"" + nom + "\" du chef " + chef.getNom() +
	            " vivent les légendaires gaulois :"
	        );

	        for (int i = 0; i < nbVillageois; i++) {
	            System.out.println("- " + villageois[i].getNom());
	        }
	    }
	
	
	public static void main(String[] args) {
		Gaulois abraracourcix  = new Gaulois("Abraracourcix ", 6);
		Village village = new Village("Village des Irréductibles", abraracourcix);
		Gaulois gaulois = village.trouverVillageois(30); 
		Gaulois asterix  = new Gaulois("Asterix ", 8);
		village.ajouterVillageois(asterix);
		gaulois = village.trouverVillageois(1); 
		System.out.println(gaulois); 
		gaulois = village.trouverVillageois(2); 
		System.out.println(gaulois);
		
		Gaulois obelix = new Gaulois("Obélix", 25);
        village.ajouterVillageois(obelix);
        village.afficherVillageois();
        Gaulois doublePolemix = new Gaulois("Doublepolémix", 4);
        abraracourcix.sePresenter();
        asterix.sePresenter();
        doublePolemix.sePresenter();
		
	}

	

}
