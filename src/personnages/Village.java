package personnages;

public class Village {
	private String nom;
	private Gaulois chef;
	private int nbVillageois=0;
    private int nbVillageoisMax=30;
	

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
	
    Gaulois[] villageois;
	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
		nbVillageois++;
		
	}
	
	public Gaulois trouverVillageois(int i) {
		if (i >=0 && i <nbVillageois) {
			   return villageois[i]; 
		}
			else {		
			System.out.println("Il n’y a pas autant d’habitants dans notre village !");
			return null;
		}
	}
		
		
	public static void main(String[] args) {
		Gaulois abraracourcix  = new Gaulois("Abraracourcix ", 6);
		Village village = new Village("Village des Irréductibles", abraracourcix);
		Gaulois gaulois = village.trouverVillageois(30); 
		Gaulois asterix  = new Gaulois("Asterix ", 8);
		village.ajouterVillageois(asterix);
		
	}

	

}
