import java.util.Scanner;

public class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int greatestFactor = 1;
        for (int i = 1; i < n; i++) {  // exclude the number itself
            if (n % i == 0) {
                greatestFactor = i;
            }
        }
        System.out.println("Greatest factor of " + n + " (excluding itself) is: " + greatestFactor);
    }
}
