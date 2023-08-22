package com.sessions.practice.w3resourceaug20;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accountList = new ArrayList<>();

    // Getter and setter
    public ArrayList<Account> getAccountList(){
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList){
        this.accountList = accountList;
    }

    // Function/ Method to add accounts to the accountList
    public void addAccount(Account acc, ArrayList<Account> accountList){
        accountList.add(acc);
        System.out.println("Account number " + acc.getAccountNumber() + " was added to the list");
    }

    // Function/ Method to remove accounts from accountList
    public void removeAccount(Account acc, ArrayList<Account> accountList){
        accountList.remove(acc);
        System.out.println("Account number " + acc.getAccountNumber() + " was removed from the list");
    }

    // Function/ Method to print the list of accounts
    public void printAccountList(ArrayList<Account> accountList){
        System.out.println("This list contains the following accounts: ");
        for(Account acc : accountList){
            System.out.println("The account with number " + acc.getAccountNumber() + " hold by " + acc.getAccountHolder()
            + " was successfully added to the list. Its balance is " + acc.getBalance() + " ");
        }
    }

}
