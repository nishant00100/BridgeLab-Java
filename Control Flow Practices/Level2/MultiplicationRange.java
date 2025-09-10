// Class MultiplicationRange prints multiplication table of a number from 6 to 9
import java.util.Scanner;

class MultiplicationRange {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Loop from 6 to 9 and print multiplication table
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close scanner
        input.close();
    }
}
