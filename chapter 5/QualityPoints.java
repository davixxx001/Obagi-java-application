import java.util.Scanner;

public class QualityPoints {

    // Method to determine quality points based on average
    public static int qualityPoints(double average) {
        if (average >= 90) {
            return 4;
        } else if (average >= 80) {
            return 3;
        } else if (average >= 70) {
            return 2;
        } else if (average >= 60) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get student's average score
        System.out.print("Enter the student's average score: ");
        double average = input.nextDouble();

        // Call the qualityPoints method and display the result
        int points = qualityPoints(average);
        System.out.println("The quality points for this average are: " + points);
    }
}