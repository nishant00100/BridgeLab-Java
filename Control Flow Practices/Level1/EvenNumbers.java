// Class EvenNumbers prints even numbers from 1 to N
import java.util.Scanner;

class EvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter value of N: ");
        int n = input.nextInt();

        System.out.println("Even numbers from 1 to " + n + ":");

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}
