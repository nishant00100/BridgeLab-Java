// FirstNonRepeatingChar.java
// Find the first non-repeating character using frequency array (ASCII)

import java.util.Scanner;

public class FirstNonRepeatingChar {

    public static char findFirstNonRepeating(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0'; // indicate none
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter text: ");
            String text = sc.nextLine();
            char first = findFirstNonRepeating(text);
            if (first == '\0') {
                System.out.println("No non-repeating character found.");
            } else {
                System.out.println("First non-repeating character: " + first);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
