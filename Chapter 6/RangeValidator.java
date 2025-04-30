import java.util.Scanner;

public class RangeValidator {

    // Method to check if a number is within a given range (inclusive)
    public static boolean isInRange(int number, int lower, int upper) {
        return number >= lower && number <= upper;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.print("Enter the lower bound of the range: ");
        int lower = input.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upper = input.nextInt();

        if (isInRange(number, lower, upper)) {
            System.out.println(number + " is within the range.");
        } else {
            System.out.println(number + " is not within the range.");
        }

        input.close();
    }
}
