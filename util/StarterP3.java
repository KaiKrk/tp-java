package fr.kaiqiang.util;

import java.util.Scanner;

public class StarterP3 {
		Scanner scan = new Scanner(System.in);
		ResearchGame research = new ResearchGame();
		ResearchGameDef researchdef = new ResearchGameDef();
		public void start() {
			String welcome = "-------------------------------------\n";
			welcome += "***Bienvenue dans le Jeu***\n";
			
			System.out.println(welcome);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				
			
			boucle : while(true) {
				String choice = "Choisissez votre jeu\n\n";
				choice += "1/Pour le Jeu de Recherche\n2/Pour le Masterming\n";
				System.out.println(choice);
				
				try {
					int game = scan.nextInt();
					
					switch (game) {
						case 1:
							//research.research();
							researchdef.researchdef();
							break boucle;
						case 2:
							MastermindGame.mastermind();
							break boucle;
					}
				}
				catch (Exception e) {
//					e.printStackTrace();
					scan.nextLine();
				}
			}
			
			System.out.print("Voulez vous recommencer ? (O/n) ");
			if (!scan.next().equals("n")) start();
			else System.out.println("Au revoir");
		}
	

}
