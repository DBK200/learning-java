package com.sessions.session12.Homework.Challange2;

import com.sessions.session12.Homework.Challange2.ViewMock.AdminView;
import com.sessions.session12.Homework.Challange2.ViewMock.App;
import com.sessions.session12.Homework.Challange2.ViewMock.ConstructorEngineerView;
import com.sessions.session12.Homework.Challange2.ViewMock.ManagerView;

import java.util.Scanner;

public class Main {

    public static void displayActionsForAdmin(AdminView adminView) {
        for (String action : adminView.getActions()) {
            System.out.println(action);
        }
    }

    public static void displayActionsForManager(ManagerView managerView) {
        for (String action : managerView.getActions()) {
            System.out.println(action);
        }
    }

    public static void displayActionsForConstructorEngineer(ConstructorEngineerView constructorEngineerView) {
        for (String action : constructorEngineerView.getActions()) {
            System.out.println(action);
        }
    }

    public static void main(String[] args) {
        App app = new App();

        String accountype = app.login();

        AdminView adminView = app.getAdmin();
        ManagerView managerView = app.getManager();
        ConstructorEngineerView constructorEngineerView = app.getConstructorEngineer();
        Scanner scan = new Scanner(System.in);


        if (accountype.equals("admin")) {
            System.out.println("Enter the number corresponding to the action you want to perform");
            displayActionsForAdmin(adminView);
            System.out.println("-1 - Exit");
            int option = scan.nextInt();
            while (option != -1) {

                switch (option) {
                    case 1:
                        adminView.addEmployee();
                        break;
                    case 2:
                        adminView.seeAllEmployees();
                        break;
                    case 3:
                        adminView.findEmployeeById();
                        break;
                    case 4:
                        adminView.createProject();
                        break;
                    case 5:
                        adminView.displayAllProjects();
                        break;
                    case 6:
                        adminView.addResouceType();
                        break;


                }
                System.out.println("Enter the number corresponding to the action you want to perform");
                displayActionsForAdmin(adminView);
                System.out.println("-1 - Exit application");
                System.out.println();
                System.out.print("Enter option: ");
                option = scan.nextInt();
            }

        } else if (accountype.equals("manager")) {
            System.out.println("Enter the number corresponding to the action you want to perform");
            displayActionsForManager(managerView);
            System.out.println("-1 - Exit");
            int option = scan.nextInt();
            while (option != -1) {

                switch (option) {
                    case 1:
                        managerView.seeAllProjects();
                        break;
                    case 2:
                        managerView.createTeam();
                        break;
                    case 3:
                        managerView.modifyTeam();
                        break;
                    case 4:
                        managerView.editProjectResources();
                        break;


                }
                System.out.println("Enter the number corresponding to the action you want to perform");
                displayActionsForManager(managerView);
                System.out.println("-1 - Exit application");
                System.out.println();
                System.out.print("Enter option: ");
                option = scan.nextInt();


            }

        } else if (accountype.equals("construction-engineer")) {
            System.out.println("Enter the number corresponding to the action you want to perform");
            displayActionsForConstructorEngineer(constructorEngineerView);
            System.out.println("-1 - Exit");
            int option = scan.nextInt();
            while (option != -1) {

                switch (option) {
                    case 1:
                        constructorEngineerView.seeMyProjects();
                        break;
                    case 2:
                        constructorEngineerView.editProjectResources();
                        break;


                }
                System.out.println("Enter the number corresponding to the action you want to perform");
                displayActionsForConstructorEngineer(constructorEngineerView);
                System.out.println("-1 - Exit application");
                System.out.println();
                System.out.print("Enter option: ");
                option = scan.nextInt();

            }
        }


    }
}

