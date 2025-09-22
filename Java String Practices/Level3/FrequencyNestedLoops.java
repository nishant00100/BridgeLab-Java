// FrequencyNestedLoops.java
// Frequency calculation using nested loops and marking duplicates

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FrequencyNestedLoops {

    public static String[] computeFrequency(String text) {
        char[] arr = text.toCharArray();
        int n = arr.length;
        List<String> results = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) continue; // skipped duplicate
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                    arr[j] = 0; // mark duplicate
                }
            }
            results.add(arr[i] + ":" + count);
        }
        return results.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter text: ");
            String text = sc.nextLine();
            String[] freq = computeFrequency(text);
            System.out.println("Char : Frequency");
            for (String s : freq) {
                String[] parts = s.split(":");
                System.out.printf("%-6s %-6s%n", parts[0], parts[1]);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
