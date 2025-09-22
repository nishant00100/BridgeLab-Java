import java.util.Scanner;

public class EuclideanLine {

    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // returns double[]{slope, intercept}, slope = Double.POSITIVE_INFINITY for vertical line
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        if (Math.abs(x2 - x1) < 1e-9) {
            return new double[]{Double.POSITIVE_INFINITY, Double.NaN};
        }
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();

        System.out.printf("Euclidean distance: %.4f%n", euclideanDistance(x1,y1,x2,y2));
        double[] eq = lineEquation(x1,y1,x2,y2);
        if (Double.isInfinite(eq[0])) {
            System.out.println("Line is vertical: x = " + x1);
        } else {
            System.out.printf("Line equation: y = %.4fx + %.4f%n", eq[0], eq[1]);
        }
    }
}
