package javastudies.poo.inheritance.bankAccount.application;

import javastudies.poo.inheritance.bankAccount.entities.Account;
import javastudies.poo.inheritance.bankAccount.entities.BusinessAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1010, "Pedro", 0.0);
        BusinessAccount bacc = new BusinessAccount(1011, "Maria", 0.0, 500.0);


    }
}
