// Program Name: LeapYearLogical
// Purpose: Check if the given year is a Leap Year using logical operators
import java.util.Scanner;

public class LeapYearLogical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input
        System.out.print("Enter a year (>=1582): ");
        int year = input.nextInt();

        // Check valid year
        if (year < 1582) {
            System.out.println("Year must be greater than or equal to 1582 (Gregorian calendar).");
        } else {
            // Single if condition using logical && and ||
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }

        input.close();
    }
}
