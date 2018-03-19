package fr.kaiqiang.util;

import java.util.Random;
import java.util.Scanner;

public class ResearchGame {
		Scanner scan = new Scanner(System.in);
		static	Random randomnum = new Random();
	public int randomnumber() {
		int number = randomnum.nextInt(10000);
		while(true) {
		if (number > 999 ) {break;} else {randomnumber();}
		}
		return number;
	
	}
	
	private final int solution = randomnumber();		
	
	public void research() {
				String combinaison ;
				String annonce = "Bienvenue dans le Jeu de Recherche\n Le but est de trouver la combinaison secrete, qui se compose de 4 chiffres\n "
						+ "Des indices vous permetrons de trouver la bonne combinaison + ou - et si le chiffre est le bon = sera affiché\n"
						+" Bonne Chance";
				System.out.println(annonce);
				
			code : while(true) {
				System.out.println("Veuillez rentrer votre premiere combinaison de 4 chiffres : ");
				combinaison = scan.nextLine();
				try {
					int newcombinaison =Integer.parseInt(combinaison);
					
					if (newcombinaison <= 9999) {break code;}
					}
				
				catch (Exception e) {
//					e.printStackTrace();
					scan.nextLine();
				}
			}
				
				String[] tab = combinaison.split("");
				
				
				
				
				System.out.println(solution);
			}
}
