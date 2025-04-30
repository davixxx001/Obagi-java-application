public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int limit = 1000;
        boolean[] isPrime = new boolean[limit];
        
        // Initialize the array with 'true' values
        for (int i = 2; i < limit; i++) {
            isPrime[i] = true;
        }

        // Apply the Sieve of Eratosthenes
        for (int i = 2; i * i < limit; i++) {
            if (isPrime[i]) {
                // Mark all multiples of i as non-prime
                for (int j = i * i; j < limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Print the prime numbers
        System.out.println("Prime numbers between 2 and 999:");
        for (int i = 2; i < limit; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
