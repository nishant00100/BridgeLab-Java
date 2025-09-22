// Program: Reverse a string using charAt() and StringBuilder.reverse()

import java.util.Scanner;

public class StringReverser {

    public static String reverseManual(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            String manual = reverseManual(str);
            String builtIn = new StringBuilder(str).reverse().toString();

            System.out.println("Manual reverse: " + manual);
            System.out.println("Built-in reverse: " + builtIn);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
