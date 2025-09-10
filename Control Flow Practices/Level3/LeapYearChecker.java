// Program Name: LeapYearChecker
// Purpose: Check if the given year is a Leap Year or not
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Get year as input
        System.out.print("Enter a year (>=1582): ");
        int year = input.nextInt();

        // Check if year is valid
        if (year < 1582) {
            System.out.println("Year must be greater than or equal to 1582 (Gregorian calendar).");
        } else {
            // Logic for leap year using multiple if-else statements
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else if (year % 100 == 0) {
                System.out.println(year + " is NOT a Leap Year.");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }

        // Close scanner
        input.close();
    }
}
