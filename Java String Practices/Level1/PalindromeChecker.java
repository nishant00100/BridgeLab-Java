// Program: Check Palindrome using charAt() and StringBuilder.reverse()
import java.util.Scanner;

public class PalindromeChecker {
    public static boolean manualPalindrome(String str) {
        str = str.toLowerCase().replaceAll("\\s+", "");
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            boolean manual = manualPalindrome(input);
            boolean builtin = input.equalsIgnoreCase(new StringBuilder(input).reverse().toString());

            System.out.println("Manual palindrome check: " + manual);
            System.out.println("Built-in palindrome check: " + builtin);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
