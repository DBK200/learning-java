package com.sessions.session11.Homework11.II;

public class Test2 {

    public static void main(String[] args) {


        BankA bankA = new BankA();
        BankB bankB=new BankB();
        BankC bankC=new BankC();

        System.out.println("BankA balance: "+bankA.getBalance());
        System.out.println("BankB balance: "+bankB.getBalance());
        System.out.println("BankC balance: "+bankC.getBalance());
    }

}

