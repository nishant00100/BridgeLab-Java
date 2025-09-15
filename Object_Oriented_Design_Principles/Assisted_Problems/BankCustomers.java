class Bank {
    String name;
    Bank(String name) { this.name = name; }
    void openAccount(Customer c) {
        System.out.println(c.name + " opened an account in " + name);
    }
}

class Customer {
    String name;
    double balance;
    Customer(String name, double balance) { this.name = name; this.balance = balance; }
    void viewBalance() { System.out.println(name + " has balance: $" + balance); }
}

public class BankCustomers {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank");
        Customer c = new Customer("Alice", 5000);
        bank.openAccount(c);
        c.viewBalance();
    }
}
