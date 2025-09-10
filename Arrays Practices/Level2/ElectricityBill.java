// Program 5: Electricity Bill Calculation

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();
        double bill = 0;

        if (units <= 100) {
            bill = units * 1.20;
        } else if (units <= 300) {
            bill = (100 * 1.20) + (units - 100) * 2.00;
        } else {
            bill = (100 * 1.20) + (200 * 2.00) + (units - 300) * 3.00;
        }

        System.out.println("Total Bill = " + bill);

        sc.close();
    }
}
