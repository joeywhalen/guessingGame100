package guessingGame100;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner userInput = new Scanner(System.in);
		int rand = 0;
		while (true) {
			rand = random.nextInt(101);
			if(rand !=0) break;
		}
		
		System.out.println("Guess a number between 1 and 100.");
		int guessRand = Integer.parseInt(userInput.nextLine());
		if (rand == guessRand) {
			System.out.println("Wow!  That's amazing!");
		}	else if (rand == guessRand + 1 || rand == guessRand + 2 || rand == guessRand + 3
				|| rand == guessRand + 4 || rand == guessRand + 5 || rand == guessRand - 1
				|| rand == guessRand - 2 || rand == guessRand - 3 || rand == guessRand - 4
				|| rand == guessRand - 5) {
				System.out.println("Oh!  That was close");
		}	else {
			System.out.println("Nope!  The number was");
			System.out.println(rand);
	}
  }
}
