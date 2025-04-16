import java.util.Scanner;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter current world population: ");
        long population = input.nextLong();

        System.out.print("Enter annual growth rate (e.g. 1.05 for 1.05%): ");
        double rate = input.nextDouble();

        System.out.println("\nYear\tPopulation\t\tIncrease");

        long originalPopulation = population;
        int doublingYear = -1;

        for (int year = 1; year <= 75; year++) {
            long increase = (long) (population * (rate / 100));
            population += increase;

            System.out.printf("%d\t%,d\t\t%,d%n", year, population, increase);

            if (doublingYear == -1 && population >= originalPopulation * 2) {
                doublingYear = year;
            }
        }

        if (doublingYear != -1) {
            System.out.printf("\nPopulation will double in year: %d%n", doublingYear);
        } else {
            System.out.println("\nPopulation will not double in 75 years at this rate.");
        }
    }
}