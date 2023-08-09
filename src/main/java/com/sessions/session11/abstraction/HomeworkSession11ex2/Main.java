package com.sessions.session11.abstraction.HomeworkSession11ex2;

public class Main {

    public static void main(String[] args) {

        // Creating objects of classes BankA, BankB, BankC and calling the method implemented by these classes

        BankA objA = new BankA();
        objA.getBalance();
        System.out.println();

        BankB objB = new BankB();
        objB.getBalance();
        System.out.println();

        BankC objC = new BankC();
        objC.getBalance();
    }
}
