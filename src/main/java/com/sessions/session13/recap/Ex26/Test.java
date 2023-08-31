package com.sessions.session13.recap.Ex26;

public class Test {

    //Create a Bank Account class that has the following attributes: account number, account type, balance, and interest rate.
    // Implement methods for depositing and withdrawing money, calculating interest, and displaying the account information.


    public static void main(String[] args) {

        BankAccount account = new BankAccount("3422231", "Savings", 500, 4.2);

        account.displayAccountInfo();
        account.withdraw(250);
        account.deposit(1000);
        account.calculateInterest();
        account.displayAccountInfo();
        account.calculateInterest();

    }
}
