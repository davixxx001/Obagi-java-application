import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants for the calculation
        final double OVERTIME_RATE = 1.5; // Time and a half rate
        final int REGULAR_HOURS = 40; // Regular working hours in a week

        // Loop for three employees
        for (int i = 1; i <= 3; i++) {
            System.out.println("\nEnter details for Employee #" + i);

            // Input employee's details
            System.out.print("Enter hours worked by employee " + i + ": ");
            double hoursWorked = scanner.nextDouble();

            System.out.print("Enter hourly rate for employee " + i + ": ");
            double hourlyRate = scanner.nextDouble();

            // Calculate the gross pay
            double grossPay = 0;
            if (hoursWorked > REGULAR_HOURS) {
                // Regular pay for first 40 hours, overtime pay for the rest
                grossPay = (REGULAR_HOURS * hourlyRate) + ((hoursWorked - REGULAR_HOURS) * hourlyRate * OVERTIME_RATE);
            } else {
                // Regular pay for hours worked up to 40
                grossPay = hoursWorked * hourlyRate;
            }

            // Display the gross pay for the employee
            System.out.printf("Employee #%d's gross pay: $%.2f\n", i, grossPay);
        }

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}
