package com.sessions.recap.OOP;

public class BankAccount {

//    Bank Account: Create a Bank Account class that has the following attributes:
//    account number, account type, balance, and interest rate. Implement methods
//        for depositing and withdrawing money, calculating interest, and displaying
//    the account information.

    private int accountNumber;
    private String accountType;
    private float balance;
    private float interestRate;

    public BankAccount(int accountNumber, String accountType, float balance, float interestRate)
    {
        this.accountNumber=accountNumber;
        this.accountType=accountType;
        this.balance=balance;
        this.interestRate=interestRate;
    }

    public void depositing(float x){
        balance+=x;
        System.out.println("The amount of"+x+accountType+" was deposited in your account");
        System.out.println("The balance of the account is now "+balance+accountType);
    }
    public void withdrawing(float x){
        if(x<balance)
        {
            balance-=x;

            System.out.println("The amount of"+x+accountType+" was withdrawn from your account");
            System.out.println("The balance of the account is now "+balance+accountType);
        }
        else
            System.out.println("Insufficient fund");
    }

    public void  calculatingInterest(float x){
       float interest=x*interestRate/100;
        System.out.println("The interest for the amount of "+x+accountType+" is "+interest+accountType);
    }

    public void accountInformation()
    {
        System.out.println("The account number is "+accountNumber);
        System.out.println("The account type is "+accountType);
        System.out.println("The account balance is "+balance+accountType);
        System.out.println("The account interest rate is "+interestRate+"%");
    }
}
