import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Enter five numbers between 1 and 30:");

        for (int i = 0; i < 5; i++) {
            number = input.nextInt();

            if (number < 1 || number > 30) {
                System.out.println("Number must be between 1 and 30.");
                i--; // repeat the loop for invalid input
                continue;
            }

            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}