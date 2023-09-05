package com.sessions.practice.bankmanagementsystem;
import java.util.Scanner;

public class Menu {
    public Menu(Scanner scanner, CurrentAccount crAcc) {
        int j=0;

        System.out.println("Welcome " + crAcc.getFirstName() + " "+ crAcc.getLastName());
        do {
            System.out.println("1. Deposit\n2. Withdraw\n3. Balance\n4. Exit");

            j = scanner.nextInt();

            switch(j) {
                case 1:
                    System.out.println("Type the amount you want to deposit: ");
                    double amountDeposited = scanner.nextDouble();
                    crAcc.depositInCR(crAcc, amountDeposited);
                    break;

                case 2:
                    System.out.println("Type the amount you want to withdraw: ");
                    double amountWithdrawn = scanner.nextDouble();
                    crAcc.withdrawFromCR(crAcc, amountWithdrawn);
                    break;

                case 3:
                    System.out.println("Your balance is: " + crAcc.getBalance() +"$");
                    break;

                case 4:
                    System.out.println("Exiting now...");
                    break;

                default:
                    System.out.println("Please choose an option from 1 to 4");

            }

        } while(j!=4);
    }


    public Menu(Scanner scanner, SavingsAccount saveAcc) {
        int j=0;

        System.out.println("Welcome " + saveAcc.getFirstName() + " "+ saveAcc.getLastName());
        do {
            System.out.println("1. Deposit\n2. Withdraw\n3. Balance\n4. Exit");

            j = scanner.nextInt();

            switch(j) {
                case 1:
                    System.out.println("Type the amount you want to deposit: ");
                    double amountDeposited = scanner.nextDouble();
                    saveAcc.depositInSV(saveAcc, amountDeposited);
                    break;

                case 2:
                    System.out.println("Type the amount you want to withdraw: ");
                    double amountWithdrawn = scanner.nextDouble();
                    saveAcc.withdrawInSV(saveAcc, amountWithdrawn);
                    break;

                case 3:
                    System.out.println("Your balance is: " + saveAcc.getBalance() +"$");
                    break;

                case 4:
                    System.out.println("Exiting now...");
                    break;

                default:
                    System.out.println("Please choose an option from 1 to 4");
                    break;

            }

        } while(j!=4);
    }


}
