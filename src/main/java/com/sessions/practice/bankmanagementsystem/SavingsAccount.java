package com.sessions.practice.bankmanagementsystem;

public class SavingsAccount extends Account{

    // de salvat comisionale CONSTANTE FINAL
    // metode mai mici

    public SavingsAccount(String firstName, String lastName, String id, double balance, String passcode) {
        super(firstName, lastName, id, balance, passcode);
    }


    // Method to deposit money in SavingsAccount
    public void depositInSV(SavingsAccount acc, double amount) {
        double interestRate = 0.03;
        double appliedInterestRate = interestRate*amount;
        acc.setBalance(acc.getBalance() + amount + appliedInterestRate);
        System.out.println("Sum of " + amount + "$" + " was successfully deposited with " + interestRate + "% interesat rate");
    }


    // Method to withdraw money from SavingsAccount
    public void withdrawInSV(SavingsAccount acc, double amount) {
        double comision = 0.01;
        double commisionApplied = comision*amount;
        if(acc.getBalance() >= amount+commisionApplied) {
            acc.setBalance(acc.getBalance() - amount - commisionApplied);
            System.out.println("Operation done successfully");
        }else {
            System.out.println("Not enough funds");
        }
    }

}
