// Class Factorial calculates factorial of a number
import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        long fact = 1;

        // Loop for factorial
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + n + " = " + fact);

        input.close();
    }
}