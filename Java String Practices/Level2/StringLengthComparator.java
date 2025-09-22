// Program: Compare lengths of two strings

import java.util.Scanner;

public class StringLengthComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first string: ");
            String str1 = sc.nextLine();

            System.out.print("Enter second string: ");
            String str2 = sc.nextLine();

            int len1 = str1.length();
            int len2 = str2.length();

            System.out.println("Length of first: " + len1);
            System.out.println("Length of second: " + len2);

            if (len1 > len2)
                System.out.println("First is longer.");
            else if (len2 > len1)
                System.out.println("Second is longer.");
            else
                System.out.println("Both are equal in length.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
