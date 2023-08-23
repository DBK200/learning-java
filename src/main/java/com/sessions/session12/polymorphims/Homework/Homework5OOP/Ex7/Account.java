package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex7;

public class Account {
    private String name;
    private String accountNum;
    private double balance;

    public Account(String name, String accountNum, double balance){
        this.name = name;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount){
        this.balance -= amount;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public String displayAccount(){
        return "Name: " + name + ", Account Number: " + accountNum + ", Balance: " + balance;
    }
}
