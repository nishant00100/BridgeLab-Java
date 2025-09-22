// FrequencyUsingUnique.java
// Frequency using unique characters (find unique, then count frequencies)

import java.util.Scanner;

public class FrequencyUsingUnique {

    // Unique characters by nested loop
    public static char[] findUniqueChars(String text) {
        int n = text.length();
        char[] temp = new char[n];
        int u = 0;
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean found = false;
            for (int j = 0; j < u; j++) {
                if (temp[j] == c) {
                    found = true;
                    break;
                }
            }
            if (!found) temp[u++] = c;
        }
        char[] result = new char[u];
        System.arraycopy(temp, 0, result, 0, u);
        return result;
    }

    // Build 2D array [char, freq] using unique characters
    public static String[][] frequencyFromUnique(String text) {
        char[] unique = findUniqueChars(text);
        String[][] table = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            char c = unique[i];
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == c) count++;
            }
            table[i][0] = String.valueOf(c);
            table[i][1] = String.valueOf(count);
        }
        return table;
    }

    public static void display(String[][] table) {
        System.out.printf("%-6s %-6s%n", "Char", "Freq");
        for (String[] r : table) System.out.printf("%-6s %-6s%n", r[0], r[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter text: ");
            String text = sc.nextLine();
            String[][] table = frequencyFromUnique(text);
            display(table);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
