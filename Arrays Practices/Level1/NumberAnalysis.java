// Program to analyze numbers: positive/negative/zero, even/odd, and compare first and last elements
import java.util.Scanner;

class NumberAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        // Take input for array elements
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Check conditions for each number
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (num > 0) {
                System.out.print("Number " + num + " is Positive and ");
                if (num % 2 == 0) {
                    System.out.println("Even.");
                } else {
                    System.out.println("Odd.");
                }
            } else if (num < 0) {
                System.out.println("Number " + num + " is Negative.");
            } else {
                System.out.println("Number is Zero.");
            }
        }

        // Compare first and last element
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("First and last elements are Equal.");
        } else if (first > last) {
            System.out.println("First element is Greater than last.");
        } else {
            System.out.println("First element is Less than last.");
        }

        input.close();
    }
}
