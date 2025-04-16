import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    // Method to play the game
    public static void playGame() {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(1000) + 1; // Random number between 1 and 1000
        int userGuess = 0;
        Scanner input = new Scanner(System.in);

        while (userGuess != numberToGuess) {
            System.out.print("Guess a number between 1 and 1000: ");
            userGuess = input.nextInt();

            if (userGuess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Congratulations. You guessed the number!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playAgain = "yes";

        while (playAgain.equalsIgnoreCase("yes")) {
            playGame();
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = input.next();
        }

        System.out.println("Thanks for playing!");
        input.close();
    }
}