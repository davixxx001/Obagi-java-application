import java.util.Scanner;

public class CreditLimitChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables for input and checks
        String accountNumber;
        double beginningBalance, totalCharges, totalCredits, allowedCreditLimit, newBalance;

        // Input: Number of customers to check
        System.out.print("Enter the number of customers: ");
        int numCustomers = scanner.nextInt();
        scanner.nextLine();  // Consume newline character left by nextInt()

        // Loop through each customer
        for (int i = 1; i <= numCustomers; i++) {
            System.out.println("\nProcessing customer #" + i);
            
            // Input customer details
            System.out.print("Enter account number: ");
            accountNumber = scanner.nextLine();

            System.out.print("Enter beginning balance: ");
            beginningBalance = scanner.nextDouble();

            System.out.print("Enter total charges this month: ");
            totalCharges = scanner.nextDouble();

            System.out.print("Enter total credits this month: ");
            totalCredits = scanner.nextDouble();

            System.out.print("Enter allowed credit limit: ");
            allowedCreditLimit = scanner.nextDouble();

            // Calculate the new balance
            newBalance = beginningBalance + totalCharges - totalCredits;

            // Output whether the credit limit is exceeded
            System.out.printf("\nAccount Number: %s\n", accountNumber);
            System.out.printf("Beginning Balance: $%.2f\n", beginningBalance);
            System.out.printf("Total Charges: $%.2f\n", totalCharges);
            System.out.printf("Total Credits: $%.2f\n", totalCredits);
            System.out.printf("Allowed Credit Limit: $%.2f\n", allowedCreditLimit);
            System.out.printf("New Balance: $%.2f\n", newBalance);

            if (newBalance > allowedCreditLimit) {
                System.out.println("Credit limit exceeded!\n");
            } else {
                System.out.println("Credit limit not exceeded.\n");
            }

            // Consume the remaining newline character
            scanner.nextLine();
        }

        // Close the scanner
        scanner.close();
        System.out.println("Thank you for using the credit limit checker.");
    }
}
