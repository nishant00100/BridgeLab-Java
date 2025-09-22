// Program: Replace a word in a string

import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a sentence: ");
            String sentence = sc.nextLine();

            System.out.print("Enter word to replace: ");
            String oldWord = sc.next();

            System.out.print("Enter new word: ");
            String newWord = sc.next();

            String result = sentence.replace(oldWord, newWord);

            System.out.println("Updated sentence: " + result);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
