public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0;

        System.out.printf("%-8s%-8s%-20s%n", "Rate", "Year", "Amount on Deposit");

        for (int ratePercent = 5; ratePercent <= 10; ratePercent++) {
            double rate = ratePercent / 100.0;

            for (int year = 1; year <= 10; year++) {
                double amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%-8d%-8d$%-19.2f%n", ratePercent, year, amount);
            }

            System.out.println(); // extra line between each rate group
        }
    }
}