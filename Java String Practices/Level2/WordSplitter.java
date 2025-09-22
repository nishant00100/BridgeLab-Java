// Program: Split text into words manually and compare with split()
import java.util.Scanner;

public class WordSplitter {

    // Method to split words manually
    public static String[] manualSplitWords(String text) {
        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                currentWord.append(c);
            } else if (currentWord.length() > 0) {
                words[index++] = currentWord.toString();
                currentWord.setLength(0);
            }
        }
        if (currentWord.length() > 0) {
            words[index] = currentWord.toString();
        }

        return words;
    }

    // Compare two arrays of words
    public static boolean compareWordArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a sentence: ");
            String inputText = scanner.nextLine();

            String[] manualWords = manualSplitWords(inputText);
            String[] builtinWords = inputText.trim().split("\\s+");

            boolean same = compareWordArrays(manualWords, builtinWords);

            System.out.println("Manual split:");
            for (String w : manualWords) System.out.println(w);

            System.out.println("\nBuilt-in split:");
            for (String w : builtinWords) System.out.println(w);

            System.out.println("\nArrays are identical: " + same);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
