import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        // This program performs a sample payroll calculation.

        // Create Scanner for user input
        Scanner input = new Scanner(System.in);

        // Input section
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();

        System.out.print("Enter hours worked this week: ");
        double hours = input.nextDouble();

        System.out.print("Enter hourly wage: $");
        double wage = input.nextDouble();

        // Calculation
        double grossPay = hours * wage;

        // Output section
        System.out.println("\n--- Payroll Summary ---");
        System.out.println("Employee: " + name);
        System.out.printf("Hours Worked: %.2f\n", hours);
        System.out.printf("Hourly Wage: $%.2f\n", wage);
        System.out.printf("Gross Pay: $%.2f\n", grossPay);

        // Close Scanner
        input.close();
    }
}
