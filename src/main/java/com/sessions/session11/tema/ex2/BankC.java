package com.sessions.session11.tema.ex2;

public class BankC extends Bank
{
    public static void main(String[] args)
    {
        BankC myBank=new BankC();
        myBank.getBalance();
    }
    public void getBalance()
    {
        System.out.println("$300");
    }

}
