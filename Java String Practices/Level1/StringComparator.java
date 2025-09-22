// Program: Compare Two Strings using charAt() and equals()
import java.util.Scanner;

public class StringComparator {
    public static boolean compareStringsCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter first string: ");
            String first = scanner.nextLine();
            System.out.print("Enter second string: ");
            String second = scanner.nextLine();

            boolean manual = compareStringsCharAt(first, second);
            boolean builtin = first.equals(second);

            System.out.println("Manual Comparison (charAt): " + manual);
            System.out.println("Built-in equals(): " + builtin);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
