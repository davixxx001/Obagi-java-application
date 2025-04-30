import java.util.Scanner;

public class FibonacciCalculator {

    // Method to calculate the nth Fibonacci number
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n; // The first two Fibonacci numbers are 0 and 1
        }

        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b; // Sum the two previous numbers
            a = b;
            b = temp;
        }

        return b; // The nth Fibonacci number
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the position of Fibonacci number: ");
        int num = input.nextInt();

        System.out.println("The Fibonacci number at position " + num + " is " + fibonacci(num));

        input.close();
    }
}
