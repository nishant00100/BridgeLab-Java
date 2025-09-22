import java.util.Scanner;

class QuotientRemainderCalculator {
    public int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();

        QuotientRemainderCalculator calculator = new QuotientRemainderCalculator();
        int[] result = calculator.findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient = " + result[0] + ", Remainder = " + result[1]);
        scanner.close();
    }
}
