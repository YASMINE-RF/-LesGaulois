package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
    	Gaulois asterix = new Gaulois("Asterix", 8);
    	Gaulois obelix = new Gaulois("Obelix", 16);
    	Romain brutus = new Romain("Brutus", 14);
    	Druide panoramix= new Druide("Panoramix", 2);
    		
    	asterix.parler("Bonjour Obélix.");
    	obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?)" );
    	asterix.parler("Oui très bonne idée.");
    	Romain minus = new Romain("Minus", 6);
    	System.out.println("Dans la forêt " + asterix.getNom() + " et " 
                + obelix.getNom() + " tombent nez à nez sur le romain " 
                + minus.getNom() + ".");
    	
    	panoramix.fabriquerPotion(4, 3);
    	panoramix.boosterGaulois(obelix);
    	panoramix.boosterGaulois(asterix);
    	for (int i = 0; i < 3; i++) {
            asterix.frapper(brutus);
        }
    	
	}
   
}
    	    

