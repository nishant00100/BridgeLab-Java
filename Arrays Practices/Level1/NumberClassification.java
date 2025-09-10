// Program Name: NumberClassification.java
// Description: Classify numbers and compare first/last elements

import java.util.Scanner;

class NumberClassification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        // Input numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Classification
        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            if (n > 0) {
                if (n % 2 == 0) {
                    System.out.println(n + " is Positive and Even");
                } else {
                    System.out.println(n + " is Positive and Odd");
                }
            } else if (n < 0) {
                System.out.println(n + " is Negative");
            } else {
                System.out.println(n + " is Zero");
            }
        }

        // Compare first and last
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("First and last numbers are equal.");
        } else if (first > last) {
            System.out.println("First number is greater than last.");
        } else {
            System.out.println("First number is less than last.");
        }

        input.close();
    }
}
