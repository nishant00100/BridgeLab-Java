// Class SumOfNNumbers computes sum of N natural numbers using loop
import java.util.Scanner;

class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter value of N: ");
        int n = input.nextInt();

        int sum = 0;

        // Loop for sum
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of " + n + " natural numbers = " + sum);

        input.close();
    }
}
