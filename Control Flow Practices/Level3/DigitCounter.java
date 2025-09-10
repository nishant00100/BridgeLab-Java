import java.util.Scanner;

class DigitCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int count = 0;

        int temp = number;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        System.out.println("Number of digits in " + number + " = " + count);

        input.close();
    }
}
