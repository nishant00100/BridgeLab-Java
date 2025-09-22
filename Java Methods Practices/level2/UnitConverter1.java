// 4. Unit Converter (Set 1)
import java.util.*;

public class UnitConverter1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter kilometers: ");
        double km = sc.nextDouble();
        System.out.println(km + " km = " + (km * 0.621371) + " miles");

        System.out.print("Enter meters: ");
        double m = sc.nextDouble();
        System.out.println(m + " m = " + (m * 3.28084) + " feet");
    }
}
