import java.util.Arrays;

public class FactorsOperations {

    public static int[] findFactors(int number) {
        int n = Math.abs(number);
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) factors[idx++] = i;
        return factors;
    }

    public static int greatestFactor(int[] factors) {
        int g = Integer.MIN_VALUE;
        for (int f : factors) if (f > g) g = f;
        return g;
    }

    public static long sumOfFactors(int[] factors) {
        long s = 0;
        for (int f : factors) s += f;
        return s;
    }

    public static long productOfFactors(int[] factors) {
        long p = 1;
        for (int f : factors) p *= f;
        return p;
    }

    public static long productOfCubesOfFactors(int[] factors) {
        long p = 1;
        for (int f : factors) p *= (long) Math.pow(f, 3);
        return p;
    }

    public static void main(String[] args) {
        int number = 36; // sample; replace with input if needed
        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ": " + Arrays.toString(factors));
        System.out.println("Greatest factor: " + greatestFactor(factors));
        System.out.println("Sum: " + sumOfFactors(factors));
        System.out.println("Product: " + productOfFactors(factors));
        System.out.println("Product of cubes: " + productOfCubesOfFactors(factors));
    }
}
