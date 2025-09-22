// Program: Convert string to uppercase and lowercase

import java.util.Scanner;

public class StringCaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            System.out.println("Uppercase: " + str.toUpperCase());
            System.out.println("Lowercase: " + str.toLowerCase());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
