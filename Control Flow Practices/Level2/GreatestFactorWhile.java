import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int i = 1;
        int greatestFactor = 1;
        while (i < n) {  // exclude n itself
            if (n % i == 0) {
                greatestFactor = i;
            }
            i++;
        }
        System.out.println("Greatest factor of " + n + " (excluding itself) is: " + greatestFactor);
    }
}
