public class FacebookGrowth {
    public static void main(String[] args) {
        double users = 1_000_000_000; // 1 billion
        double growthRate = 0.04; // 4%
        int monthsTo1_5B = 0;
        int monthsTo2B = 0;

        double currentUsers = users;

        while (currentUsers < 2_000_000_000) {
            currentUsers *= (1 + growthRate);
            monthsTo2B++;

            if (monthsTo1_5B == 0 && currentUsers >= 1_500_000_000) {
                monthsTo1_5B = monthsTo2B;
            }
        }

        System.out.println("Months to reach 1.5 billion users: " + monthsTo1_5B);
        System.out.println("Months to reach 2 billion users: " + monthsTo2B);
    }
}