
import java.util.Scanner;

// Program to convert distance from feet to yards and miles
class DistanceConversion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        System.out.println("The distance " + distanceInFeet + " feet is " + yards
                + " yards and " + miles + " miles");

        input.close();
    }
}
