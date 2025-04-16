import java.util.Scanner;

public class EncryptDecrypt {
    
    // Method to encrypt a four-digit number
    public static int encrypt(int number) {
        int[] digits = new int[4];
        
        // Extract digits
        for (int i = 3; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        
        // Apply encryption formula
        for (int i = 0; i < 4; i++) {
            digits[i] = (digits[i] + 7) % 10;
        }
        
        // Swap first with third, second with fourth
        int temp = digits[0];
        digits[0] = digits[2];
        digits[2] = temp;
        
        temp = digits[1];
        digits[1] = digits[3];
        digits[3] = temp;
        
        // Construct encrypted number
        return digits[0] * 1000 + digits[1] * 100 + digits[2] * 10 + digits[3];
    }
    
    // Method to decrypt a four-digit number
    public static int decrypt(int number) {
        int[] digits = new int[4];
        
        // Extract digits
        for (int i = 3; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        
        // Swap first with third, second with fourth (reverse swap)
        int temp = digits[0];
        digits[0] = digits[2];
        digits[2] = temp;
        
        temp = digits[1];
        digits[1] = digits[3];
        digits[3] = temp;
        
        // Reverse encryption formula
        for (int i = 0; i < 4; i++) {
            digits[i] = (digits[i] + 10 - 7) % 10; // Ensures no negative values
        }
        
        // Construct decrypted number
        return digits[0] * 1000 + digits[1] * 100 + digits[2] * 10 + digits[3];
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a four-digit number to encrypt: ");
        int number = input.nextInt();
        
        if (number < 1000 || number > 9999) {
            System.out.println("Invalid input. Please enter a four-digit number.");
        } else {
            int encrypted = encrypt(number);
            System.out.println("Encrypted number: " + encrypted);
            
            int decrypted = decrypt(encrypted);
            System.out.println("Decrypted number: " + decrypted);
        }
        
        input.close();
    }
}

