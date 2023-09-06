package com.sessions.practice.bankmanagementsystem;

public class SavingsAccount extends Account{

    // de salvat comisionale CONSTANTE FINAL
    // metode mai mici
    public static final double INTEREST_RATE = 0.03;
    public static final double COMMISSION = 0.01;
    public SavingsAccount(String firstName, String lastName, String id, double balance, String passcode) {
        super(firstName, lastName, id, balance, passcode);
    }


    // Method to deposit money in SavingsAccount
    public void depositInSV(SavingsAccount acc, double amount) {
        //double interestRate = 0.03;
        double appliedInterestRate = INTEREST_RATE*amount;
        acc.setBalance(acc.getBalance() + amount + appliedInterestRate);
        System.out.println("Sum of " + amount + "$" + " was successfully deposited with " + INTEREST_RATE + "% interesat rate");
    }


    // Method to withdraw money from SavingsAccount
    public void withdrawInSV(SavingsAccount acc, double amount) {
        //double comision = 0.01;
        double commissionApplied = COMMISSION*amount;
        if(acc.getBalance() >= amount+commissionApplied) {
            acc.setBalance(acc.getBalance() - amount - commissionApplied);
            System.out.println("Operation done successfully");
        }else {
            System.out.println("Not enough funds");
        }
    }

}
