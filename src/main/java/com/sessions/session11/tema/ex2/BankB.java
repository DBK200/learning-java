package com.sessions.session11.tema.ex2;

public class BankB extends Bank
{
    public static void main(String[] args)
    {
        BankB myBank=new BankB();
        myBank.getBalance();
    }
    public void getBalance()
    {
        System.out.println("$200");
    }

}
