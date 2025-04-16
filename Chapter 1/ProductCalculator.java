import java.util.Scanner;

public class ProductCalculator {
    public static void main(String[] args) {
        // a) Program purpose
        System.out.println("This program calculates the product of three integers.");

        // b) Create Scanner object
        Scanner input = new Scanner(System.in);

        // c) Declare variables
        int x, y, z, result;

        // d, f, h) Prompt the user
        // e, g, i) Read inputs
        System.out.print("Enter first integer: ");
        x = input.nextInt();

        System.out.print("Enter second integer: ");
        y = input.nextInt();

        System.out.print("Enter third integer: ");
        z = input.nextInt();

        // j) Compute product
        result = x * y * z;

        // k) Display result
        System.out.printf("Product is %d\n", result);

        // Close Scanner
        input.close();
    }
}
