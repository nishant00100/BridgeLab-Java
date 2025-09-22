// 5. Unit Converter (Set 2)
import java.util.*;

public class UnitConverter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter yards: ");
        double yd = sc.nextDouble();
        System.out.println(yd + " yd = " + (yd * 3) + " feet");

        System.out.print("Enter meters: ");
        double m = sc.nextDouble();
        System.out.println(m + " m = " + (m * 39.3701) + " inches");

        System.out.print("Enter inches: ");
        double in = sc.nextDouble();
        System.out.println(in + " in = " + (in * 2.54) + " cm");
    }
}
