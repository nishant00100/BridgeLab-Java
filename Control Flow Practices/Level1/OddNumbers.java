// Class OddNumbers prints odd numbers from 1 to N
import java.util.Scanner;

class OddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter value of N: ");
        int n = input.nextInt();

        System.out.println("Odd numbers from 1 to " + n + ":");

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}
