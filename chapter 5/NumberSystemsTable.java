public class NumberSystemsTable {
    public static void main(String[] args) {
        // Print table header
        System.out.printf("%-10s%-10s%-10s%-10s%n", "Decimal", "Binary", "Octal", "Hex");

        // Print table rows from 1 to 256
        for (int i = 1; i <= 256; i++) {
            String binary = Integer.toBinaryString(i);
            String octal = Integer.toOctalString(i);
            String hex = Integer.toHexString(i).toUpperCase();

            System.out.printf("%-10d