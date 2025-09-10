// Class EmployeeBonus calculates bonus based on years of service

import java.util.Scanner;

class EmployeeBonus {

    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        // Initialize bonus variable
        double bonus = 0;

        // Check eligibility for bonus
        if (yearsOfService > 5) {
            bonus = salary * 0.05; // 5% bonus
        }

        // Print results
        System.out.println("Employee with salary " + salary
                + " and service years " + yearsOfService
                + " has earned a bonus of " + bonus);

        // Close scanner
        input.close();
    }
}
