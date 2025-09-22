// Program: Check String Prefix using charAt() and startsWith()
import java.util.Scanner;

public class PrefixChecker {
    public static boolean manualStartsWith(String str, String prefix) {
        if (prefix.length() > str.length()) return false;
        for (int i = 0; i < prefix.length(); i++) {
            if (str.charAt(i) != prefix.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter main string: ");
            String mainStr = scanner.nextLine();
            System.out.print("Enter prefix: ");
            String prefix = scanner.nextLine();

            boolean manual = manualStartsWith(mainStr, prefix);
            boolean builtin = mainStr.startsWith(prefix);

            System.out.println("Manual check: " + manual);
            System.out.println("Built-in check: " + builtin);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
