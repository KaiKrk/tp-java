package fr.kaiqiang.util;

import java.util.Random;
import java.util.Scanner;

public class ResearchGame {
		Scanner scan = new Scanner(System.in);
		Random randomnum = new Random();
		int reponse; String combinaison; int combinaisonint;int essai = 5;;
			public void test() {	
		while(true) {
			reponse = randomnum.nextInt(10000);
			if(reponse > 999) {break;}
		}
		String reponsestr = Integer.toString(reponse);
		String tabreponse[] = reponsestr.split("");
	essai: while(essai != 0) {
		code : while(true) {
			System.out.println("Veuillez rentrer votre combinaison de 4 chiffres : ");
			combinaison = scan.nextLine();
				try {
					
					if (combinaison.length() == 4) { 
						combinaisonint=Integer.parseInt(combinaison);
					break code;}
				}
				catch (Exception e) {
	//				e.printStackTrace();
					scan.nextLine();
				}
		}
		String tabcombinaison[] = combinaison.split("");
		int indice = 0;
		System.out.print("Voici l'indice : ");
		for (String i : tabcombinaison) {
			
			try {
			int reponsebis = Integer.parseInt(tabreponse[indice]);
			int combinaisonbis =Integer.parseInt(i);
				if (combinaisonbis < reponsebis) {
					System.out.print("+");
				}else if ( combinaisonbis > reponsebis) {
					System.out.print("-");
				}else System.out.print("=");
				indice++;
			}		
			catch (Exception e) {
//				e.printStackTrace();
				scan.nextLine();
			}
			
		}
		System.out.println("\n"+"Vous avez rentrer : " +combinaison);
		if (combinaison.equals(reponsestr)) {
			essai = 0; System.out.println("Vous avez réussi !!!");
		}else {essai --;
			System.out.println("Il vous reste : "+ essai+" essai(s)");
		}
	}
		if(essai ==0)
		System.out.println("\nLa Solution est : "+ reponse);
			}
	
}


