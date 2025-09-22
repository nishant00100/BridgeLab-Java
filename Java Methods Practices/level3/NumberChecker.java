import java.util.Arrays;

public class NumberChecker {

    // ----------------- Basic digit utilities -----------------
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] toDigitsArray(int number) {
        String s = String.valueOf(Math.abs(number));
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    // ----------------- Duck number -----------------
    // Standard definition: contains at least one '0' digit (but not leading zero).
    public static boolean isDuckNumber(int number) {
        String s = String.valueOf(Math.abs(number));
        // skip possible leading zeros (none normally in int string) → check any '0' after first char
        for (int i = 1; i < s.length(); i++) if (s.charAt(i) == '0') return true;
        return false;
    }

    // ----------------- Armstrong -----------------
    public static boolean isArmstrongNumber(int number) {
        int[] d = toDigitsArray(number);
        int p = d.length;
        int sum = 0;
        for (int digit : d) sum += Math.pow(digit, p);
        return sum == Math.abs(number);
    }

    // ----------------- Largest and second largest -----------------
    public static int[] largestAndSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int v : arr) {
            if (v > largest) {
                second = largest;
                largest = v;
            } else if (v > second && v != largest) {
                second = v;
            }
        }
        return new int[]{largest, second};
    }

    // ----------------- Smallest and second smallest -----------------
    public static int[] smallestAndSecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int v : arr) {
            if (v < smallest) {
                second = smallest;
                smallest = v;
            } else if (v < second && v != smallest) {
                second = v;
            }
        }
        return new int[]{smallest, second};
    }

    // ----------------- Sum of digits and sum of squares -----------------
    public static int sumOfDigits(int number) {
        int sum = 0;
        for (int d : toDigitsArray(number)) sum += d;
        return sum;
    }

    public static int sumOfSquaresOfDigits(int number) {
        int sum = 0;
        for (int d : toDigitsArray(number)) sum += d * d;
        return sum;
    }

    // ----------------- Harshad -----------------
    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        return sum != 0 && (Math.abs(number) % sum == 0);
    }

    // ----------------- Digit frequency -> returns 2D array [digit, freq] for digits 0..9 -----------------
    public static int[][] digitFrequency(int number) {
        int[] freq = new int[10];
        for (int d : toDigitsArray(number)) freq[d]++;
        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = i;
            result[i][1] = freq[i];
        }
        return result;
    }

    // ----------------- Reverse array and compare -----------------
    public static int[] reverseDigitsArray(int number) {
        int[] d = toDigitsArray(number);
        for (int i = 0, j = d.length - 1; i < j; i++, j--) {
            int t = d[i]; d[i] = d[j]; d[j] = t;
        }
        return d;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindromeNumber(int number) {
        return arraysEqual(toDigitsArray(number), reverseDigitsArray(number));
    }

    // ----------------- Prime -----------------
    public static boolean isPrime(int number) {
        int n = Math.abs(number);
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // ----------------- Neon -----------------
    // A neon number is where sum of digits of square of number equals the number
    public static boolean isNeon(int number) {
        int square = number * number;
        return sumOfDigits(square) == number;
    }

    // ----------------- Spy number (sum of digits == product of digits) -----------------
    public static boolean isSpyNumber(int number) {
        int[] d = toDigitsArray(number);
        int sum = 0;
        int product = 1;
        for (int digit : d) {
            sum += digit;
            product *= digit;
        }
        return sum == product;
    }

    // ----------------- Automorphic (square ends with number) -----------------
    public static boolean isAutomorphic(int number) {
        long square = 1L * number * number;
        String sNum = String.valueOf(Math.abs(number));
        String sSquare = String.valueOf(square);
        return sSquare.endsWith(sNum);
    }

    // ----------------- Buzz (divisible by 7 or ends with 7) -----------------
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || Math.abs(number) % 10 == 7;
    }

    // ----------------- Perfect / Abundant / Deficient -----------------
    private static int sumOfProperDivisors(int n) {
        int m = Math.abs(n);
        if (m <= 1) return 0;
        int sum = 1;
        int limit = (int) Math.sqrt(m);
        for (int i = 2; i <= limit; i++) {
            if (m % i == 0) {
                sum += i;
                int other = m / i;
                if (other != i) sum += other;
            }
        }
        return sum;
    }

    public static boolean isPerfect(int n) {
        return n > 0 && sumOfProperDivisors(n) == n;
    }

    public static boolean isAbundant(int n) {
        return n > 0 && sumOfProperDivisors(n) > n;
    }

    public static boolean isDeficient(int n) {
        return n > 0 && sumOfProperDivisors(n) < n;
    }

    // ----------------- Strong number (sum of factorials of digits equals number) -----------------
    private static long factorial(int x) {
        long f = 1;
        for (int i = 2; i <= x; i++) f *= i;
        return f;
    }

    public static boolean isStrongNumber(int number) {
        long sumFact = 0;
        for (int d : toDigitsArray(number)) sumFact += factorial(d);
        return sumFact == Math.abs(number);
    }

    // ----------------- Main for quick testing -----------------
    public static void main(String[] args) {
        int test = 153; // sample to test armstrong
        System.out.println("Digits of " + test + ": " + Arrays.toString(toDigitsArray(test)));
        System.out.println("Count digits: " + countDigits(test));
        System.out.println("Is duck: " + isDuckNumber(test));
        System.out.println("Is Armstrong: " + isArmstrongNumber(test));
        System.out.println("Sum of digits: " + sumOfDigits(test));
        System.out.println("Sum squares: " + sumOfSquaresOfDigits(test));
        System.out.println("Is Harshad: " + isHarshadNumber(test));
        System.out.println("Is Palindrome: " + isPalindromeNumber(test));
        System.out.println("Is Prime: " + isPrime(test));
        System.out.println("Is Neon: " + isNeon(test));
        System.out.println("Is Spy: " + isSpyNumber(test));
        System.out.println("Is Automorphic: " + isAutomorphic(5)); // true
        System.out.println("Is Buzz: " + isBuzz(14));
        System.out.println("Is Perfect (6): " + isPerfect(6));
        System.out.println("Is Abundant (12): " + isAbundant(12));
        System.out.println("Is Deficient (8): " + isDeficient(8));
        System.out.println("Is Strong (145): " + isStrongNumber(145));
        System.out.println("Digit frequency of " + test + ": " + Arrays.deepToString(digitFrequency(test)));
    }
}
