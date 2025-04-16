import java.util.Random;
import java.util.Scanner;

public class CrapsGame {

    // Enum to represent the result of the coin flip
    public enum Coin {
        HEADS, TAILS
    }

    // Method to simulate rolling two dice and returning the sum
    public static int rollDice() {
        Random rand = new Random();
        int die1 = rand.nextInt(6) + 1; // Roll first die
        int die2 = rand.nextInt(6) + 1; // Roll second die
        return die1 + die2; // Return sum of dice
    }

    // Method to simulate the craps game
    public static void playCraps() {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        double bankBalance = 1000.0;
        double wager;

        // Prompt for wager
        System.out.println("Welcome to Craps! Your bank balance is $1000.");
        System.out.print("Enter your wager: $");
        wager = input.nextDouble();

        // Ensure wager is valid (less than or equal to bank balance)
        while (wager > bankBalance || wager <= 0) {
            System.out.print("Invalid wager. Please enter a valid wager (must be less than or equal to your bank balance): $");
            wager = input.nextDouble();
        }

        // Roll the dice
        int sum = rollDice();
        System.out.println("You rolled: " + sum);

        // Check win or loss
        if (sum == 7 || sum == 11) {
            bankBalance += wager;
            System.out.println("Congratulations! You win. Your new balance is $" + bankBalance);
        } else if (sum == 2 || sum == 3 || sum == 12) {
            bankBalance -= wager;
            System.out.println("Sorry, you lose. Your new balance is $" + bankBalance);
        } else {
            System.out.println("Roll again. The point is " + sum);
            // The player continues rolling until they win or lose
            int point = sum;
            while (true) {
                sum = rollDice();
                System.out.println("You rolled: " + sum);
                if (sum == point) {
                    bankBalance += wager;
                    System.out.println("Congratulations! You win. Your new balance is $" + bankBalance);
                    break;
                } else if (sum == 7) {
                    bankBalance -= wager;
                    System.out.println("Sorry, you lose. Your new balance is $" + bankBalance);
                    break;
                }
            }
        }

        // Check if bankBalance has become zero
        if (bankBalance <= 0) {
            System.out.println("Sorry. You busted!");
        }
    }

    public static void main(String[] args) {
        playCraps(); // Start the craps game
    }
}