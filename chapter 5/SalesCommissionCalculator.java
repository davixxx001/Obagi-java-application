import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Base salary and commission rate
        final double BASE_SALARY = 200.0;
        final double COMMISSION_RATE = 0.09;

        while (true) {
            System.out.print("Enter gross sales (-1 to end): ");
            double grossSales = input.nextDouble();

            if (grossSales == -1) {
                break;
            }

            double earnings = BASE_SALARY + (COMMISSION_RATE * grossSales);
            System.out.printf("Salesperson's earnings: $%.2f%n%n", earnings);
        }

        input.close();
    }
}