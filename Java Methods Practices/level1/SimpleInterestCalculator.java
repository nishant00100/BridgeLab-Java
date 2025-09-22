import java.util.Scanner;

class SimpleInterestCalculator {
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

        SimpleInterestCalculator calculator = new SimpleInterestCalculator();
        double simpleInterest = calculator.calculateSimpleInterest(principal, rate, time);

        System.out.println("The Simple Interest is " + simpleInterest +
                " for Principal " + principal + ", Rate " + rate + "% and Time " + time + " years.");
        scanner.close();
    }
}
