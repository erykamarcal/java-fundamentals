package javastudies.poo.fundamentals.bankAccount.entities;

public class Account {
    private final int number;
    private String holder;
    private double balance;

    public Account (int number, String holder){
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialAmount) {
        this.number = number;
        this.holder = holder;
        deposit(initialAmount);
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
    }

    public void withdraw(double withdrawAmount) {
        balance -= withdrawAmount + 5;
    }

    public String toString() {
        return "Account " + number
                + ", Holder: " + holder
                + String.format(", Balance: $ %.2f", balance);
    }
}
