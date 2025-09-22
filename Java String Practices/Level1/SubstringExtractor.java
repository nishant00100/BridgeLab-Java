// Program: Extract Substring using charAt() and substring()
import java.util.Scanner;

public class SubstringExtractor {
    public static String manualSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end && i < str.length(); i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            System.out.print("Enter start index: ");
            int start = scanner.nextInt();
            System.out.print("Enter end index: ");
            int end = scanner.nextInt();

            if (start < 0 || end > input.length() || start > end) {
                System.out.println("Invalid indices!");
                return;
            }

            String manual = manualSubstring(input, start, end);
            String builtin = input.substring(start, end);

            System.out.println("Manual substring: " + manual);
            System.out.println("Built-in substring: " + builtin);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
