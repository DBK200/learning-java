package com.sessions.session11.Homework.Exercise2;

public  class CallBank {


    public static void main(String[] args) {
        BankAM bankAM = new BankAM();
        System.out.println(bankAM.getBalance());
        BankBM bankBM = new BankBM();
        System.out.println(bankBM.getBalance());
        BankCM bankCM = new BankCM();
        System.out.println(bankCM.getBalance());
    }
}
