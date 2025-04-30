public class AverageCalculator {

    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        
        System.out.println("Average of 4, 8, 10: " + average(4, 8, 10));
        System.out.println("Average of 1, 2, 3: " + average(1, 2, 3));
        System.out.println("Average of 0, 0, 0: " + average(0, 0, 0));
    }
}
