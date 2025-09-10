// Program Name: GradeCalculator
// Purpose: Compute percentage and assign grade with remarks
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input marks for subjects
        System.out.print("Enter marks for Physics: ");
        int physics = input.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = input.nextInt();
        System.out.print("Enter marks for Maths: ");
        int maths = input.nextInt();

        // Compute average percentage
        double averageMarks = (physics + chemistry + maths) / 3.0;

        // Print percentage
        System.out.println("Average Marks = " + averageMarks);

        // Determine grade and remarks
        if (averageMarks >= 90) {
            System.out.println("Grade: A+ | Remark: Excellent");
        } else if (averageMarks >= 75) {
            System.out.println("Grade: A | Remark: Very Good");
        } else if (averageMarks >= 60) {
            System.out.println("Grade: B | Remark: Good");
        } else if (averageMarks >= 50) {
            System.out.println("Grade: C | Remark: Average");
        } else if (averageMarks >= 35) {
            System.out.println("Grade: D | Remark: Pass");
        } else {
            System.out.println("Grade: F | Remark: Fail");
        }

        input.close();
    }
}
