package com.sessions.practice.bankmanagementsystem;
import java.util.Scanner;
import java.util.ArrayList;

public class Login {
    public Login(Scanner scanner, ArrayList<CurrentAccount> cAccounts, ArrayList<SavingsAccount> sAccounts) {
        System.out.println("Enter first name: ");
        String firstName = scanner.next();
        scanner.nextLine();

        System.out.println("Enter last name: ");
        String lastName = scanner.next();
        scanner.nextLine();

        System.out.println("Enter balance: ");
        double balance = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter account id: ");
        String id = scanner.next();
        scanner.nextLine();

        System.out.println("Enter passcode:");
        String passcode = scanner.next();
        scanner.nextLine();


        boolean existAsCurrent = false;
        boolean existAsSavings = false;

        CurrentAccount cA = new CurrentAccount(firstName, lastName, id, balance, passcode);
        for(CurrentAccount cr : cAccounts) {
            if(cr.getId().equals(cA.getId()) && cr.getPasscode().equals(cA.getPasscode())) {
                System.out.println("Current account found");
                existAsCurrent = true;
            } else {
                System.out.println("Account not found of type current");
            }
        }


        SavingsAccount sA = new SavingsAccount(firstName, lastName, id, balance, passcode);
        for(SavingsAccount sv : sAccounts) {
            if(sv.getId().equals(id) && sv.getPasscode().equals(sA.getPasscode())) {
                System.out.println("Savings Account found");
                existAsSavings = true;
            } else {
                System.out.println("Account not found of type savings");
            }
        }


        if(existAsCurrent) {
            new Menu(scanner, cA);
        } else if(existAsSavings) {
            new Menu(scanner, sA);
        } else {
            System.out.println("Account doesn't exist");
        }
    }

}
