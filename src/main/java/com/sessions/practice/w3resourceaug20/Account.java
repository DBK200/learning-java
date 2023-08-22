package com.sessions.practice.w3resourceaug20;

public class Account {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // No args constructor
    public Account(){

    }

    // Parameterized Constructor
    public Account(String accountHolder, int accountNumber, double balance ){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters and setters
    // Getters
    public String getAccountHolder(){
        return accountHolder;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    // Setters
    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber= accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }


}
