// Class BonusCalculator computes bonus based on service years
import java.util.Scanner;

class BonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter years of service: ");
        int years = input.nextInt();
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        double bonus = 0;

        // Business logic
        if (years > 5) {
            bonus = 0.05 * salary;  // 5% bonus
        }

        System.out.println("Bonus = " + bonus);

        input.close();
    }
}
