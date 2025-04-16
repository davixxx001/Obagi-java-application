import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char choice;
        do {
            System.out.print("Enter a decimal number: ");
            double number = input.nextDouble();

            long rounded = (long) Math.floor(number + 0.5);

            System.out.printf("Original: %.2f, Rounded: %d%n", number, rounded);

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = input.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        input.close();
    }
}