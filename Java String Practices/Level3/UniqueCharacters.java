// UniqueCharacters.java
// Find unique characters in a string using charAt()

import java.util.Scanner;

public class UniqueCharacters {

    // Manual length (without using length())
    public static int manualLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // done
        }
        return count;
    }

    // Return unique characters as char array
    public static char[] findUniqueCharacters(String text) {
        int n = manualLength(text);
        char[] temp = new char[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean seen = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    seen = true;
                    break;
                }
            }
            if (!seen) {
                temp[uniqueCount++] = c;
            }
        }
        char[] result = new char[uniqueCount];
        System.arraycopy(temp, 0, result, 0, uniqueCount);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a text: ");
            String text = sc.nextLine();
            char[] unique = findUniqueCharacters(text);
            System.out.print("Unique characters: ");
            for (char c : unique) System.out.print(c + " ");
            System.out.println();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
