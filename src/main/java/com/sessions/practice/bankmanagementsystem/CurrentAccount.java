package com.sessions.practice.bankmanagementsystem;

public class CurrentAccount extends Account{

    // Constants
    public static final double DEPOSIT_FEE=1.37;
    public static final double WITHDRAW_FEE=2.17;
    // All args constructor
    public CurrentAccount(String firstName, String lastName, String id, double balance, String passcode) {
        super(firstName, lastName, id, balance, passcode);
    }


    // Method to deposit money in CurrentAccount
    public void depositInCR(CurrentAccount acc, double amount) {
        //double depositFee = 1.37;
        if(amount > DEPOSIT_FEE*2) {
            acc.setBalance(acc.getBalance() + amount - DEPOSIT_FEE);
            System.out.println("You have successfully deposited " + amount + "$");
        } else {
            System.out.println("You have to deposit at least " + 2*DEPOSIT_FEE + "$");
        }
    }


    // Method to withdraw money from CurrentAccount
    public void withdrawFromCR(CurrentAccount acc, double amount) {
        //double withdrawFee = 2.17;
        if(acc.getBalance() >= amount + WITHDRAW_FEE) {
            acc.setBalance(acc.getBalance()-amount-WITHDRAW_FEE);
            System.out.println("You have successfully withdrawn " + amount +"$");
        } else {
            System.out.println("Not enough funds. You need to have at least " + (amount + WITHDRAW_FEE) + " in your account"
                    + " to withdraw " + amount + "$ because of the 2.17 withdraw fee.");
        }
    }
}


