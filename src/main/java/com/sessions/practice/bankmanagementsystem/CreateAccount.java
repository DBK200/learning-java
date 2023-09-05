package com.sessions.practice.bankmanagementsystem;
import java.util.Scanner;
import java.util.ArrayList;

public class CreateAccount {

    static int currentAccountId =1000000;
    static int savingsAccountId = 200000;

    //public CreateAccount(Scanner scanner, int lastaccid, ArrayList<CurrentAccount> cAccounts, ArrayList<SavingsAccount> sAccounts) {
    public CreateAccount(Scanner scanner, ArrayList<CurrentAccount> cAccounts, ArrayList<SavingsAccount> sAccounts) {
        System.out.println("Enter first name: ");
        String firstName = scanner.next();

        System.out.println("Enter last name: ");
        String lastName = scanner.next();

        System.out.println("Enter balance: ");
        double balance = scanner.nextDouble();



        //System.out.println("Enter a 4 digits passcode (digits only) : ");

        ///int passcode = scanner.nextInt();

        String passcode = scanner.nextLine();
        boolean passcodeIsValid = false;

        while(!passcodeIsValid) {
            System.out.println("Type a pin code of 4 digits: ");
            passcode = scanner.nextLine();
            passcodeIsValid = passcode!=null && passcode.length() == 4 && passcode.matches("[0-9]+");
        }

        System.out.println("Correct pin size");


        // Cum procedez daca vreau ca pinul sa fie 4 de 0?
        // Convert passcode from int to String to check size    --DE PROBA
//		String passcodeAsString = Integer.toString(passcode);
//		if(passcodeAsString.length() == 4) {
//			System.out.println("Correct pin size");
//		} else {
//			System.out.println("Incorrect pin size. Type a pin code of 4 digits: ");
//			passcode = scanner.nextInt();
//		}


        // Check pin size
//		if(passcode>999 && passcode<10000) {
//			System.out.println("Correct pin size");
//		} else {
//			System.out.println("Incorrect pin size. Type a pin code of 4 digits: ");
//			return;
//		}


        // Confirm pin code
//		System.out.println("Confirm passcode (digits only) : ");
//		int passcodeConfirmation = scanner.nextInt();
//
//		if(passcode != passcodeConfirmation) {
//			System.out.println("Codes don't match");
//			return; // adica executia se opreste daca nu e nimerit codul
//		}


        System.out.println("Choose the type of account you want to open.\n1.Current account\n2.Savings account");

        int accountOption = scanner.nextInt();
        int id; // numarul de cont porneste de la 1000000
        //int lastaccid=1;
        switch(accountOption) {

            case 1:

                // id = 1000000 + lastaccid;
                currentAccountId++;

                String idNou = Integer.toString(currentAccountId) + "CR";
                CurrentAccount crAcc =  new CurrentAccount(firstName, lastName, idNou, balance, passcode);

                cAccounts.add(crAcc);

                //lastaccid++;
                System.out.println("You created a current account.\nYour account id: " + idNou); // se afiseaza id-ul creat pt contul curent

                // afiseaza lista de conturi curente cAccounts  - de proba
//			System.out.println("Current accounts: ");
//			for(CurrentAccount element : cAccounts) {
//				System.out.println("Owner name: " + element.getFirstName() + element.getLastName());
//				System.out.println("Account id: " + element.getId());
//
//			}
                new Menu(scanner, crAcc);
                break;

            case 2:
                //id = 2000000 + lastaccid;
                //lastaccid ++;
                //id = 2000000;
                savingsAccountId++;
                String idNou2 = Integer.toString(savingsAccountId) + "SV";
                SavingsAccount saveAcc =  new SavingsAccount(firstName, lastName, idNou2, balance, passcode);
                sAccounts.add(saveAcc);
                //id++;
                System.out.println("You created a savings account.\nYour account id: " + idNou2); // se afiseaza id-ul creat pt contul curent
                new Menu(scanner, saveAcc);
                break;
            default:
                System.out.println("Please choose an option from the above, 1 or 2");
                break;

        }


        //Account acc = new Account(firstName, lastName, id, balance, passcode); // se creaza un cont cu datele introduse de user
        //accounts.add(acc); // se adauga acest cont la lista de conturi
        //System.out.println("Your account id: " + id); // se afiseaza id-ul creat pt contul curent

        //new Menu(scanner, acc); // se afiseaza meniul cu optiunile existente pt contul nou creat
    }


}
