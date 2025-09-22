// Program: Extract substring using charAt() and substring()

import java.util.Scanner;

public class SubstringExtractor {

    public static String extractUsingCharAt(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end && i < str.length(); i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            System.out.print("Enter start index: ");
            int start = sc.nextInt();

            System.out.print("Enter end index: ");
            int end = sc.nextInt();

            String manual = extractUsingCharAt(str, start, end);
            String builtIn = str.substring(start, Math.min(end, str.length()));

            System.out.println("Manual substring: " + manual);
            System.out.println("Built-in substring: " + builtIn);

        } catch (Exception e) {
            System.out.println("Invalid input!");
        } finally {
            sc.close();
        }
    }
}
