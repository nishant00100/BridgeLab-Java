import java.util.Locale;

public class EmployeeBonusZara {
    private static final int EMPLOYEES = 10;

    // Generate random 5-digit salary: 10000..99999
    public static int randomSalary() {
        return (int) (Math.random() * 90000) + 10000;
    }

    // Generate random years of service: 0..20 (example range)
    public static int randomYearsOfService() {
        return (int) (Math.random() * 21);
    }

    // Calculate new salary and bonusPercent
    public static double[] calculateNewSalaryAndBonus(int salary, int yearsOfService) {
        double bonusPercent = yearsOfService > 5 ? 0.05 : 0.02;
        double bonusAmount = salary * bonusPercent;
        double newSalary = salary + bonusAmount;
        return new double[]{salary, yearsOfService, bonusPercent * 100, bonusAmount, newSalary};
    }

    public static void main(String[] args) {
        double[][] table = new double[EMPLOYEES][5]; // columns: oldSalary, years, bonusPercent, bonusAmount, newSalary

        for (int i = 0; i < EMPLOYEES; i++) {
            int salary = randomSalary();
            int years = randomYearsOfService();
            double[] row = calculateNewSalaryAndBonus(salary, years);
            table[i] = row;
        }

        double sumOld = 0, sumNew = 0, sumBonus = 0;
        System.out.println("Emp\tOldSalary\tYears\tBonus%\tBonusAmt\tNewSalary");
        for (int i = 0; i < EMPLOYEES; i++) {
            double oldSal = table[i][0];
            double years = table[i][1];
            double bonusPerc = table[i][2];
            double bonusAmt = table[i][3];
            double newSal = table[i][4];
            sumOld += oldSal;
            sumNew += newSal;
            sumBonus += bonusAmt;
            System.out.printf(Locale.US, "%d\t%.0f\t\t%.0f\t%.1f\t%.2f\t\t%.2f%n", i+1, oldSal, years, bonusPerc, bonusAmt, newSal);
        }
        System.out.printf(Locale.US, "Totals\t%.0f\t\t-\t-\t%.2f\t\t%.2f%n", sumOld, sumBonus, sumNew);
    }
}
