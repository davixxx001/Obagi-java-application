import java.util.Scanner;

public class SalesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalSales = 0.0;

        System.out.println("Enter product number (1–5) and quantity sold (or 0 to quit):");

        while (true) {
            int product = input.nextInt();

            if (product == 0) break;

            int quantity = input.nextInt();
            double price = 0.0;

            switch (product) {
                case 1:
                    price = 2.98;
                    break;
                case 2:
                    price = 4.50;
                    break;
                case 3:
                    price = 9.98;
                    break;
                case 4:
                    price = 4.49;
                    break;
                case 5:
                    price = 6.87;
                    break;
                default:
                    System.out.println("Invalid product number.");
                    continue;
            }

            totalSales += price * quantity;
        }

        System.out.printf("Total retail value of all products sold: $%.2f%n", totalSales);
    }
}