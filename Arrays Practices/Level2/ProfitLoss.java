// Program 3: Profit or Loss

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price: ");
        double cp = sc.nextDouble();

        System.out.print("Enter Selling Price: ");
        double sp = sc.nextDouble();

        if (sp > cp) {
            System.out.println("Profit = " + (sp - cp));
        } else if (sp < cp) {
            System.out.println("Loss = " + (cp - sp));
        } else {
            System.out.println("No Profit, No Loss");
        }

        sc.close();
    }
}
