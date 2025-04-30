import java.util.Scanner;

public class InvestmentCalculator {

    // Method to calculate future investment value
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter annual interest rate (e.g., 5 for 5%): ");
        double annualRate = input.nextDouble();
        double monthlyRate = annualRate / 100 / 12;

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double futureValue = futureInvestmentValue(amount, monthlyRate, years);

        System.out.printf("Accumulated value is $%.2f\n", futureValue);

        input.close();
    }
}
