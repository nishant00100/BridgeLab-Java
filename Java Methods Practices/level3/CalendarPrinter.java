import java.util.Scanner;

public class CalendarPrinter {

    private static final String[] MONTH_NAMES = {
        "January","February","March","April","May","June","July","August","September","October","November","December"
    };

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static int daysInMonth(int month, int year) {
        int[] mdays = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (month == 2 && isLeapYear(year)) return 29;
        return mdays[month - 1];
    }

    // Zeller's Congruence (adjusted) to find day-of-week for Gregorian calendar:
    // returns 0=Sunday .. 6=Saturday
    public static int firstDayOfMonth(int month, int year) {
        int q = 1;
        int m = month;
        int Y = year;
        if (m == 1) { m = 13; Y = year - 1; }
        if (m == 2) { m = 14; Y = year - 1; }
        int K = Y % 100;
        int J = Y / 100;
        int h = (q + (13*(m+1))/5 + K + K/4 + J/4 + 5*J) % 7;
        int d = ((h + 6) % 7); // convert Zeller result to 0=Sunday..6=Saturday
        return d;
    }

    public static void printCalendar(int month, int year) {
        System.out.println("     " + MONTH_NAMES[month - 1] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");
        int firstDay = firstDayOfMonth(month, year);
        int days = daysInMonth(month, year);

        // indentation for first line
        for (int i = 0; i < firstDay; i++) System.out.print("   ");

        for (int day = 1; day <= days; day++) {
            System.out.printf("%2d ", day);
            if ((firstDay + day) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        printCalendar(month, year);
    }
}
