package javastudies.poo.exceptionHandling.bankAccountWithdrawal.application;

import javastudies.poo.exceptionHandling.bankAccountWithdrawal.model.entities.Account;
import javastudies.poo.exceptionHandling.bankAccountWithdrawal.model.exceptions.DomainException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = scanner.nextInt();
        System.out.print("Holder: ");
        scanner.nextLine();
        String holder = scanner.nextLine();
        System.out.print("Initial balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = scanner.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.print("Enter amount for withdraw: ");
        double amount = scanner.nextDouble();


        try {
            account.withdraw(amount);
            System.out.printf("New balance: %.2f%n", account.getBalance());

        } catch (DomainException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
