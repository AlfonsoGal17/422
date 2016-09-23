/*  * EE422C Project 2 (Mastermind) submission by  
 * Alfonso Galindo 
 * ag49477 
 * Slip days used: 0 
 * Fall 2016  
 */

package assignment2;

import java.util.Scanner;

public class Driver {
	/**
	 * This main method creates a game if player is ready to play.
	 * 
	 * @param args
	 *            is used to check whether the game will fun in test mode
	 * @return exits when player is dont playing
	 */
	public static void main(String[] args) {
		
		// initialize scanner
		Scanner sc = new Scanner(System.in);

		//
		// check test mode
		boolean testmode;
		if (args.length == 0) {
			testmode = false;
		} else if (args[0].equals("1")) {
			testmode = true;
		} else {
			testmode = false;
		}
		// Greet the player
		GameFeedback.welcome(GameConfiguration.guessNumber);
		//

		while (true) {// loop till we get either Y or N
			String ready = PlayerInput.getInput(sc);
			if (ready.equals("Y")) {
				// create game object
				if (testmode == true) {
					Game newGame = new Game(true); // make object that will show
													// code
					newGame.runGame(sc); // run the game. Guessing happens here
					GameFeedback.again(); // ask if player wants to play again
					continue; // loop back to start again
				} else {
					Game newGame = new Game(false);// make object that will NOT
													// show code
					newGame.runGame(sc); // run the game. Guessing happens here
					GameFeedback.again(); // ask if player wants to play again
					continue; // loop back to start again

				}

			} else if (ready.equals("N")) {
				break; // terminates game as player does not want to play.
			}

		}
	}
}
