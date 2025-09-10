// Program 8: Bank Account Details

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        long accNo = sc.nextLong();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        System.out.println("\n=== Account Details ===");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);

        sc.close();
    }
}
