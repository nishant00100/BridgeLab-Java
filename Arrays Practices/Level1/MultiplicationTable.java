// Program to print multiplication table of a number
import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.err.println("Invalid number! Must be positive.");
            System.exit(0);
        }

        // Store results in array
        int[] results = new int[10];
        for (int i = 0; i < results.length; i++) {
            results[i] = number * (i + 1);
        }

        // Display results
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 0; i < results.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + results[i]);
        }

        input.close();
    }
}
