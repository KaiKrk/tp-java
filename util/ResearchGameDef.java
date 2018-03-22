package fr.kaiqiang.util;

import java.util.Random;
import java.util.Scanner;

public class ResearchGameDef {
	public void researchdef() {
		System.out.println("Bienvenue dans le mode défenseur du Jeu de Recherche dans ce Jeu.\n Vous devez ici rentrer la combinaison"
				+ "et l'ordinateur va essayer de trouver la combinaison");
		Scanner scan = new Scanner(System.in);
		Random randomnum = new Random();
		String combinaison; int solution; int reponseprg;int verifreponseprg = 0;
		
		
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
		
		while(true) {
			reponseprg = randomnum.nextInt(10000);
			if(reponseprg > 999) {break;}
		}
		String reponsestr = Integer.toString(reponseprg);
		String[] tabreponseprg = reponsestr.split("");
		int indice = 0; int essai = 10;
		System.out.println("****" + combinaison);
partie : while(essai != 0) {
	System.out.print(" \nL'ordinateur a saisi :");
	for (String newreponse : tabreponseprg) {
		System.out.print(newreponse);
	}
				for (int nbboucle = 0; nbboucle < 4; nbboucle++) {
					try {
						int reponseprgbis = Integer.parseInt(tabreponseprg[indice]);
						int combinaisonbis = Integer.parseInt(tab[indice]);
						 if(reponseprgbis < combinaisonbis) {
							 int min = reponseprgbis;
							 int changeplus = randomnum.nextInt(9 - min + 1) + min;
							 tabreponseprg[indice] = Integer.toString(changeplus);
						 						indice ++;			}
						 else if(reponseprgbis > combinaisonbis) {
							 int max = reponseprgbis;
							 int changeminus = randomnum.nextInt(max - 0 + 1 )+ 0;
							 tabreponseprg[indice] = Integer.toString(changeminus);
						 									}
						 indice ++;
						 }
					catch (Exception e) {
		//				e.printStackTrace();
						scan.nextLine();
										}
				
		for(String j : tabreponseprg) {
			int x = 1000;
			verifreponseprg = Integer.parseInt(j)*x;
			x = x/10;
		}
		if (verifreponseprg == solution) {
			System.out.println("L'Ordinateur vous a battu ! :( ");break partie;
		}else {essai--;}System.out.println("\nIl reste "+essai+" essai(s)");
}	
	if(essai ==0) {
		System.out.println("L'Ordinateur n'a pas trouvé votre combinaison.\nVous remportez cette partie!");
	}
	}
}
	}
