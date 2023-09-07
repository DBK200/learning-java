package com.sessions.practice.bankmanagementsystem;
import java.util.Scanner;
import java.util.ArrayList;

public class CreateAccount {

    static int currentAccountId =1000000;
    static int savingsAccountId = 2000000;


    public CreateAccount(Scanner scanner, ArrayList<CurrentAccount> cAccounts, ArrayList<SavingsAccount> sAccounts) {
        System.out.println("Enter first name: ");
        String firstName = scanner.next();

        System.out.println("Enter last name: ");
        String lastName = scanner.next();

        System.out.println("Enter balance: ");
        double balance = scanner.nextDouble();


        // de facut functie separata
        String passcode = scanner.nextLine();
        boolean passcodeIsValid = false;

        while(!passcodeIsValid) {
            System.out.println("Type a pin code of 4 digits: ");
            passcode = scanner.nextLine();
            passcodeIsValid = passcode!=null && passcode.length() == 4 && passcode.matches("[0-9]+");
        }

        System.out.println("Correct pin size");


        System.out.println("Choose the type of account you want to open.\n1.Current account\n2.Savings account");

        int accountOption = scanner.nextInt();

        switch(accountOption) {

            case 1:
                currentAccountId++;
                String idNou = Integer.toString(currentAccountId) + "CR";
                CurrentAccount crAcc =  new CurrentAccount(firstName, lastName, idNou, balance, passcode);
                cAccounts.add(crAcc);
                System.out.println("You created a current account.\nYour account id: " + idNou); // se afiseaza id-ul creat pt contul curent
                new Menu(scanner, crAcc);
                break;

            case 2:
                savingsAccountId++;
                String idNou2 = Integer.toString(savingsAccountId) + "SV";
                SavingsAccount saveAcc =  new SavingsAccount(firstName, lastName, idNou2, balance, passcode);
                sAccounts.add(saveAcc);
                System.out.println("You created a savings account.\nYour account id: " + idNou2); // se afiseaza id-ul creat pt contul de economii
                new Menu(scanner, saveAcc);
                break;

            default:
                System.out.println("Please choose an option from the above, 1 or 2");
                break;

        }
    }
}
