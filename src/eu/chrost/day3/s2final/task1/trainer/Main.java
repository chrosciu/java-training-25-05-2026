package eu.chrost.day3.s2final.task1.trainer;

import eu.chrost.day2.s4classes.task1.trainer.BankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("1234", 15);
        BankAccount account2 = new BankAccount("4321");
        BankAccount account3 = new BankAccount();

        account1.print();
        account2.print();
        account3.print();

        account1.deposit(45);
        account2.deposit(30);
        account3.deposit(10);

        System.out.println("######");

       account1.print();
       account2.print();
       account3.print();

       account1.withdraw(61);
       account2.withdraw(25);
       account3.withdraw(5);

       account1.print();
       account2.print();
       account3.print();


       BankAccount account4 = new BankAccount ("");
    }
}
