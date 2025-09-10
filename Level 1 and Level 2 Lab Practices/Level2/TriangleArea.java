// Class to calculate the area of a triangle in cm² and in²

import java.util.Scanner;

class TriangleArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Base and height input in cm
        System.out.print("Enter base in cm: ");
        double baseCm = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        // Area in cm²
        double areaCm = 0.5 * baseCm * heightCm;

        // Convert cm to inches (1 inch = 2.54 cm)
        double baseInches = baseCm / 2.54;
        double heightInches = heightCm / 2.54;
        double areaInches = 0.5 * baseInches * heightInches;

        System.out.println("The Area of the triangle in sq cm is " + areaCm
                + " and in sq in is " + areaInches);
    }
}
