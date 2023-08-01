package com.sessions.session8.HomeworkSession8;

public class BankAccount {
    // Properties
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Methods

    // Getters
    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(int amount){
        if(amount > 0){
            balance+= amount;
            System.out.println("You deposited the amount of " + amount +
                    "\nThe current balance is now " + getBalance());
        } else{
            System.out.println("Invalid amount to deposit. Try a positive amount");
        }
    }

    public void withdraw(int amount){
        if(amount>0){
            if(balance >= amount){
                balance-= amount;
                System.out.println("You withdrawn " + amount +
                        "\nThe current balance is now " + getBalance());
            } else{
                System.out.println("The amount you need is unavailable. The current balance is only " + getBalance());
            }
        }
    }
}
