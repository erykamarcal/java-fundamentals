package javastudies.poo.bankAccount.application;

import javastudies.poo.bankAccount.entities.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter account holder: ");
        String accountHolder = scanner.nextLine();

        System.out.print("Is there an initial deposit? (y/n)");
        char initialDepositOption = scanner.next().charAt(0);

        if (initialDepositOption == 'y' || initialDepositOption == 'Y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = scanner.nextDouble();
            account = new Account(accountNumber, accountHolder, initialDeposit);
        }
        else {
            account = new Account(accountNumber, accountHolder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.println("Updated account data: ");
        System.out.println(account);


        System.out.println("Enter a withdraw value: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        System.out.println("Updated account data: ");
        System.out.println(account);

        scanner.close();
    }
}
