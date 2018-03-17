package fr.kaiqiang.util;

import java.util.Random;

public class ResearchGame {
			static Random randomnum = new Random();
	public static int randomnumber() {
		int number = randomnum.nextInt(10000);
		while(true) {
		if (number > 999 ) {break;} else {ResearchGame.randomnumber();}
		}
		return number;
	
	}
	
	private static final int solution = randomnumber();		
	
	
	

	
	
	
	
	public static void research() {
				System.out.println("Bienvenue dans le Jeu de Recherche");
				System.out.println(solution);
			}
}
