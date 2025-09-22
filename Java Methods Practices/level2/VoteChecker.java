// 7. Student Vote Checker
import java.util.*;

public class VoteChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (ages[i] >= 18)
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            else
                System.out.println("Student " + (i + 1) + " is NOT eligible to vote.");
        }
    }
}
