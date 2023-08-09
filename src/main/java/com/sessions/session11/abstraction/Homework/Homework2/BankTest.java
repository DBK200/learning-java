package com.sessions.session11.abstraction.Homework.Homework2;

public class BankTest {

    public static void main(String[] args) {

        BankA bankA = new BankA();
        System.out.println("BankA balance: " + bankA.getBalance());

        BankB bankB = new BankB();
        System.out.println("BankB balance: " + bankB.getBalance());

        BankC bankC = new BankC();
        System.out.println("BankC balance: " + bankC.getBalance());

    }
}
