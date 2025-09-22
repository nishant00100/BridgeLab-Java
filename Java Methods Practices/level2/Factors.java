// 1. Factors of a Number
import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factors.add(i);
        }

        int sum = 0, product = 1, sumSquares = 0;
        for (int f : factors) {
            sum += f;
            product *= f;
            sumSquares += f * f;
        }

        System.out.println("Factors: " + factors);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Sum of squares: " + sumSquares);
    }
}
