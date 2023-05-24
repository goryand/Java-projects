import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Guessing game
        System.out.println("\n\n");
        System.out.println("The computer will generate a random number between 1 - 100, and you will have to input numbers to guess it. The computer will tell you if you are either higher, lower, or have guessed the correct number.");

        int triesToGuess = 0;
        boolean didUserGuessTheNumber = false;

        Scanner scanner = new Scanner(System.in);
        // Generate the random number that the user will guess
        int hiddenNumber = (int) Math.round(Math.random() * 100);

        System.out.println("The computer has generated the number. Start guessing now..");

        do {
            System.out.print("Guess a number: ");
            short recentlyGuessedVariable = scanner.nextShort();
            
            // Add another guess to the counter
            triesToGuess += 1;

            if (recentlyGuessedVariable == hiddenNumber) {
                // Player guessed the number. You win!
                System.out.println("You guessed the correct number! You win!\n It took you " + triesToGuess + " tries.");
                didUserGuessTheNumber = true;
            } else if (recentlyGuessedVariable > hiddenNumber) {
                // Player guessed a number higher than the hidden number.
                System.out.println("Lower..");
            } else if (recentlyGuessedVariable < hiddenNumber) {
                // Player guessed a number lower than the hidden number.
                System.out.println("Higher..");
            }
        } while(didUserGuessTheNumber == false);

        System.out.println("Thank you for playing!");
        scanner.close();
        // TODO do stuff
    }
}
