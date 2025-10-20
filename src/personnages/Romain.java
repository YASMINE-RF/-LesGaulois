package personnages;

public class Romain {
	private String nom;
	private int force;

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
	    }
	
	
	
	
	
}
