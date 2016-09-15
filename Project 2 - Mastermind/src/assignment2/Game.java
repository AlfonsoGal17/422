/*  * EE422C Project 2 (Mastermind) submission by 
 * Replace <...> with your actual data.  
 * Alfonso Galindo 
 * ag49477 
 * Slip days used: <0>  
 * Fall 2016  
 */

package assignment2;

import java.util.Scanner;

public class Game {
	int guessNumber;
	String[] colors;
	int pegNumber;
	String secretCode;
	boolean testmode;
	public Game(boolean testmode){
		//if testmode is true show code
		this.guessNumber = GameConfiguration.guessNumber;
		this.colors = GameConfiguration.colors;
		this.pegNumber = GameConfiguration.pegNumber;
		this.secretCode = SecretCodeGenerator.getInstance().getNewSecretCode();
		this.testmode = testmode;
	}
	public void runGame(Scanner sc){
		System.out.println("We are here");
		GameFeedback.makeCode(testmode, secretCode);
		int guesses = guessNumber; //use as counter
		int pegs = pegNumber;		//use as counter
		String newguess;
		while(guesses > 0){
			GameFeedback.guessesLeft(guesses);
			GameFeedback.nextGuess();
			newguess = PlayerInput.getInput(sc);
			if(secretCode.equals(newguess)){
				System.out.println("CHECK");
			}
			//now you need to check that it is a valid input
			
		}
		
		///last thing you did was add secret code cool beans :)
	}
}
