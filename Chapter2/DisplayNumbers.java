

public class DisplayNumbers {
    public static void main(String[] args) {

        // (a) Using one System.out.println statement
        System.out.println("Using one System.out.println statement:");
        System.out.println("1 2 3 4");
        System.out.println(); // Blank line for readability

        // (b) Using four System.out.print statements
        System.out.println("Using four System.out.print statements:");
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4");
        System.out.println(); // Move to a new line
        System.out.println(); // Another blank line

        // (c) Using one System.out.printf statement
        System.out.println("Using one System.out.printf statement:");
        System.out.printf("%d %d %d %d%n", 1, 2, 3, 4);
    }
}
