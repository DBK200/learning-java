package com.sessions.session12.Homework.Challange2.ViewMock;

import com.sessions.session12.Homework.Challange2.Model.Company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConstructorEngineerView {

    Company company;
    ArrayList<String> actions;

    ConstructorEngineerView(Company company) {
        this.company = company;
        this.actions = new ArrayList<>();
        setActions();
    }

    private void setActions() {
        this.actions.add("1 - See My projects");
        this.actions.add("2 - Edit Project Resources");


    }

    public List<String> getActions() {
        return this.actions;
    }

    public void seeMyProjects() {
        System.out.println();
        System.out.println(" ----- My projects ----- ");
        List<String> projects = company.getAllProjects();
        for (String s : projects) {
            System.out.println(s);
        }
        System.out.println();
        System.out.print("Enter project id you want to see in detail or -1 to exit: ");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        if (option != -1) {
            System.out.println();
            System.out.println(company.getProjectConstructionBlueprint(option));
            System.out.println();
            System.out.println(company.getProjectTeamMembersString(option));
            System.out.println();
        }

    }

    public void editProjectResources() {
        System.out.println();
        System.out.println(" ----- Edit Project Resources -----");
        System.out.println();

        String headline = String.format("%10s %15s %12s %12s %40s %20s %12s", "Project ID", "Description", "Start Date", "Deadline", "Phase ", "Manager", "Manager ID");
        System.out.println(headline);
        for (String s : company.getAllProjects()) {
            System.out.println(s);
        }

        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.println("To select one of the project enter its project id. ");
        System.out.println("Enter -1 to exit.");
        System.out.print("Enter option: ");
        int projectID = scan.nextInt();
        if (projectID != -1) {
            System.out.println();
            System.out.println(company.getProjectConstructionBlueprint(projectID));
            System.out.println();


        }


        do {
            System.out.println();
            System.out.println("Options");
            System.out.println("1. Edit used resources");
            System.out.println("2. Edit extra resources needed");
            System.out.println("-1. Exit");

            System.out.println();
            System.out.print("Enter Option: ");

            int option = scan.nextInt();
            if (option == 1) {
                //
                do {
                    System.out.println();
                    System.out.print("Enter the id of the resource you want to modify: ");
                    int resourceID = scan.nextInt();
                    System.out.println();
                    //call company method
                    System.out.print("Enter the quantity used: ");
                    int quantityUsed = scan.nextInt();
                    boolean success = company.editResourceQuantityUsed(projectID, resourceID, quantityUsed);

                    if (success) {
                        System.out.println("Resource modified");
                    } else {
                        System.out.println("Something went wrong");
                    }

                    System.out.println("Do you want to continue modifying used resources? y/n");
                } while (scan.next().equals("y"));
                System.out.println();
            }
            if (option == 2) {
                //

                do {
                    System.out.println();
                    System.out.print("Enter the id of the resource you want to modify: ");
                    int resourceID = scan.nextInt();
                    System.out.println();
                    //call company method
                    System.out.print("Enter the extra quantity needed: ");
                    int quantityUsed = scan.nextInt();
                    boolean success = company.editResourceExtraQuantityNeeded(projectID, resourceID, quantityUsed);

                    if (success) {
                        System.out.println("Resource modified");
                    } else {
                        System.out.println("Something went wrong");
                    }

                    System.out.println("Do you want to continue modifying used resources? y/n");
                } while (scan.next().equals("y"));
                System.out.println();
            }

            System.out.println();
            System.out.println(company.getProjectConstructionBlueprint(projectID));
            System.out.println();
            System.out.println("Do you want to continue modifying resources? y/n");
        } while (scan.next().equals("y"));
    }


}
