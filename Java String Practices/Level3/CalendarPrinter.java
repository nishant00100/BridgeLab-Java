// CalendarPrinter.java
// Print calendar for given month and year

import java.util.Scanner;

public class CalendarPrinter {

    // Get month name
    public static String getMonthName(int m) {
        String[] months = { "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December" };
        return months[m - 1];
    }

    // Check leap year
    public static boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    // Days in month
    public static int getDaysInMonth(int m, int y) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (m == 2 && isLeapYear(y)) return 29;
        return days[m - 1];
    }

    // Compute day of week for first day (0=Sunday,..6=Saturday) using formula provided
    public static int getFirstDayOfMonth(int month, int year) {
        int d = 1; // first day
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }

    public static void printCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int days = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        System.out.printf("     %s %d%n", monthName, year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // indentation
        for (int i = 0; i < firstDay; i++) System.out.print("    ");
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((firstDay + day) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter month (1-12): ");
            int m = sc.nextInt();
            System.out.print("Enter year: ");
            int y = sc.nextInt();
            if (m < 1 || m > 12) {
                System.out.println("Invalid month.");
                return;
            }
            printCalendar(m, y);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
