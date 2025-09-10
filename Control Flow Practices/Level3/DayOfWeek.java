public class DayOfWeek {
    public static void main(String[] args) {
        // Take input as command line arguments
        int m = Integer.parseInt(args[0]); // month
        int d = Integer.parseInt(args[1]); // day
        int y = Integer.parseInt(args[2]); // year

        // Apply Zeller’s Congruence formulas
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Print the result (0 = Sunday, ..., 6 = Saturday)
        System.out.println(d0);
    }
}
