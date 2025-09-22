import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = input("Enter first number: ", sc);
        int b = input("Enter second number: ", sc);
        int c = input("Enter third number: ", sc);

        int max = findMax(a, b, c);
        System.out.println("Maximum: " + max);
    }

    public static int input(String prompt, Scanner sc) {
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
