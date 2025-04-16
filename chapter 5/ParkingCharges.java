import java.util.Scanner;

public class ParkingCharges {

    public static double calculateCharges(double hours) {
        double charge = 2.0; // minimum charge

        if (hours > 3.0) {
            charge += Math.ceil(hours - 3.0) * 0.5;
        }

        if (charge > 10.0) {
            charge = 10.0; // max charge
        }

        return charge;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalHours = 0;
        double totalCharges = 0;

        System.out.print("Enter number of customers: ");
        int customers = input.nextInt();

        System.out.printf("%-10s%-10s%-10s%n", "Car", "Hours", "Charge");

        for (int i = 1; i <= customers; i++) {
            System.out.printf("Enter hours parked for Car %d: ", i);
            double hours = input.nextDouble();

            double charge = calculateCharges(hours);
            totalHours += hours;
            totalCharges += charge;

            System.out.printf("%-10d%-10.2f%-10.2f%n", i, hours, charge);
        }

        System.out.printf("%-10s%-10.2f%-10.2f%n", "TOTAL", totalHours, totalCharges);

        input.close();
    }
}