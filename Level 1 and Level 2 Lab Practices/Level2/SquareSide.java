// Class to find side length from given perimeter

import java.util.Scanner;

class SquareSide {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take perimeter input
        System.out.print("Enter perimeter of square: ");
        double perimeter = input.nextDouble();

        // Side calculation
        double side = perimeter / 4;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
