// Program to convert distance in kilometers to miles
class KmToMilesConversion {
    public static void main(String[] args) {
        double kilometers = 10.8;
        double conversionFactor = 1.6;

        double miles = kilometers * conversionFactor;

        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}
