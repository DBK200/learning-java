package com.sessions.session13.recap.Ex26;

public class BankAccount {

    private String accountNumber;
    private String accountType;
    private double balance;
    private double interestRate;

    public BankAccount(String accountNumber, String accountType, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount){
        balance -= amount;
        System.out.println("Withdraw: " + amount);
    }
    public void calculateInterest(){
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest: " + interest);
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
