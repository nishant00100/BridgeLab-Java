
class BankAccount {

    int accountNumber;
    double balance;

    BankAccount(int acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }
}

class SavingsAccount extends BankAccount {

    double interestRate;

    SavingsAccount(int acc, double bal, double rate) {
        super(acc, bal);
        interestRate = rate;
    }

    void displayAccountType() {
        System.out.println("Savings Account | Balance: " + balance + " | Interest Rate: " + interestRate);
    }
}

class CheckingAccount extends BankAccount {

    double withdrawalLimit;

    CheckingAccount(int acc, double bal, double limit) {
        super(acc, bal);
        withdrawalLimit = limit;
    }

    void displayAccountType() {
        System.out.println("Checking Account | Balance: " + balance + " | Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {

    double maturityAmount;

    FixedDepositAccount(int acc, double bal, double maturity) {
        super(acc, bal);
        maturityAmount = maturity;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account | Balance: " + balance + " | Maturity: " + maturityAmount);
    }
}

public class BankTest {

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(101, 5000, 5);
        CheckingAccount c = new CheckingAccount(102, 3000, 1000);
        FixedDepositAccount f = new FixedDepositAccount(103, 10000, 12000);
        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}
