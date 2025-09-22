import java.util.Scanner;

class TrigonometricCalculator {
    public double[] calculateTrigonometricFunctions(double angleInDegrees) {
        double radians = Math.toRadians(angleInDegrees);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();

        TrigonometricCalculator calculator = new TrigonometricCalculator();
        double[] results = calculator.calculateTrigonometricFunctions(angle);

        System.out.println("Sine(" + angle + ") = " + results[0]);
        System.out.println("Cosine(" + angle + ") = " + results[1]);
        System.out.println("Tangent(" + angle + ") = " + results[2]);

        scanner.close();
    }
}
