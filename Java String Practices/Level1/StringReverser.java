// Program: Reverse a String using charAt() and StringBuilder.reverse()
import java.util.Scanner;

public class StringReverser {
    public static String manualReverse(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            String manual = manualReverse(input);
            String builtin = new StringBuilder(input).reverse().toString();

            System.out.println("Manual reverse: " + manual);
            System.out.println("Built-in reverse: " + builtin);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
