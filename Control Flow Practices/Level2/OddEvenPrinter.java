// Class OddEvenPrinter prints odd and even numbers between 1 and user input
import java.util.Scanner;

class OddEvenPrinter {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
        } else {
            // Loop through 1 to number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        }

        // Close scanner
        input.close();
    }
}
