import java.util.Scanner;

public class RoundingDecimalPlaces {

    public static long roundToInteger(double number) {
        return (long) Math.floor(number + 0.5);
    }

    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }

    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }

    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter a decimal number: ");
            double number = input.nextDouble();

            System.out.printf("Original: %.5f%n", number);
            System.out.printf("Rounded to Integer: %d%n", roundToInteger(number));
            System.out.printf("Rounded to Tenths: %.1f%n", roundToTenths(number));
            System.out.printf("Rounded to Hundredths: %.2f%n", roundToHundredths(number));
            System.out.printf("Rounded to Thousandths: %.3f%n", roundToThousandths(number));

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = input.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        input.close();
    }
}