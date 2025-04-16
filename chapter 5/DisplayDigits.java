import java.util.Scanner;

public class DisplayDigits {

    public static int quotient(int a, int b) {
        return a / b;
    }

    public static int remainder(int a, int b) {
        return a % b;
    }

    public static void displayDigits(int number) {
        String digits = Integer.toString(number);
        for (int i = 0; i < digits.length(); i++) {
            System.out.print(digits.charAt(i) + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 1 and 99999: ");
        int number = input.nextInt();

        if (number >= 1 && number <= 99999) {
            displayDigits(number);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 99999.");
        }
    }
}