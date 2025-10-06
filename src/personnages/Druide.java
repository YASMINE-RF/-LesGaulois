package personnages;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;

	public Druide(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.chaudron =new Chaudron();
		
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	public String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	public void fabriquerPotion(int quantite,int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("jai concote "+ quantite +"doses de potion magique. Elle a une force de "+ forcePotion +".");
	}
	public void boosterGaulois(Gaulois gaulois) {
		if (chaudron.resterPotion()) {
			if (gaulois.getNom()=="Obelix") {
				parler("Non," + gaulois.getNom() + " ! Non Et tu le sais tres bien !");
			} else {
				int forcePotion = chaudron.prendreLouche();
				gaulois.boirePotion(forcePotion);
				parler("Tiens"+ gaulois.getNom() + ", un peu de potion magique.");
			}
		} else {
			parler("Desole" + gaulois.getNom() + ", il ny a plus une seule goutte de potion.");
		}
	}
}
