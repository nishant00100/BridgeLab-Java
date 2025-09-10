import java.util.Scanner;

// Program to find youngest and tallest among Amar, Akbar, and Anthony
class FriendsComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int friendCount = 3;
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[friendCount];
        double[] heights = new double[friendCount];

        // Input ages and heights
        for (int i = 0; i < friendCount; i++) {
            System.out.println("\nEnter details for " + names[i] + ":");

            // Age validation
            while (true) {
                System.out.print("Enter Age: ");
                ages[i] = input.nextInt();
                if (ages[i] > 0) break;
                System.err.println("Invalid age. Enter a positive value.");
            }

            // Height validation
            while (true) {
                System.out.print("Enter Height (in cm): ");
                heights[i] = input.nextDouble();
                if (heights[i] > 0) break;
                System.err.println("Invalid height. Enter a positive value.");
            }
        }

        // Find youngest
        int youngestIndex = 0;
        for (int i = 1; i < friendCount; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find tallest
        int tallestIndex = 0;
        for (int i = 1; i < friendCount; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\nYoungest Friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        input.close();
    }
}
