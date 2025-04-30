import java.util.Scanner;

public class FactorialCalculator {

    // Method to calculate the factorial of a number
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Factorial of 0 or 1 is 1
        } else {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("The factorial of " + num + " is: " + factorial(num));

        input.close();
    }
}
