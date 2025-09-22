// 11. Quadratic Equation Roots
import java.util.*;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficients a, b, c: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        double d = b * b - 4 * a * c;
        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Two real roots: " + r1 + " and " + r2);
        } else if (d == 0) {
            double r = -b / (2 * a);
            System.out.println("One real root: " + r);
        } else {
            double real = -b / (2 * a);
            double imag = Math.sqrt(-d) / (2 * a);
            System.out.println("Complex roots: " + real + " ± " + imag + "i");
        }
    }
}
