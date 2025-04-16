import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] questions = {
            "1. What gas is most responsible for global warming?\n1. Oxygen\n2. Methane\n3. Carbon Dioxide\n4. Nitrogen",
            "2. What is a common sign of global warming?\n1. Rising sea levels\n2. Decreased wildfires\n3. Increased glaciers\n4. Colder summers",
            "3. Which of these is a renewable energy source?\n1. Coal\n2. Oil\n3. Wind\n4. Natural gas",
            "4. What organization shared the 2007 Nobel Peace Prize with Al Gore?\n1. NASA\n2. IPCC\n3. EPA\n4. WHO",
            "5. What is a common argument from global warming skeptics?\n1. It is human-caused\n2. It is a natural cycle\n3. It's caused by solar panels\n4. There's no such thing as climate"
        };

        int[] answers = {3, 1, 3, 2, 2};
        int correct = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer (1-4): ");
            int userAnswer = input.nextInt();

            if (userAnswer == answers[i]) {
                correct++;
            }
            System.out.println();
        }

        // Result
        System.out.println("You got " + correct + " out of 5 correct.");

        if (correct == 5) {
            System.out.println("Excellent!");
        } else if (correct == 4) {
            System.out.println("Very good!");
        } else {
            System.out.println("Time to brush up on your knowledge of global warming.");
            System.out.println("Here are some helpful resources:");
            System.out.println("- https://climate.nasa.gov");
            System.out.println("- https://skepticalscience.com");
            System.out.println("- https://www.ipcc.ch");
        }

        input.close();
    }
}