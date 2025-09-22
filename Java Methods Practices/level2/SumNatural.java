// 2. Sum of n natural numbers using recursion
import java.util.*;

public class SumNatural {
    static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int recSum = recursiveSum(n);
        int formulaSum = n * (n + 1) / 2;

        System.out.println("Recursive Sum = " + recSum);
        System.out.println("Formula Sum = " + formulaSum);
    }
}
