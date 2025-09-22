// Program: Concatenate two strings using + and concat()

import java.util.Scanner;

public class StringConcatenator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first string: ");
            String str1 = sc.nextLine();

            System.out.print("Enter second string: ");
            String str2 = sc.nextLine();

            String manual = str1 + str2;
            String builtIn = str1.concat(str2);

            System.out.println("Manual (+): " + manual);
            System.out.println("Built-in concat(): " + builtIn);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
