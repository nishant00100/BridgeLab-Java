// Program: Count Words using charAt() and split()
import java.util.Scanner;

public class WordCounter {
    public static int manualCountWords(String str) {
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            int manual = manualCountWords(input);
            int builtin = input.trim().split("\\s+").length;

            System.out.println("Manual word count: " + manual);
            System.out.println("Built-in word count: " + builtin);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
