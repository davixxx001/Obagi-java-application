import java.util.Scanner;

public class SalesCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to hold the number of salespeople in each salary range
        int[] salaryRanges = new int[9]; // 9 salary ranges

        while (true) {
            System.out.print("Enter salesperson's gross sales (-1 to end): ");
            double sales = scanner.nextDouble();

            if (sales == -1) break;

            int salary = (int)(200 + 0.09 * sales);

            int index;
            if (salary >= 1000) {
                index = 8;
            } else {
                index = (salary - 200) / 100;
            }

            salaryRanges[index]++;
        }

        System.out.println("\nSalary Range\tNumber of Salespeople");
        System.out.println("-----------------------------------");
        System.out.printf("$200-299\t\t%d\n", salaryRanges[0]);
        System.out.printf("$300-399\t\t%d\n", salaryRanges[1]);
        System.out.printf("$400-499\t\t%d\n", salaryRanges[2]);
        System.out.printf("$500-599\t\t%d\n", salaryRanges[3]);
        System.out.printf("$600-699\t\t%d\n", salaryRanges[4]);
        System.out.printf("$700-799\t\t%d\n", salaryRanges[5]);
        System.out.printf("$800-899\t\t%d\n", salaryRanges[6]);
        System.out.printf("$900-999\t\t%d\n", salaryRanges[7]);
        System.out.printf("$1000 and over\t%d\n", salaryRanges[8]);
    }
}