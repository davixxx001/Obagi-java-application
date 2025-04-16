import java.util.Scanner;

public class MileageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables to store total miles, total gallons, and trips count
        double totalMiles = 0;
        double totalGallons = 0;
        int tripCount = 0;

        while (true) {
            // Input miles driven for the trip
            System.out.print("Enter miles driven for trip (0 to quit): ");
            int milesDriven = scanner.nextInt();

            // Check if the sentinel value (0) is entered
            if (milesDriven == 0) {
                break;
            }

            // Input gallons used for the trip
            System.out.print("Enter gallons used for trip: ");
            int gallonsUsed = scanner.nextInt();

            // Calculate and display miles per gallon for the current trip
            double mpg = (double) milesDriven / gallonsUsed;
            System.out.printf("Miles per gallon for this trip: %.2f\n", mpg);

            // Update total miles and total gallons
            totalMiles += milesDriven;
            totalGallons += gallonsUsed;
            tripCount++;

            // Calculate and display the combined miles per gallon for all trips
            double combinedMpg = totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon for all trips: %.2f\n\n", combinedMpg);
        }

        System.out.println("Thank you for using the mileage calculator.");
        scanner.close();
    }
}
