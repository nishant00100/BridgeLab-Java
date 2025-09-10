// Program Name: SumOfDigits.java
// Description: Program to compute the sum of all digits of a number using an array

import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate input
        if (number < 0) {
            System.err.println("Invalid number. Must be non-negative.");
            System.exit(0);
        }

        // Find count of digits
        int count = 0, temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Store digits in array
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Find sum of digits
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }

        // Display result
        System.out.println("Sum of digits = " + sum);
        input.close();
    }
}
