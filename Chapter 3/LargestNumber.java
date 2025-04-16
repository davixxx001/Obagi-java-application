import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int number, largest = Integer.MIN_VALUE;

        while (counter <= 10) {
            System.out.print("Enter number " + counter + ": ");
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.println("Largest number is: " + largest);
    }
}