public class FactorialCalculator{
	public static void main(String[] args){
		System.out.printf("%-5s%-25s%n", "N","Factorial of N");
		for (int i = 1;
		i <= 20; i++){
			System.out.printf("%-5d%-25d%n",i,factorial(i));
		}
		System.out.println("\nNote:Calculating 100! with long will overflow because result exceeds the mass value of long.");
	}
	public static long factorial(int n){
		long result = 1;
		for (int i = 1; i <= n; i++){
			result *= i;
		}
		return result;
	}
}