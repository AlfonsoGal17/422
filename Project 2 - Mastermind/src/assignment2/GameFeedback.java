/*  * EE422C Project 2 (Mastermind) submission by  
 * Alfonso Galindo 
 * ag49477 
 * Slip days used: 0 
 * Fall 2016  
 */

package assignment2;

import java.util.ArrayList;
import java.util.Arrays;

public class GameFeedback {/**
	 * This method prints the welcome message to greet the player
	 *
	 * @param numGuesses
	 *            is the number of guesses the user has to win the game
	 * @return N/A
	 */
	public static void welcome(int numGuesses) {
		// Print welcome message

		System.out.print("Welcome to Mastermind. Here are the rules.\n\n"
				+ "The computer will think of a secret code. The code consists of 4\n" + "colored pegs.\n"
				+ "The pegs MUST be one of six colors: blue, green, orange, purple,\n"
				+ "red, or yellow. A color may appear more than once in the code. You\n"
				+ "try to guess what colored pegs are in the code and what order they\n"
				+ "are in. After you mae a valid guess the result (feedback) will be\n" + "displayed.\n"
				+ "The result consists of a black peg for each peg you have guessed\n"
				+ "exactly correct (color and position) in our guess. For each peg in\n"
				+ "the guess that is the correct color, but is out of position, you get\n"
				+ "a white peg. For each peg that is full incorrect, you get no\n" + "feedback.\n"
				+ "Only the first letter of the color is displayed. B for Blue, R for\n" + "Red, and so forth.\n"
				+ "When Entering guesses you only need to enter the first character of\n"
				+ "each color as a capital letter.\n\n" + "You have " + numGuesses
				+ " guesses to figure out the secret code or you lose the\n" + "game. Are you ready to play? (Y/N): ");

	}
	/**
	 * This method follows the greeting message, it will tell the user that it
	 * is generating a code.
	 * If game was passed testmode = ture, the secret code will be displayed.
	 * 
	 * @param testmode
	 *            is the boolean needed to check whether to print the secret code or not.
	 * @param secretcode
	 *            is the string that contains the answer to win the game
	 * @return N/A
	 */
	public static void makeCode(boolean testmode, String secretcode) {
		if (testmode == false) {
			System.out.print("\nGenerationg secret code ....\n\n");
		} else {
			System.out.print(
					"\nGenerating secret code ....    (for this example the secret code is " + secretcode + ") \n");

		}
	}
	/**
	 * This method prints out to the console the remaining guesses
	 * 
	 * @param attempts
	 *            is the number of guesses left
	 * @return N/A
	 */
	public static void guessesLeft(int attempts) {
		System.out.print("\nYou have " + attempts + " guesses left.\n");
	}
	/**
	 * This method prints a request for the user to type a guesss
	 *
	 * @param N/A
	 * 
	 * @return N/A
	 */
	public static void nextGuess() {
		System.out.print("What is your next guess?\n" + "Type the characters for your guess and press enter.\n"
				+ "Enter guess: ");
	}
	/**
	 * This method prints a message when you win game
	 * 
	 * @param guess
	 *            is the string with your winning guess
	 * @return N/A
	 */
	public static void youWin(String guess) {
		System.out.print(guess + " -> Result:  4 black pegs – You win!! \n");
	}
	/**
	 * This method prints a message when you lose game
	 * 
	 * @param guess
	 *            is the string with your last guess
	 * @return N/A
	 */
	public static void youLose(String guess) {
		System.out.print(guess + " -> Result:  (Sorry, you are out of guesses. You lose, boo-hoo.)\n");
	}
	/**
	 * This method prints a message to see if player wants to play again
	 * 
	 * @param N/A
	 * 
	 * @return N/A
	 */
	public static void again() {
		System.out.print("\nAre you ready for another game (Y/N): ");
	}
	/**
	 * This method prints a message when you enter an invalid input
	 * 
	 * @param guess
	 *            is the string with your invalid guess
	 * @return N/A
	 */
	public static void invalidGuess(String guess) {
		if (guess.equals("")) {
			System.out.print("     -> INVALID GUESS \n\n");
		} else {
			System.out.print(guess + " -> INVALID GUESS \n\n");
		}

	}
	/**
	 * This method prints a message when you enter a valid input
	 * It prints a result message corresponding to the guesses that you got right
	 * It also stores your valid guess to a history array for future reference
	 * 
	 * @param guess
	 *            is the string with your valid guess
	 * @param pegs
	 * 			  is an array containing your black and white pegs
	 * @param hist
	 * 			  is an ArrayList with your history of guesses
	 * @return N/A
	 */
	public static void validGuess(String guess, int[] pegs, ArrayList<String> hist) {
		// add guess to history arrya
		hist.add(guess + "		" + pegs[0] + "B_" + pegs[1] + "W\n");
		// no pegs
		if (pegs[0] == 0 && pegs[1] == 0) {
			System.out.print(guess + " -> Result: No pegs\n");
		}
		// 1 white peg
		if (pegs[0] == 0 && pegs[1] == 1) {
			System.out.print(guess + " -> Result:  1 white peg\n");
		}
		// multiple white pegs
		if (pegs[0] == 0 && pegs[1] > 1) {
			System.out.print(guess + " -> Result:  " + pegs[1] + " white pegs\n");
		}
		// 1 black peg
		if (pegs[0] == 1 && pegs[1] == 0) {
			System.out.print(guess + " -> Result:  1 black peg\n");
		}
		// multiple black pegs
		if (pegs[0] > 1 && pegs[1] == 0) {
			System.out.print(guess + " -> Result:  " + pegs[0] + " black pegs\n");
		}
		// 1 black and 1 white peg
		if (pegs[0] == 1 && pegs[1] == 1) {
			System.out.print(guess + " -> Result:  1 black peg, 1 white peg\n");
		}
		// 1 black pegs multiple white pegs
		if (pegs[0] == 1 && pegs[1] > 1) {
			System.out.print(guess + " -> Result:  " + pegs[0] + " black peg, " + pegs[1] + " white pegs\n");
		}
		// multiple black pegs and 1 white peg
		if (pegs[0] > 1 && pegs[1] == 1) {
			System.out.print(guess + " -> Result:  " + pegs[0] + " black pegs, " + pegs[1] + " white peg\n");
		}
		// multiple black and white pegs
		if (pegs[0] > 1 && pegs[1] > 1) {
			System.out.print(guess + " -> Result:  " + pegs[0] + " black pegs, " + pegs[1] + " white pegs\n");
		}

	}
	/**
	 * This method checks that all characters of your guess
	 * are within the valid choices of colors
	 * 
	 * @param colors
	 * 			  is the array with valid choices of colors
	 * @param n
	 * 			  is the length of colors array
	 * @param guess
	 *            is the string with your guess
	 * @return true if your input is valid otherwise false
	 */
	public static boolean find(String[] colors, int n, String guess) {

		// end precondition check
		// check if v is within the first n elements of array x and return index
		for (int i = 0; i < n; i++) {
			if (colors[i].equals(guess)) {
				return true;
			}

		}
		return false;// return this if v is not within the first n elements of
						// array x
	}

	/**
	 * This method checks your guess array against the answer array to find black and white pegs
	 * 
	 * @param newguess
	 *            is the array with your guess
	 * @param secretCode
	 * 			  is the array with the answer
	 * @return pegs the array containing the int values of the amount of black and white pegs
	 */
	public static int[] findInSecret(char[] newguess, char[] secretCode) {

		int[] pegs = { 0, 0 };
		
		// check black pegs
		for (int i = 0; i < newguess.length; i++) {
			if (newguess[i] == secretCode[i]) {
				pegs[0] += 1; // found a black peg
				secretCode[i] = '.';
				newguess[i] = ',';
			}
		}
		for (int i = 0; i < newguess.length; i++) {

			for (int j = 0; j < newguess.length; j++) {
				// if(secretCode[i] == '.'){break;}
				if (newguess[i] == secretCode[j]) {
					pegs[1] += 1;
					secretCode[j] = '.';
					newguess[i] = ',';
					break;
				}
			}


		}
		return pegs;
	}
	/**
	 * This method does the bulk of the work of processing the player's input by calling all other methods to
	 * ensure that your guess is valid, printing messages to the console as 
	 * needed
	 * 
	 * @param newguess
	 *            is the string with your guess
	 * @param secretCode
	 * 			  is the string with the answer
	 * @param checkValid
	 * 			  is used to keep track of valid input and guesses left
	 * @param colors
	 * 			  String array used to check guesses for valid inputs
	 * @return arrayN with guesses left and valid input check
	 */
	public static int[] processInput(String newguess, String secretCode, int[] checkValid, String[] colors,
			ArrayList<String> hist) {
		
		for(int i=0; i<newguess.length();i++){
			if(newguess.charAt(i) == ' '){
				
			}
			else {
				newguess = newguess.trim();
				break;
			}
		}
		


		if (newguess.equals("HISTORY")) {
			for (int i = 0; i < hist.size(); i++) {
				System.out.print(hist.get(i));
			}
			System.out.print("\n");
			checkValid[0] += 1;
			checkValid[1] = 0;
			return checkValid;
		}
		if (secretCode.equals(newguess)) { // check if you win right away
			youWin(newguess);
			checkValid[1] = 1;
			checkValid[0] = 0;
			return checkValid;
		} else {
			// check for valid input
			if(checkValid[0] ==1){
			return checkValid;
		}
			if (newguess.length() == secretCode.length()) {
				checkValid[1] = 1; // will count as guess
				// check if guesses are in colors array
				char[] guess = newguess.toCharArray();
				char[] code = secretCode.toCharArray();// should be colors array
				String g;
				boolean guessInColors = false; // use to signal that all colors
												// in guess are in colors array
				// array to count my pegs pegs[0] = black
				// 						  pegs[1] = white
				int[] pegs = { 0, 0 };
				// check if ALL colors of newguess are in colors;
				for (int i = 0; i < guess.length; i++) {
					g = Character.toString(guess[i]);
					guessInColors = find(colors, colors.length, g);
				}
				// if they are, check to see if they are in secret code now;
				if (guessInColors) {
					// System.out.println("all colors are in colors array");

					pegs = findInSecret(guess, code);
					validGuess(newguess, pegs, hist);

				} else {

					invalidGuess(newguess);
					checkValid[0] += 1;
					checkValid[1] = 0;
				}

			} else {
				// output invalid input
				invalidGuess(newguess);
				checkValid[0] += 1;
				checkValid[1] = 0;
			}
		}
		return checkValid;

	}
}
