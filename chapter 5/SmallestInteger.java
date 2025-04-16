import java.util.Scanner;


public class SmallestInteger{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many numbers do you want to enter? ");
		int count = input.nextInt();
		
		int Smallest = Integer.MAX_VALUE;
		
		for(int i = 1; i <= count; i++){
			System.out.print("Enter integer #" + i + ": ");
			int num =
			input.nextInt();
			if (num < Smallest){
				Smallest = num;
			}
		}
		System.out.println("The smallest number is: " + Smallest);
	}
}
	