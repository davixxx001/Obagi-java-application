public class PrimeNumbers {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Not a prime
            }
        }
        return true; // Is a prime
    }

    public static void main(String[] args) {
        int count = 0;
        int upperLimit = 10000;

        System.out.println("Prime numbers less than " + upperLimit + ":");

        for (int i = 2; i < upperLimit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal prime numbers found: " + count);
    }
}