package com.sessions.session11.abstraction.HomeworkAV.challenge2;

public class BankC extends Bank {
    private int balance = 0;
    @Override
    public int getBalance() {
        return balance;
    }
    public void addDeposit() {
        balance += 200;
    }
}
