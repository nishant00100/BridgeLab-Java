import java.util.Scanner;

public class LineEquationCalculator {

    public static double calculateEuclideanDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] calculateLineEquation(int x1, int y1, int x2, int y2) {
        double slope = (double) (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1 y1: ");
        int x1 = scanner.nextInt(), y1 = scanner.nextInt();
        System.out.print("Enter x2 y2: ");
        int x2 = scanner.nextInt(), y2 = scanner.nextInt();

        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        double[] line = calculateLineEquation(x1, y1, x2, y2);

        System.out.println("Euclidean Distance: " + distance);
        System.out.println("Line Equation: y = " + line[0] + "x + " + line[1]);
    }
}
