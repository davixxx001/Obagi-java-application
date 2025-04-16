import java.util.*;

public class GenderNeutralizer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a paragraph:");
        String paragraph = input.nextLine();

        // Map of gender-specific words to neutral replacements
        Map<String, String> genderMap = new HashMap<>();
        genderMap.put("wife", "spouse");
        genderMap.put("husband", "spouse");
        genderMap.put("man", "person");
        genderMap.put("woman", "person");
        genderMap.put("son", "child");
        genderMap.put("daughter", "child");

        String[] words = paragraph.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // Remove punctuation for matching
            String cleanWord = word.toLowerCase().replaceAll("[^a-z]", "");
            String punctuation = word.replaceAll("[a-zA-Z]", "");

            if (genderMap.containsKey(cleanWord)) {
                result.append(genderMap.get(cleanWord)).append(punctuation).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }

        System.out.println("\nNeutralized Paragraph:");
        System.out.println(result.toString().trim());
    }
}
