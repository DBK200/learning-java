package com.sessions.session13.Homework.OOP1;

import com.sessions.session11.defaultMethod.R;

import java.util.Scanner;

public class BankAccount
{
    //Bank Account: Create a Bank Account class that has the following attributes:
    // account number, account type, balance, and
    //interest rate. Implement methods for depositing and withdrawing money,
    // calculating interest, and displaying the account
    //information.
    protected int accountNumber;
    protected String type;
    protected float balance;
    protected float interestRate;
    BankAccount(int accountNumber,String type,int balance,int interestRate)
    {
        this.accountNumber=accountNumber;
        this.type=type;
        this.balance=balance;
        this.interestRate=interestRate;
    }

    public static int depositing()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti suma pe care doriti sa o depuneti:");
        int suma=scanner.nextInt();
        return suma;
    }
    public static int withdrawing()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti suma pe care doriti sa o retrageti:");
        int suma2=scanner.nextInt();
        return suma2;
    }

    public static void main(String[] args)
    {
        BankAccount Roxana=new BankAccount(28742646,"hsvs",0,200/100);
        System.out.println("The balance before depositing:" +Roxana.balance);
        int sumaDepozitata=depositing();

        float rata=sumaDepozitata* Roxana.interestRate;

        Roxana.balance=Roxana.balance+rata;

        System.out.println("The balance after depositing:" +Roxana.balance);
        System.out.println("  ");
        System.out.println("The balance before withdrawing:"+Roxana.balance);
        int sum2=withdrawing();
        Roxana.balance=Roxana.balance-sum2;
        System.out.println("The balance after withdrawing:"+Roxana.balance);
    }

}
