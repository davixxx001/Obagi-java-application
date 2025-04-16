import java.util.Scanner;

public class IntegerCalculator{
	public static void main(String[] args){
		//Calculating the product of three integers
		Scanner input = new Scanner(System.in);
		int x,a,z, result;

		System.out.print("Enter first integer: ");
		x = input.nextInt();

		System.out.print("Enter second integer: ");
		a = input.nextInt();

		System.out.print("Enter third integer: ");
		z = input.nextInt();

		result = x*a*z;

		System.out.printf("Product is %d%n",result);
		
		input.close();
	}

}