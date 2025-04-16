import java.util.Scanner;

public class GreatestDivisor {

    // Method to find the greatest common divisor (GCD) using Euclid's algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get two integers from the user
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        // Calculate the GCD
        int result = gcd(num1, num2);

        // Display the result
        System.out.println("The greatest common divisor (GCD) is: " + result);
    }
}