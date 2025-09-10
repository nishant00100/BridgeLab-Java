// package com.bridgelabz.oops.inbuiltfunction;

public class BankAccount {
    // Static variables
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    // Final + instance variables
    private final String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor with 'this'
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    // Static method
    public static void getTotalAccounts() {
        System.out.println("Total number of accounts: " + totalAccounts);
    }

    // Display details (with instanceof)
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        }
    }

    // Encapsulation
    public String getAccountHolderName() { return accountHolderName; }
    public void setAccountHolderName(String accountHolderName) { this.accountHolderName = accountHolderName; }
    public double getBalance() { return balance; }

    // Business logic
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else System.out.println("Invalid deposit amount.");
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else System.err.println("Insufficient balance or invalid amount.");
    }

    // Test
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Lynda Princy", "ACC12345", 1000.00);
        BankAccount acc2 = new BankAccount("Prince Danish", "ACC67890", 500.00);

        acc1.displayAccountDetails();
        System.out.println();
        acc2.displayAccountDetails();

        BankAccount.getTotalAccounts();

        acc1.deposit(200);
        acc1.withdraw(150);
        acc1.displayAccountDetails();
    }
}