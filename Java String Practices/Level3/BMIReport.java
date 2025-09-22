// BMIReport.java
// Compute BMI for 10 team members and show height, weight, BMI and status.

import java.util.Scanner;

public class BMIReport {

    // Compute BMI given weight(kg) and height(cm)
    public static double computeBMI(double weightKg, double heightCm) {
        double heightMeters = heightCm / 100.0;
        if (heightMeters <= 0) throw new IllegalArgumentException("Height must be positive.");
        return weightKg / (heightMeters * heightMeters);
    }

    // Determine BMI status
    public static String determineBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25.0) return "Normal";
        if (bmi < 30.0) return "Overweight";
        return "Obese";
    }

    // Build result 2D array: [i][0]=height, [i][1]=weight, [i][2]=bmi, [i][3]=status
    public static String[][] buildBMIReport(double[][] weightHeight) {
        int n = weightHeight.length;
        String[][] report = new String[n][4];
        for (int i = 0; i < n; i++) {
            double weight = weightHeight[i][0];
            double height = weightHeight[i][1];
            double bmi = computeBMI(weight, height);
            String status = determineBMIStatus(bmi);
            report[i][0] = String.valueOf((int) height); // cm as int string
            report[i][1] = String.format("%.2f", weight);
            report[i][2] = String.format("%.2f", bmi);
            report[i][3] = status;
        }
        return report;
    }

    // Display tabular report
    public static void displayReport(String[][] report) {
        System.out.printf("%-8s %-8s %-8s %-12s%n", "Person", "Height", "Weight", "BMI", "Status");
        for (int i = 0; i < report.length; i++) {
            System.out.printf("P%02d     %-8s %-8s %-8s %-12s%n",
                    (i + 1), report[i][0], report[i][1], report[i][2], report[i][3]);
        }
    }

    public static void main(String[] args) {
        final int TEAM_SIZE = 10;
        Scanner sc = new Scanner(System.in);
        double[][] weightHeight = new double[TEAM_SIZE][2];

        try {
            System.out.println("Enter weight(kg) and height(cm) for " + TEAM_SIZE + " persons.");
            for (int i = 0; i < TEAM_SIZE; i++) {
                while (true) {
                    System.out.printf("Person %d - weight(kg): ", i + 1);
                    double w = sc.nextDouble();
                    System.out.printf("Person %d - height(cm): ", i + 1);
                    double h = sc.nextDouble();
                    if (w <= 0 || h <= 0) {
                        System.out.println("Invalid input. Weight and height must be positive. Try again.");
                    } else {
                        weightHeight[i][0] = w;
                        weightHeight[i][1] = h;
                        break;
                    }
                }
            }

            String[][] report = buildBMIReport(weightHeight);
            System.out.println("\nBMI Report:");
            System.out.printf("%-6s %-8s %-8s %-8s %-12s%n", "Person", "Height", "Weight", "BMI", "Status");
            for (int i = 0; i < report.length; i++) {
                System.out.printf("P%02d   %-8s %-8s %-8s %-12s%n",
                        (i + 1), report[i][0], report[i][1], report[i][2], report[i][3]);
            }

        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
