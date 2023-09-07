package com.sessions.homework13plus.h13.OOP1;

public class BankAccount {
    double balance;
    //Bank Account: Create a Bank Account class that has the following attributes: account number, account type, balance, and
    //interest rate. Implement methods for depositing and withdrawing money, and displaying the account
    //information.
    int accountNumber;
    String accountType;

    public BankAccount(double balance, int accountNumber, String accountType) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public static void main(String[] args) {
        BankAccount cont1 = new BankAccount(0, 3432234, "credit");
        cont1.setBalance(100);
        cont1.displayBalance();
        cont1.depositMoney(10);
        cont1.displayBalance();
        cont1.withdrawMoney(38);
        cont1.displayBalance();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    private void depositMoney(int sum) {
        this.balance += sum;
    }

    private void withdrawMoney(int sum) {
        this.balance -= sum;
    }

    private void displayBalance() {
        System.out.println(this.balance);
    }
}
