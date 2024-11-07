package sectionBfees;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("123456789", 1000.00);
        System.out.println("Initial balance: " + myAccount.getBalance());

        myAccount.deposit(500.00);
        System.out.println("Balance after deposit: " + myAccount.getBalance());

        myAccount.withdraw(300.00);
        System.out.println("Balance after withdrawal: " + myAccount.getBalance());

        myAccount.withdraw(2000.00); // This should show an error
    }
}
