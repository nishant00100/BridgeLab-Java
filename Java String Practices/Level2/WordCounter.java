// Program: Count words in a string

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a sentence: ");
            String sentence = sc.nextLine().trim();

            if (sentence.isEmpty()) {
                System.out.println("Word count: 0");
            } else {
                String[] words = sentence.split("\\s+");
                System.out.println("Word count: " + words.length);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
