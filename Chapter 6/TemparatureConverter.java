import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Fahrenheit to Celsius
    public static double celsius(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsiusTemp = celsius(fahrenheit);

        System.out.printf("Temperature in Celsius: %.2f\n", celsiusTemp);

        input.close();
    }
}
