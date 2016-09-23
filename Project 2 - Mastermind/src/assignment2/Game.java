/*  * EE422C Project 2 (Mastermind) submission by  
 * Alfonso Galindo 
 * ag49477 
 * Slip days used: 0 
 * Fall 2016  
 */

package assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	int guessNumber;
	String[] colors;
	int pegNumber;
	String secretCode;
	boolean testmode;

	public Game(boolean testmode) {///generates a game object with all needed info from GameConfiguration class
		// if testmode is true show code
		this.guessNumber = GameConfiguration.guessNumber;
		this.colors = GameConfiguration.colors;
		this.pegNumber = GameConfiguration.pegNumber;
		this.secretCode = SecretCodeGenerator.getInstance().getNewSecretCode();
		// hard coded secret
		// this.secretCode = "BGGP";
		// hard coded secret
		this.testmode = testmode;
	}
	/**
	 * This method initializes values for the game as well asks for imput from player
	 * Once we have input we process input
	 * 
	 * @param sc
	 *            is the scanner object that is needed to get input from the keyboard

	 * @return N/A
	 */
	public void runGame(Scanner sc) {

		GameFeedback.makeCode(testmode, secretCode);
		int guesses = guessNumber; // use as counter
		ArrayList<String> history = new ArrayList<String>();
		String newguess;
		// use checkValid[1] as a flag
		int[] checkValid = { guesses, 1 };
		while (checkValid[0] > 0) {
			// make a check to not display guesses left after an invalid output.
			if (checkValid[1] == 1) {
				GameFeedback.guessesLeft(checkValid[0]);
			}
			GameFeedback.nextGuess();
			newguess = PlayerInput.getInput(sc);

			checkValid = GameFeedback.processInput(newguess, secretCode, checkValid, colors, history);
			// returns array with guesses left and whether the input was valid;
			checkValid[0] -= 1;

			if (checkValid[0] == 0) {// out of guesses? You lose!
				GameFeedback.youLose(newguess);
				return;
			}

		}

	}
}
