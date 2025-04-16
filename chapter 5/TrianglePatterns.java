public class TrianglePatterns {
    public static void main(String[] args) {
        int rows = 5;

        System.out.println("Pattern A");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nPattern B");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nPattern C");
        for (int i = 1; i <= rows; i++) {
            for (int space = rows - i; space > 0; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nPattern D");
        for (int i = rows; i >= 1; i--) {
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}