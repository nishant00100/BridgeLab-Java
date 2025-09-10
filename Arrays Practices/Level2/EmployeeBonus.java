import java.util.Scanner;

// Program to calculate employee bonus, new salary, and total payout
class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Number of employees
        final int employeeCount = 10;

        // Arrays to store employee data
        double[] salaries = new double[employeeCount];
        int[] yearsOfService = new int[employeeCount];
        double[] bonusAmounts = new double[employeeCount];
        double[] newSalaries = new double[employeeCount];

        // Totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input salaries and years of service
        for (int i = 0; i < employeeCount; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

            // Validate salary
            double salary;
            while (true) {
                System.out.print("Enter Salary: ");
                salary = input.nextDouble();
                if (salary > 0) break;
                System.err.println("Invalid salary. Please enter a positive value.");
            }
            salaries[i] = salary;

            // Validate years of service
            int years;
            while (true) {
                System.out.print("Enter Years of Service: ");
                years = input.nextInt();
                if (years >= 0) break;
                System.err.println("Invalid years. Enter a non-negative number.");
            }
            yearsOfService[i] = years;
        }

        // Calculate bonus and new salaries
        for (int i = 0; i < employeeCount; i++) {
            double bonusRate = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonusAmounts[i] = salaries[i] * bonusRate;
            newSalaries[i] = salaries[i] + bonusAmounts[i];

            totalBonus += bonusAmounts[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display results
        System.out.println("\n=== Company Salary & Bonus Report ===");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        input.close();
    }
}
