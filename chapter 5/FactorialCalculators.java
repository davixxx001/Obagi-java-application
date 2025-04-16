import java.util.Scanner;

public class FactorialCalculators {

    // Method to calculate factorial
    public static long factorial(int number) {
        long result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int num = input.nextInt();

        if (num < 0) {
            System.out.println("Invalid input. Number must be non-negative.");
        } else {
            System.out.println("Factorial of " + num + " is " + factorial(num));
        }

        input.close();
    }
}