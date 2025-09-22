import java.util.Scanner;

class ChocolateDistributor {
    public int[] distributeChocolates(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = scanner.nextInt();

        ChocolateDistributor distributor = new ChocolateDistributor();
        int[] result = distributor.distributeChocolates(numberOfChocolates, numberOfChildren);

        System.out.println("Each child gets " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);

        scanner.close();
    }
}
