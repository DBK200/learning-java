package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex7;

import com.sessions.session11.abstraction.defaultMethod.B;

import java.util.ArrayList;

public class BankTest {
    public static void main(String[] args) {

        Bank bank = new Bank();

        Account account1 = new Account("Jon", "EZ133", 3400);
        Account account2 = new Account("Mike", "IP421", 1200);

        bank.addAccount(account1);
        bank.addAccount(account2);

        ArrayList<Account> accounts = bank.getAccounts();

        for(Account account : accounts){
            System.out.println(account.displayAccount());
        }

        bank.depositMoney(account2, 3600);
        bank.withdrawMoney(account1, 1400);
        System.out.println(account1.displayAccount());
        System.out.println(account2.displayAccount());
    }
}
