import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Factors of " + n + " are:");
        int i = 1;
        while (i <= n) {
            if (n % i == 0)
                System.out.print(i + " ");
            i++;
        }
    }
}
