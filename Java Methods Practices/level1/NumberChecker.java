import java.util.Scanner;

class NumberChecker {
    public int checkNumber(int number) {
        if (number > 0) return 1;
        else if (number < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        NumberChecker checker = new NumberChecker();
        int result = checker.checkNumber(number);

        if (result == 1) System.out.println("Positive Number");
        else if (result == -1) System.out.println("Negative Number");
        else System.out.println("Zero");
        scanner.close();
    }
}
