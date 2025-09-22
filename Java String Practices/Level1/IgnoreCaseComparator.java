// Program: Compare Strings Ignoring Case using charAt() and equalsIgnoreCase()
import java.util.Scanner;

public class IgnoreCaseComparator {
    public static boolean manualIgnoreCase(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            char c1 = Character.toLowerCase(str1.charAt(i));
            char c2 = Character.toLowerCase(str2.charAt(i));
            if (c1 != c2) return false;
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

            boolean manual = manualIgnoreCase(first, second);
            boolean builtin = first.equalsIgnoreCase(second);

            System.out.println("Manual ignore case: " + manual);
            System.out.println("Built-in ignore case: " + builtin);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
