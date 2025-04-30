import java.util.Scanner;

public class MultipleOf5Checker {

    // Method to check if a number is a multiple of 5
    public static boolean isMultipleOf5(int number) {
        return number % 5 == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        if (isMultipleOf5(num)) {
            System.out.println(num + " is a multiple of 5.");
        } else {
            System.out.println(num + " is not a multiple of 5.");
        }

        input.close();
    }
}
