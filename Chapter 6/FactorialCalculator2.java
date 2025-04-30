import java.util.Scanner;

public class FactorialCalculator2 {

    // Method to calculate the factorial of a number
    public static long factorial(int n) {
        if (n == 0) {
            return 1; // Factorial of 0 is 1
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; // Multiply each number from 1 to n
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("The factorial of " + num + " is " + factorial(num));

        input.close();
    }
}
