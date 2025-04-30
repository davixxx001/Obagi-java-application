import java.util.Scanner;

public class AsteriskPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBERS = 5;

        for (int i = 1; i <= NUMBERS; i++) {
            System.out.print("Enter number " + i + " (1 to 30): ");
            int number = input.nextInt();

            // Validate input
            while (number < 1 || number > 30) {
                System.out.print("Invalid input. Enter a number between 1 and 30: ");
                number = input.nextInt();
            }

            // Print asterisks
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}
