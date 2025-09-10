// Program to calculate mean height of 11 players
import java.util.Scanner;

class MeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0.0;

        // Input heights
        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        // Calculate mean
        double mean = sum / heights.length;
        System.out.println("Mean height of football team = " + mean);

        input.close();
    }
}
