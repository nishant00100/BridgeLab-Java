import java.util.Scanner;

class TriangularParkRunner {
    public int calculateRounds(double sideA, double sideB, double sideC, double runDistance) {
        double perimeter = sideA + sideB + sideC;
        return (int) Math.ceil(runDistance / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side A of the triangle: ");
        double sideA = scanner.nextDouble();
        System.out.print("Enter side B of the triangle: ");
        double sideB = scanner.nextDouble();
        System.out.print("Enter side C of the triangle: ");
        double sideC = scanner.nextDouble();

        double targetDistance = 5000; // 5 km in meters

        TriangularParkRunner runner = new TriangularParkRunner();
        int rounds = runner.calculateRounds(sideA, sideB, sideC, targetDistance);

        System.out.println("The athlete must complete " + rounds + " rounds to cover 5 km.");
        scanner.close();
    }
}
