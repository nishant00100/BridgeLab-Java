import java.util.Scanner;

class NaturalNumberSum {
    public int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        NaturalNumberSum calculator = new NaturalNumberSum();
        int sum = calculator.calculateSum(n);

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        scanner.close();
    }
}
