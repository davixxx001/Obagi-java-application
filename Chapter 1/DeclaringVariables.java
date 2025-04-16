import java.util.Scanner;

public class DeclaringVariables {
    public static void main(String[] args) {
        // a) Declare variables
        int c, thisIsAVariable, q76354, number;

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // b) Prompt user to enter an integer
        System.out.print("Please enter an integer: ");

        // c) Input an integer and assign to variable value
        int value = input.nextInt();

        // Assign value to one of the declared variables for demonstration
        number = value;

        // d) Print "This is a Java program" on one line
        System.out.println("This is a Java program");

        // e) Print "This is a Java program" on two lines using printf
        System.out.printf("%s\n%s\n", "This is a Java", "program");

        // f) Check if number is not equal to 7
        if (number != 7) {
            System.out.println("The variable number is not equal to 7");
        }

        // Close the Scanner (good practice)
        input.close();
    }
}
