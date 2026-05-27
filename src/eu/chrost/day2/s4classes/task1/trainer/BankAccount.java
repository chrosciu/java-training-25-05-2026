package eu.chrost.day2.s4classes.task1.trainer;

public class BankAccount {
    public String accountNumber;
    public double balance;

    public BankAccount() {
        this("0000");
    }

    public BankAccount(String accountNumber) {
        this(accountNumber, 0.0);
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        //walidacje, ktore powinny byc tylko w jednym miejscu
        if (accountNumber.isBlank()) {
            throw new IllegalStateException("Account number cannot be blank");
        }
        if (balance < 0) {
            throw new IllegalStateException("Negative balance not allowed");
        }
    }

    public void print() {
        System.out.println("Dane konta:" + accountNumber);
        System.out.println("Balans:" + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        }
    }

}

