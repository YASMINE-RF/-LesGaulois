package personnages;
import objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified() : "Invariant non respecté à la fin du constructeur !";
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	public String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert forceCoup > 0 : "Précondition non respectée : la force du coup doit être positive !";
		int ancienneForce = force;
		force -= forceCoup;
		if (force < 1) {
			parler("Jabondone...");
		} else {
			parler("Aie");
		}
		
		 
		 assert force <= ancienneForce : "Postcondition non respectée : la force n'a pas diminué !";
		 assert isInvariantVerified() : "Invariant non respecté à la fin de recevoirCoup() !";
	}
	
	
	
	
	 private boolean isInvariantVerified() {
	        return force >= 0;
	    }
	
	 
	 public static void main(String[] args) {
	        Romain minus = new Romain("Minus", 6);
            System.out.println(Equipement.CASQUE);
	        System.out.println(Equipement.BOUCLIER);
	        minus.sEquiper(Equipement.CASQUE);
	        minus.sEquiper(Equipement.CASQUE);
	         minus.sEquiper(Equipement.BOUCLIER);
	        minus.sEquiper(Equipement.CASQUE);
	        
	    }
	 
	 
	 
	 public void sEquiper(Equipement equipement) {
		    switch (nbEquipement) {
		        case 2:
		            System.out.println("Le soldat " + nom + " est déjà bien protégé !");
		            break;

		        case 1:
		            if (equipements[0] == equipement) {
		                System.out.println("Le soldat " + nom + " possède déjà un " + equipement + " !");
		            } else {
		                ajouterEquipement(equipement);
		            }
		            break;

		        case 0:
		            ajouterEquipement(equipement);
		            break;
		    }
		}

		private void ajouterEquipement(Equipement equipement) {
		    equipements[nbEquipement] = equipement;
		    nbEquipement++;
		    System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
		}
	
	
	 
	
	
	
}
