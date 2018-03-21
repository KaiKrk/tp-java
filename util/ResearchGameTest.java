package fr.kaiqiang.util;
import java.util.Random;
import java.util.Scanner;
public class ResearchGameTest {
	public void research() {
		Scanner scan = new Scanner(System.in);
		Random randomnum = new Random();
		int essai = 4;int newcombinaison = 0 ;
		
			int areponse = randomnum.nextInt(10);
			int breponse = randomnum.nextInt(10);
			int creponse = randomnum.nextInt(10);
			int dreponse = randomnum.nextInt(10);
		
		
		int reponse = areponse*1000 +breponse *100 +creponse *10 +dreponse;
		
		String reponsebis = Integer.toString(reponse);
		String tabreponse  [] = reponsebis.split(""); 
		String combinaison ;
		
		String annonce = "Bienvenue dans le Jeu de Recherche\n Le but est de trouver la combinaison secrete, qui se compose de 4 chiffres\n "
				+ "Des indices vous permetrons de trouver la bonne combinaison + ou - et si le chiffre est le bon = sera affiché\n";
		System.out.println(annonce + "Selectionnez la difficulté : \n1)Facile = 8 essais\n2)Normal = 6 essais\n3)Dificile = 4 essais");
		int niveau = scan.nextInt();
			switch(niveau) {
			
			case 1 : essai = 8; System.out.println("Mode Facile : " + essai + "essais");break;
			case 2 : essai = 6; System.out.println("Mode Normal : " + essai +"essais");break;
			case 3 : essai = 4; System.out.println("Mode Difficile :" + essai + "essais");break;
			
			default : essai = 10;System.out.println("Mode Facile : " + essai + "essais");
			}
		
 partie : while(essai != 0) {	
	code : while(true) {
		combinaison = scan.nextLine();
		System.out.println("Veuillez rentrer votre 1ere combinaison de 4 chiffres : ");
		try {
			
			if (combinaison.length() == 4) { 
			newcombinaison =Integer.parseInt(combinaison);
			break code;}
		}
			
		
		catch (Exception e) {
//			e.printStackTrace();
			scan.nextLine();
		}
		
	}
		String[] tab = combinaison.split("");
		int a = Integer.parseInt(tab[0]);
		int b = Integer.parseInt(tab[1]);
		int c = Integer.parseInt(tab[2]);
		int d = Integer.parseInt(tab[3]);
					System.out.print("Voici l'indice : ");
					
					if (a < areponse) {
						System.out.print("+");
					}
					else if(a > areponse) {
						System.out.print("-");
					}
					else System.out.print("=");
					
					
					if (b < breponse) {
						System.out.print("+");
					}
					else if (b > breponse) {
						System.out.print("-");
					}
					else System.out.print("=");
					
					
					if (c < creponse) {
						System.out.print("+");
					}
					else if (c > creponse) {
						System.out.print("-");
					}
					else System.out.print("=");
					
					
					if (d < dreponse) {
						System.out.print("+");
					}
					else if (d > dreponse) {
						System.out.print("-");
					} else System.out.print("=");
					System.out.println();
			if(newcombinaison == reponse) { essai = 0; System.out.println("Vous avez réussi !!!\nFélicitations!!!");}
			else {
		essai --;
		System.out.println("Nombre d'essai restant : " + essai);
					}
 }
		if(essai == 0) {
		System.out.println("\n La Solution est : " + reponse);
		}

		
		
	
	}
}
