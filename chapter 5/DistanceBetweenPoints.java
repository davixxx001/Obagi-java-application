import java.util.Scanner;

public class DistanceBetweenPoints {

    // Method to calculate the distance between two points (x1, y1) and (x2, y2)
    public static double distance(double x1, double y1, double x2, double y2) {
        // Using the distance formula: distance = sqrt((x2 - x1)^2 + (y2 - y1)^2)
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input for the coordinates of the points
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        // Calculate and display the distance
        double dist = distance(x1, y1, x2, y2);
        System.out.printf("The distance between the points (%.2f, %.2f) and (%.2f, %.2f) is %.2f\n", x1, y1, x2, y2, dist);
        
        input.close();
    }
}