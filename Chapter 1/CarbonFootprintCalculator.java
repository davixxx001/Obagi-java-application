import java.util.Scanner;

public class CarbonFootprintCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Driving
        System.out.print("Enter miles driven per year: ");
        double miles = input.nextDouble();
        System.out.print("Enter your car's fuel efficiency (MPG): ");
        double mpg = input.nextDouble();

        // Electricity
        System.out.print("Enter kWh used per month: ");
        double kWhPerMonth = input.nextDouble();

        // Constants
        final double CO2_PER_GALLON = 19.6; // pounds
        final double CO2_PER_KWH = 0.92;    // pounds
        final int MONTHS = 12;

        // Calculations
        double gallonsUsed = miles / mpg;
        double drivingCO2 = gallonsUsed * CO2_PER_GALLON;
        double electricityCO2 = kWhPerMonth * CO2_PER_KWH * MONTHS;
        double totalCO2 = drivingCO2 + electricityCO2;

        System.out.printf("Estimated Annual Carbon Footprint: %.2f pounds of CO2\n", totalCO2);
    }
}
