package com.sessions.session13recap.OOP1.Exercise1;

public class BankAccount {
    private int accountNumber;
    private String accountType;
    private int balance;
    private int interestRate;
    public BankAccount(int accountNumber, String accountType, int balance, int interestRate) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    public void displayAccountInfo() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account type: " + accountType);
        System.out.println("Balance: " + balance);
        System.out.println("Interest rate: " + interestRate);
    }
    public void depositMoney(int sum) {
        balance += sum;
    }
    public void withdrawMoney(int sum) {
        balance -= sum;
    }
    public float calculateInterest() {
        return balance * interestRate / (float)100;
    }
}