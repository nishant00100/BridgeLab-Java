// Program: Count Vowels using charAt() and replaceAll()
import java.util.Scanner;

public class VowelCounter {
    public static int manualCountVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ("aeiou".indexOf(c) != -1) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            int manual = manualCountVowels(input);
            int builtin = input.replaceAll("[^aeiouAEIOU]", "").length();

            System.out.println("Manual vowel count: " + manual);
            System.out.println("Built-in vowel count: " + builtin);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
