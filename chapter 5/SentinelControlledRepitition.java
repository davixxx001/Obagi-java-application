import java.util.Scanner;

public class SentinelControlledRepetition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.print("Enter an integer (-1 to end): ");
        int number = input.nextInt();

        while (number != -1) {
            sum += number;
            count++;

            System.out.print("Enter an integer (-1 to end): ");
            number = input.nextInt();
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Total sum: " + sum);
            System.out.println("Count: " + count);
            System.out.printf("Average: %.2f%n", average);
        } else {
            System.out.println("No numbers were entered.");
        }

        input.close();
    }
}