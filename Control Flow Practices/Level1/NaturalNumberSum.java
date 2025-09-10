// Class NaturalNumberSum checks if number is natural and computes sum
import java.util.Scanner;

class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if natural number
        if (number > 0) {
            // Compute sum using formula
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }

        input.close();
    }
}