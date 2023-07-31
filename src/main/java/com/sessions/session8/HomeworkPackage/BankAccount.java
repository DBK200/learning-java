package com.sessions.session8.HomeworkPackage;

import java.text.DecimalFormat;

public class BankAccount {

    private double ronBalance;
    private String accountHolderName;

    private double eurBalance;

    private final DecimalFormat decimalFormat = new DecimalFormat("#.00");

    public BankAccount(double ronBalance, double eurBalance, String accountHolderName){
        this.ronBalance = ronBalance;
        this.eurBalance = eurBalance;
        this.accountHolderName = accountHolderName;
    }
    public double getRonBalance(){
        System.out.print("RON balance is: ");
        return ronBalance;
    }
    public double getEurBalance(){
        System.out.print("EUR balance is: ");
        return eurBalance;
    }
    public String getAccountHolderName(){
        System.out.print("Account holder name: ");
        return accountHolderName;
    }
    public String convertEurBalanceToRon(){
        double newRonBalance = ronBalance + (eurBalance * 4.93);
        return "New EUR balance after converting all EUR to RON is: "  + decimalFormat.format(newRonBalance);
    }
    public String convertRonBalanceToEur(){
        double newEurBalance = eurBalance + (ronBalance / 4.93);
        return "New RON balance after converting all RON to EUR is: " + decimalFormat.format(newEurBalance);
    }
    }
