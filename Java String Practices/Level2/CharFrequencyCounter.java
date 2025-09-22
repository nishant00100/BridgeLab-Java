// Program: Count frequency of a character in a string

import java.util.Scanner;

public class CharFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            System.out.print("Enter a character to count: ");
            char target = sc.next().charAt(0);

            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == target) {
                    count++;
                }
            }

            System.out.println("Frequency of '" + target + "': " + count);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
