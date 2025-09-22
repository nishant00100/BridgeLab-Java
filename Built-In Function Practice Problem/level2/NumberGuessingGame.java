import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100.");
        int low = 1, high = 100, guess;
        String feedback;

        while (true) {
            guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);
            feedback = getFeedback();

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Yay! The computer guessed it!");
                break;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            }

            if (low > high) {
                System.out.println("Inconsistent feedback! Game over.");
                break;
            }
        }
    }

    public static int generateGuess(int low, int high) {
        return rand.nextInt(high - low + 1) + low;
    }

    public static String getFeedback() {
        System.out.print("Is the guess high, low, or correct? ");
        return sc.nextLine();
    }
}
