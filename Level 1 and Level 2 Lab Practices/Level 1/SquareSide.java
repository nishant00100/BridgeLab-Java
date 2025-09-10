
import java.util.Scanner;

// Program to find side of square from perimeter
class SquareSide {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter perimeter of square: ");
        double perimeter = input.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        input.close();
    }
}
