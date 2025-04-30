import java.util.Random;

public class TortoiseAndHareRace {
    public static void main(String[] args) {
        Random rand = new Random();
        int tortoisePosition = 1;
        int harePosition = 1;
        int raceLength = 70;
        
        System.out.println("BANG !!!!!");
        System.out.println("AND THEY'RE OFF !!!!!");
        
        // Run the race until one of them reaches or passes square 70
        while (tortoisePosition < raceLength && harePosition < raceLength) {
            // Move the tortoise
            int tortoiseMove = rand.nextInt(10) + 1; // Generates a number between 1 and 10
            if (tortoiseMove >= 1 && tortoiseMove <= 5) {
                tortoisePosition += 3; // Fast plod
            } else if (tortoiseMove >= 6 && tortoiseMove <= 7) {
                tortoisePosition -= 6; // Slip
            } else {
                tortoisePosition += 1; // Slow plod
            }

            // Ensure tortoise doesn't go below 1
            if (tortoisePosition < 1) {
                tortoisePosition = 1;
            }
            
            // Move the hare
            int hareMove = rand.nextInt(10) + 1; // Generates a number between 1 and 10
            if (hareMove >= 1 && hareMove <= 2) {
                harePosition += 9; // Big hop
            } else if (hareMove >= 3 && hareMove <= 4) {
                harePosition += 1; // Small hop
            } else if (hareMove >= 5 && hareMove <= 6) {
                harePosition -= 12; // Big slip
            } else if (hareMove >= 7 && hareMove <= 8) {
                harePosition -= 2; // Small slip
            } else {
                // Sleep: do nothing
            }

            // Ensure hare doesn't go below 1
            if (harePosition < 1) {
                harePosition = 1;
            }

            // Print the race status
            for (int i = 1; i <= raceLength; i++) {
                if (i == tortoisePosition && i == harePosition) {
                    System.out.print("OUCH!!!");
                    i += 6; // Skip ahead by the length of "OUCH!!!"
                } else if (i == tortoisePosition) {
                    System.out.print("T");
                } else if (i == harePosition) {
                    System.out.print("H");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

            // Check for a winner
            if (tortoisePosition >= raceLength && harePosition >= raceLength) {
                System.out.println("It's a tie!");
                break;
            } else if (tortoisePosition >= raceLength) {
                System.out.println("TORTOISE WINS!!! YAY!!!");
                break;
            } else if (harePosition >= raceLength) {
                System.out.println("HARE WINS!!! YUCH.");
                break;
            }
        }
    }
}
