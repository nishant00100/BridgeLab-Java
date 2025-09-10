// Class to calculate total purchase price

import java.util.Scanner;

class PurchaseCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Inputs
        System.out.print("Enter unit price (INR): ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        // Total price calculation
        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice
                + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}
