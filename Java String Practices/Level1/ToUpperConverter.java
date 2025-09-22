// Program: Convert to Uppercase using charAt() and toUpperCase()
import java.util.Scanner;

public class ToUpperConverter {
    public static String manualToUpper(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result.append((char)(c - 32));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            String manual = manualToUpper(input);
            String builtin = input.toUpperCase();

            System.out.println("Manual uppercase: " + manual);
            System.out.println("Built-in uppercase: " + builtin);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
