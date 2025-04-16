import java.util.Scanner;

public class FairTaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] categories = {
            "Housing", "Food", "Clothing", "Transportation",
            "Education", "Health care", "Vacations"
        };

        double totalExpenses = 0;

        for (String category : categories) {
            System.out.print("Enter your monthly expense for " + category + ": $");
            double expense = input.nextDouble();
            totalExpenses += expense;
        }

        double fairTax = totalExpenses * 0.23;

        System.out.printf("%nYour total monthly expenses: $%.2f%n", totalExpenses);
        System.out.printf("Estimated FairTax (23%%): $%.2f%n", fairTax);

        input.close();
    }
}