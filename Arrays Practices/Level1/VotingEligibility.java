// Program to check voting eligibility of 10 students
import java.util.Scanner;

class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define an array of 10 integers for student ages
        int[] studentAges = new int[10];

        // Take input from the user
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            int age = input.nextInt();

            // Validate input (no negative ages)
            if (age < 0) {
                System.err.println("Invalid age entered! Exiting program.");
                System.exit(0);
            }
            studentAges[i] = age;
        }

        // Check voting eligibility
        for (int i = 0; i < studentAges.length; i++) {
            if (studentAges[i] >= 18) {
                System.out.println("Student with age " + studentAges[i] + " can vote.");
            } else {
                System.out.println("Student with age " + studentAges[i] + " cannot vote.");
            }
        }

        input.close();
    }
}
