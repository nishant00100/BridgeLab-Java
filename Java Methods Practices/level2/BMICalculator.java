// 10. BMI Calculator (10 members)
import java.util.*;

public class BMICalculator {
    static String bmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] members = new double[10][2]; // [][0]=weight, [][1]=height

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of member " + (i + 1) + ": ");
            members[i][0] = sc.nextDouble();
            System.out.print("Enter height (m) of member " + (i + 1) + ": ");
            members[i][1] = sc.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            double bmi = members[i][0] / (members[i][1] * members[i][1]);
            System.out.println("Member " + (i + 1) + " BMI = " + bmi + " (" + bmiStatus(bmi) + ")");
        }
    }
}
