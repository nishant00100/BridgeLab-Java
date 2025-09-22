// AnagramChecker.java
// Check whether two texts are anagrams using frequency arrays

import java.util.Scanner;

public class AnagramChecker {

    public static boolean areAnagrams(String a, String b) {
        String s1 = a.replaceAll("\\s+", "").toLowerCase();
        String s2 = b.replaceAll("\\s+", "").toLowerCase();
        if (s1.length() != s2.length()) return false;

        int[] freq = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }
        for (int count : freq) if (count != 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first text: ");
            String t1 = sc.nextLine();
            System.out.print("Enter second text: ");
            String t2 = sc.nextLine();

            boolean result = areAnagrams(t1, t2);
            System.out.println("Anagram? " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
