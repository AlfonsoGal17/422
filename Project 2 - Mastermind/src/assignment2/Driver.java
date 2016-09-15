/*  * EE422C Project 2 (Mastermind) submission by 
 * Replace <...> with your actual data.  
 * Alfonso Galindo 
 * ag49477 
 * Slip days used: <0>  
 * Fall 2016  
 */

package assignment2;

import java.util.Scanner;

public class Driver {
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
		// Greet the palyer
		GameFeedback.welcome();
		//

		while (true) {//loop till we get either Y or N
			String ready = PlayerInput.getInput(sc);
			if (ready.equals("Y")) {
				// create game object
				if (testmode == true) {
					Game newGame = new Game(true); //make object that will show code
					newGame.runGame(sc);			//run the game. Guessing happens here
				}
				else{
					Game newGame = new Game(false);//make object that will NOT show code
					newGame.runGame(sc);			//run the game. Guessing happens here
				
				}

			} else if (ready.equals("N")) {
				break; // terminates game as player does not want to play.
			}
			break;

		}
	}
}
