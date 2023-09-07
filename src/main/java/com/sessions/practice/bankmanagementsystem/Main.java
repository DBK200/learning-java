package com.sessions.practice.bankmanagementsystem;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static Scanner scanner;
    static ArrayList<CurrentAccount> cAccounts;
    static ArrayList<SavingsAccount> sAccounts;

    public static void main(String[] args) {

        cAccounts = new ArrayList<>();
        sAccounts = new ArrayList<>();
        scanner = new Scanner(System.in);


        int i=0;
        System.out.println("Welcome to bank management system ");
        do {
            System.out.println(" Please choose an option: ");
            System.out.println("1. Create new account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            i = scanner.nextInt();

            switch(i) {

                case 1 : new CreateAccount(scanner, cAccounts, sAccounts);
                    break;
                case 2: new Login(scanner, cAccounts, sAccounts);
                    break;
                case 3:
                    System.out.println("Exiting now");
                    break;
                default:
                    System.out.println("Please choose an option from the above, 1, 2 or 3");
                    break;
            }

        }while(i!=3);
    }

}
