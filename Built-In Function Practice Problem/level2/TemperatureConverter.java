import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        System.out.print("Convert to (C/F): ");
        char choice = sc.next().charAt(0);

        if (choice == 'C' || choice == 'c')
            System.out.println("Result: " + toCelsius(temp) + " °C");
        else if (choice == 'F' || choice == 'f')
            System.out.println("Result: " + toFahrenheit(temp) + " °F");
        else
            System.out.println("Invalid choice");
    }

    public static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
