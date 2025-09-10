// Program 4: Income Tax Calculation

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Income: ");
        double income = sc.nextDouble();
        double tax = 0;

        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = 0.1 * (income - 250000);
        } else if (income <= 1000000) {
            tax = 25000 + 0.2 * (income - 500000);
        } else {
            tax = 125000 + 0.3 * (income - 1000000);
        }

        System.out.println("Income Tax = " + tax);

        sc.close();
    }
}
