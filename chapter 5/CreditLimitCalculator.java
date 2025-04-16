import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter account number (-1 to end): ");
            int accountNumber = input.nextInt();

            if (accountNumber == -1) {
                break;
            }

            System.out.print("Enter beginning balance: ");
            double beginningBalance = input.nextDouble();

            System.out.print("Enter total charges: ");
            double charges = input.nextDouble();

            System.out.print("Enter total credits: ");
            double credits = input.nextDouble();

            System.out.print("Enter credit limit: ");
            double creditLimit = input.nextDouble();

            double newBalance = beginningBalance + charges - credits;

            System.out.printf("New balance: $%.2f%n", newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Account number: " + accountNumber);
                System.out.println("Credit limit: $" + creditLimit);
                System.out.println("New balance: $" + newBalance);
                System.out.println("Credit limit exceeded.\n");
            } else {
                System.out.println("Credit limit not exceeded.\n");
            }
        }

        input.close();
    }
}