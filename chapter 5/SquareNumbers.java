import java.util.Scanner;

public class SquareNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter five numbers:");

        for (int i = 0; i < 5; i++) {
            int number = input.nextInt();
            int square = number * number;
            System.out.println(number + " squared is " + square);
        }
    }
}