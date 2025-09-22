// 6. Unit Converter (Set 3)
import java.util.*;

public class UnitConverter3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();
        System.out.println(c + "°C = " + ((c * 9 / 5) + 32) + "°F");

        System.out.print("Enter Pounds: ");
        double lb = sc.nextDouble();
        System.out.println(lb + " lb = " + (lb * 0.453592) + " kg");

        System.out.print("Enter Gallons: ");
        double gal = sc.nextDouble();
        System.out.println(gal + " gal = " + (gal * 3.78541) + " liters");
    }
}
