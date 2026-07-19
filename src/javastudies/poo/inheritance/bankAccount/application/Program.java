package javastudies.poo.inheritance.bankAccount.application;

import javastudies.poo.inheritance.bankAccount.entities.Account;
import javastudies.poo.inheritance.bankAccount.entities.BusinessAccount;
import javastudies.poo.inheritance.bankAccount.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account account = new Account(1001, "Alex", 1000.0);

        BusinessAccount businessAccount =
                new BusinessAccount(1002, "Maria", 1000.0, 500.0);

        SavingsAccount savingsAccount =
                new SavingsAccount(1003, "Bob", 1000.0, 0.01);

        System.out.println("=== Initial balances ===");
        System.out.println("Account: $" + account.getBalance());
        System.out.println("Business Account: $" + businessAccount.getBalance());
        System.out.println("Savings Account: $" + savingsAccount.getBalance());

        System.out.println();

        account.withdraw(100.0);
        businessAccount.withdraw(100.0);
        savingsAccount.withdraw(100.0);

        System.out.println("=== After withdraw ===");
        System.out.println("Account: $" + account.getBalance());
        System.out.println("Business Account: $" + businessAccount.getBalance());
        System.out.println("Savings Account: $" + savingsAccount.getBalance());

        System.out.println();

        businessAccount.loan(300.0);
        savingsAccount.updateBalance();

        System.out.println("=== Final balances ===");
        System.out.println("Account: $" + account.getBalance());
        System.out.println("Business Account: $" + businessAccount.getBalance());
        System.out.println("Savings Account: $" + savingsAccount.getBalance());
    }
}
