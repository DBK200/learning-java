package com.sessions.session13recap.OOP1.Exercise1;

public class Application {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(123, "debit", 3000, 5);
        bankAccount.depositMoney(230);
        bankAccount.withdrawMoney(100);
        bankAccount.displayAccountInfo();
        System.out.println("Interest: " + bankAccount.calculateInterest());
    }
}
