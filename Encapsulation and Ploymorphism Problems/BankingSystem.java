// Abstract class representing a general bank account

abstract class BankAccount {

    private int accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters and setters with encapsulation
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        if (accountNumber > 0) {
            this.accountNumber = accountNumber;
        }
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        if (holderName != null && !holderName.isEmpty()) {
            this.holderName = holderName;
        }
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Concrete methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Abstract method to calculate interest
    public abstract double calculateInterest();

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest: $" + calculateInterest());
    }
}

// Interface for loanable accounts
interface Loanable {

    void applyForLoan(double amount);

    boolean calculateLoanEligibility();
}

// Savings Account
class SavingsAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 0.04; // 4% annual interest

    public SavingsAccount(int accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan approved for $" + amount);
        } else {
            System.out.println("Loan denied. Eligibility criteria not met.");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 1000; // Simple eligibility check
    }
}

// Current Account
class CurrentAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 0.02; // 2% annual interest

    public CurrentAccount(int accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan approved for $" + amount);
        } else {
            System.out.println("Loan denied. Eligibility criteria not met.");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000; // Simple eligibility check
    }
}

// Demo class
public class BankingSystem {

    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount(101, "Alice", 2000);
        BankAccount acc2 = new CurrentAccount(102, "Bob", 6000);

        // Polymorphism: BankAccount reference
        BankAccount[] accounts = {acc1, acc2};

        for (BankAccount acc : accounts) {
            acc.displayAccountDetails();
            System.out.println("----------------------------");
        }

        // Loan processing using interface
        Loanable[] loanAccounts = {(Loanable) acc1, (Loanable) acc2};
        System.out.println("=== Loan Applications ===");
        for (Loanable la : loanAccounts) {
            la.applyForLoan(3000);
        }
    }
}
