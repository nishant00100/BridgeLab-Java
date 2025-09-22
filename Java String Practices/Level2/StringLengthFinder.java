// Program: Find length of a string without using length()
import java.util.Scanner;

public class StringLengthFinder {

    // Method to find string length manually
    public static int getStringLengthManual(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // will throw exception at end
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // safely end loop
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a string: ");
            String userInput = scanner.next();

            int manualLength = getStringLengthManual(userInput);
            int builtinLength = userInput.length();

            System.out.println("Manual length: " + manualLength);
            System.out.println("Built-in length: " + builtinLength);
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
