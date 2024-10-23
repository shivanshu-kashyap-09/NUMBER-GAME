package guessTheNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean bl  = true;
		int guessNum = 0;
		
		do {
		int randomNum = (int)(Math.random()*100) + 1;
		int score = 0;
		
		System.out.print("Guess the number : ");
		
		for(int i = 0 ; i < 7 ; i++) {
			score += 1;
		    guessNum = scan.nextInt();
		
		if(guessNum == randomNum) {
			System.out.println("Congragulation! you are find the correct number.");
			System.out.println("Score : "+score);
			break;
			
		}else if(guessNum > randomNum) {
			System.out.println("Guess the number less than "+guessNum);
			
		}else if(guessNum < randomNum) {
			System.out.println("Guess the number greater than "+guessNum);
		}
	  }
		if(guessNum != randomNum) {
			
			System.out.println("Try next time!!");
		}
		System.out.print("you want to play again (true/false) : ");
		bl = scan.nextBoolean();
		
	}while(bl == true);
   }
}
