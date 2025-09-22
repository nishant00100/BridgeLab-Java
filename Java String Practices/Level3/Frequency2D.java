// Frequency2D.java
// Frequency of characters returned in a 2D String array [char, freq]

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Frequency2D {

    public static String[][] buildFrequencyTable(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        List<String[]> rows = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                rows.add(new String[]{String.valueOf((char) i), String.valueOf(freq[i])});
            }
        }
        String[][] result = new String[rows.size()][2];
        for (int i = 0; i < rows.size(); i++) result[i] = rows.get(i);
        return result;
    }

    public static void displayFrequency(String[][] table) {
        System.out.printf("%-8s %-8s%n", "Char", "Freq");
        for (String[] row : table) {
            System.out.printf("%-8s %-8s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter text: ");
            String text = sc.nextLine();
            String[][] table = buildFrequencyTable(text);
            displayFrequency(table);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
