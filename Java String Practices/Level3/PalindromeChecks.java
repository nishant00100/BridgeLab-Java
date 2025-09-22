// PalindromeChecks.java
// Check palindrome with 3 ways: iterative, recursive, array reverse

import java.util.Scanner;

public class PalindromeChecks {

    // 1. Iterative comparison
    public static boolean isPalindromeIterative(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    // 2. Recursive check
    public static boolean isPalindromeRecursive(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindromeRecursive(s, start + 1, end - 1);
    }

    // 3. Using arrays: create reverse and compare
    public static boolean isPalindromeUsingReverse(String s) {
        char[] orig = s.toCharArray();
        char[] rev = new char[orig.length];
        for (int i = 0; i < orig.length; i++) {
            rev[i] = orig[orig.length - 1 - i];
        }
        for (int i = 0; i < orig.length; i++) {
            if (orig[i] != rev[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter text (no spaces considered): ");
            String input = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

            System.out.println("Iterative: " + isPalindromeIterative(input));
            System.out.println("Recursive: " + isPalindromeRecursive(input, 0, input.length() - 1));
            System.out.println("Array Reverse: " + isPalindromeUsingReverse(input));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
