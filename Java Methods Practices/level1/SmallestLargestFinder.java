import java.util.Scanner;

class SmallestLargestFinder {
    public int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();

        SmallestLargestFinder finder = new SmallestLargestFinder();
        int[] result = finder.findSmallestAndLargest(number1, number2, number3);

        System.out.println("Smallest: " + result[0] + ", Largest: " + result[1]);
        scanner.close();
    }
}
