// Program 9: Employee Salary Calculation

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        double hra = 0.20 * basic;
        double da = 0.10 * basic;
        double gross = basic + hra + da;

        System.out.println("\n=== Salary Details ===");
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA (20%): " + hra);
        System.out.println("DA (10%): " + da);
        System.out.println("Gross Salary: " + gross);

        sc.close();
    }
}
