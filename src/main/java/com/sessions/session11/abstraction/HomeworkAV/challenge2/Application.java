package com.sessions.session11.abstraction.HomeworkAV.challenge2;

public class Application {
    public static void main(String[] args) {

        BankA A = new BankA();
        A.addDeposit();
        BankB B = new BankB();
        B.addDeposit();
        BankC C = new BankC();
        C.addDeposit();

        System.out.println("Balance of Bank A: " + A.getBalance());
        System.out.println("Balance of Bank B: " + B.getBalance());
        System.out.println("Balance of Bank C: " + C.getBalance());
    }
}
