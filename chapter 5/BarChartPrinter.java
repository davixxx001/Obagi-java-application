import java.util.Scanner;

public class BarChartPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter five numbers (each between 1 and 30):");

        for (int i = 0; i < 5; i++) {
            int number = input.nextInt();

            if (number < 1 || number > 30) {
                System.out.println("Please enter a number between 1 and 30.");
                i--; // repeat this iteration
                continue;
            }

            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}