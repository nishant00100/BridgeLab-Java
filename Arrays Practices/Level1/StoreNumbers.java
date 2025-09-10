// Program to store numbers until 0 or negative is entered, or max 10 numbers
import java.util.Scanner;

class StoreNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Infinite loop until condition breaks
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = input.nextDouble();

            if (num <= 0 || index == numbers.length) {
                break; // stop condition
            }

            numbers[index] = num;
            index++;
        }

        // Sum up values
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display results
        System.out.print("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nTotal sum = " + total);

        input.close();
    }
}
