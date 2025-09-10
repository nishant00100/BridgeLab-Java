// Class to convert distance in feet into yards and miles

import java.util.Scanner;

class DistanceConversion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take distance input
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Conversion
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance in yards is " + distanceInYards
                + " while the distance in miles is " + distanceInMiles);
    }
}
