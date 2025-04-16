import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberWithGuesses {

    // Method to play the game with guess count
    public static void playGame() {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(1000) + 1; // Random number between 1 and 1000
        int userGuess = 0;
        int guessCount = 0;
        Scanner input = new Scanner(System.in);

        while (userGuess != numberToGuess) {
            System.out.print("Guess a number between 1 and 1000: ");
            userGuess = input.nextInt();
            guessCount++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Congratulations. You guessed the number!");
                if (guessCount <= 10) {
                    System.out.println("Either you know the secret or you got lucky!");
                } else {
                    System.out.println("You should be able to do better!");
                }

                if (guessCount == 10) {
                    System.out.println("Aha! You know the secret!");
                }
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