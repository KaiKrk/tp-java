package fr.kaiqiang.util;

import java.util.Random;
import java.util.Scanner;

public class ResearchGameDef {
	public void researchdef() {
		System.out.println("Bienvenue dans le mode défenseur du Jeu de Recherche dans ce Jeu.\n Vous devez ici rentrer la combinaison"
				+ "et l'ordinateur va essayer de trouver la combinaison");
		Scanner scan = new Scanner(System.in);
		Random randomnum = new Random();
		String combinaison; int solution;
		
		
		code : while(true) {
			combinaison = scan.nextLine();
			System.out.println("Veuillez rentrer votre solution à 4 chiffre: ");
			try {
				
				if (combinaison.length() == 4) { 
				solution =Integer.parseInt(combinaison);
				break code;}
			}
				
			
			catch (Exception e) {
//				e.printStackTrace();
				scan.nextLine();
			}
		}
		
		String[] tab = combinaison.split("");
		int asolution = Integer.parseInt(tab[0]);
		int bsolution = Integer.parseInt(tab[1]);
		int csolution = Integer.parseInt(tab[2]);
		int dsolution = Integer.parseInt(tab[3]);
		
		int areponse = randomnum.nextInt(10);
		int breponse = randomnum.nextInt(10);
		int creponse = randomnum.nextInt(10);
		int dreponse = randomnum.nextInt(10);
		
		
	}
}
