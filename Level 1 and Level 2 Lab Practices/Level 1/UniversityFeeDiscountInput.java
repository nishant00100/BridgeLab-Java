
import java.util.Scanner;

// Program to calculate fee after discount using user input
class UniversityFeeDiscountInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student fee: ");
        double fee = input.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercent = input.nextDouble();

        double discountAmount = (fee * discountPercent) / 100;
        double discountedFee = fee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount
                + " and final discounted fee is INR " + discountedFee);

        input.close();
    }
}
