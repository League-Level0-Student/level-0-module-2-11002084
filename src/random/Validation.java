//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(10);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if(randomNumber==1){
			System.out.println("Jolteon (Speed)");
		}
		if(randomNumber==2){
			System.out.println("Flareon (Solarflare)");
		}
		if(randomNumber==3){
			System.out.println("Vaporeon (Crystal)");
		}
		if(randomNumber==4){
			System.out.println("Umbreon (Black)");
		}
		if(randomNumber==5){
			System.out.println("Espeon (Pearl)");
		}
		if(randomNumber==6){
			System.out.println("Leafeon (Leaf)");
		}
		if(randomNumber==7){
			System.out.println("Glaceon (Lazuli)");
		}
		if(randomNumber==8){
			System.out.println("Sylveon (Silvia)");
		}
		if(randomNumber==9){
			System.out.println("Eevee (Sunshine)");
		}
		if(randomNumber==10){
			System.out.println("Eeveelution Squad");
		}
	
	if(randomNumber==0){
		System.out.println("PKM-150");
	}
	}
}
	
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	

