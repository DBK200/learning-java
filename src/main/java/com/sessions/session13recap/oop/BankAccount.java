package com.sessions.session13recap.oop;

public class BankAccount {

    // 1. Bank Account: Create a Bank Account class that has the following attributes:
    // account number, account type, balance, and interest rate.
    // Implement methods for depositing and withdrawing money, calculating interest
    // and displaying the account information.

    // Attributes / properties
    private int accountNumber;
    private String accountType;
    private double balance;
    private double interestRate;

    // All args constructor
    public BankAccount(int accountNumber, String accountType, double balance, double interestRate){
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // Getters and setters
    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    // Setters
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Method to deposit money
    public void deposit(double amount){
        if(amount > 0){
            balance+=amount;
            System.out.println("You successfully deposited " + amount + ". The new balance is " + balance);
        } else{
            System.out.println("Enter a positive amount");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount){
        if(amount > 0 ){
            if(amount <= balance){
                balance-=amount;
                System.out.println("You successfully withdrawn " + amount + ". The new balance is " + balance);
            } else{
                System.out.println("Not enough funds");
            }
            }else{
            System.out.println("Enter a positive amount");
        }
    }

    // Method to calculate interest rate
    public void calculateInterestRate(){
        double interest = balance/(interestRate*100);
        balance+=interest;
        System.out.println("Interest of " + interest + " was added to the account " + accountNumber);
    }

    // Method to print account information
    public void printAccountDetails(){
        System.out.println("Account number: " + accountNumber +
                "\nAccount type: " + accountType +
                "\nBalance: " + balance +
                "\nInterest Rate: " + interestRate);
    }
}
