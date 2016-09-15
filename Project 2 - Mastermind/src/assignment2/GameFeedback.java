/*  * EE422C Project 2 (Mastermind) submission by 
 * Replace <...> with your actual data.  
 * Alfonso Galindo 
 * ag49477 
 * Slip days used: <0>  
 * Fall 2016  
 */

package assignment2;

public class GameFeedback {
	public static void welcome(){
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
				+ "each color as a capital letter.\n\n"
				+ "You have 12 guesses to figure out the secret code or you lose the\n"
				+ "game. Are you ready to play? (Y/N): ");

	}
	public static void makeCode(boolean testmode, String secretcode){
		if(testmode == false){
		System.out.print("\nGenerationg secret code ....\n\n");
		}
		else {
			System.out.print("\nGenerating secret code ....    (for this example the secret code is " + secretcode+ ") \n");
		   
		}
	}

	public static void guessesLeft(int attempts){
		System.out.print("You have " + attempts + " guesses left.\n");
	}
	public static void nextGuess(){
		System.out.print("What is your next guess?\n"
				+ "Type the characters for your guess and press enter.\n"
				+ "Enter guess: ");
	}
}
