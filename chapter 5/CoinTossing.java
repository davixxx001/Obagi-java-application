import java.util.Random;
import java.util.Scanner;

public class CoinTossing {

    // Enum for coin sides
    enum Coin {
        HEADS, TAILS
    }

    // Method to simulate the coin flip
    public static Coin flip() {
        Random rand = new Random();
        // Randomly return HEADS or TAILS
        return rand.nextBoolean() ? Coin.HEADS : Coin.TAILS;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int headsCount = 0;
        int tailsCount = 0;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Toss Coin");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            if (choice == 1) {
                // Toss the coin and count the result
                Coin result = flip();
                if (result == Coin.HEADS) {
                    headsCount++;
                    System.out.println("Result: HEADS");
                } else {
                    tailsCount++;
                    System.out.println("Result: TAILS");
                }

                // Display the current tally
                System.out.println("Heads count: " + headsCount);
                System.out.println("Tails count: " + tailsCount);
            } else if (choice == 2) {
                // Exit the program
                System.out.println("Exiting the program...");
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }

        input.close();
    }
}