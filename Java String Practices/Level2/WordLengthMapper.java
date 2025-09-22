// Program: Split words and return word + length in 2D array
import java.util.Scanner;

public class WordLengthMapper {

    public static String[] splitWords(String text) {
        return text.trim().split("\\s+");
    }

    public static int getStringLengthManual(String word) {
        int count = 0;
        try {
            while (true) {
                word.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    public static String[][] getWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLengthManual(words[i]));
        }
        return result;
    }

    public static void displayWordLengths(String[][] wordData) {
        System.out.println("Word\tLength");
        for (String[] row : wordData) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a sentence: ");
            String text = scanner.nextLine();

            String[] words = splitWords(text);
            String[][] wordLengths = getWordLengthArray(words);

            displayWordLengths(wordLengths);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
