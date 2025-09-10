// Class VotingEligibility checks if person is eligible to vote
import java.util.Scanner;

class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter age: ");
        int age = input.nextInt();

        // Check eligibility
        boolean isEligible = (age >= 18);

        // Print result
        System.out.println("Is the person eligible to vote? " + isEligible);

        input.close();
    }
}
