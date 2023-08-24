package com.sessions.session12.Homework.Challange2.ViewMock;

import com.sessions.session12.Homework.Challange2.Model.Company;

import java.time.LocalDate;
import java.util.*;

public class ManagerView {
    Company company;
    ArrayList<String> actions;

    ManagerView(Company company) {
        this.company = company;
        this.actions = new ArrayList<>();
        setActions();
    }

    private void setActions() {
        this.actions.add("1 - See All Projects");
        this.actions.add("2 - Create Team");
        this.actions.add("3 - Modify Team");
        this.actions.add("4 - Edit Project Resources");


    }

    public List<String> getActions() {
        return this.actions;
    }

    public int seeAllProjects() {

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
        int option = scan.nextInt();
        if (option != -1) {
            System.out.println();
            System.out.println(company.getProjectConstructionBlueprint(option));
            System.out.println();
            System.out.println(company.getProjectTeamMembersString(option));
            System.out.println();

        }
        return option;
    }


    private void projectbyID(int id) {
        company.getProjectById(id);
    }


    public void createTeam() {
        int projectID = seeAllProjects();
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println(" ----- Creating the team for the project -----");
        System.out.println();
        if(!company.hasTeam(projectID)){
            addMembers(projectID);
        }else{
            System.out.println();
            System.out.println("Team was already created for this project!");
            System.out.println();
        }



    }


    public void modifyTeam() {
        int projectID = seeAllProjects();

        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println(" ----- Modify team ----- ");
        System.out.println();
        System.out.println("Options");
        System.out.println("1. Change team leader");
        System.out.println("2. Add new team member");
        System.out.println("3. Remove team member");
        System.out.println("-1. Exit");
        System.out.println();
        System.out.print("Enter Option: ");

        int option = scan.nextInt();
        if (option == 1) {
            //change team lead
            System.out.println();
            System.out.println(" --- Change team lead --- ");
            System.out.println();
            System.out.println(company.getProjectTeamMembersString(projectID));
            System.out.println();
            System.out.print("Enter the id of the new team lead: ");
            int teamLeadId = scan.nextInt();
            boolean success = company.changeTeamLead(projectID, teamLeadId);
            if (success) {
                System.out.println("Team lead changed");
            } else {
                System.out.println("Something went wrong");
            }
            System.out.println();
            System.out.println(company.getProjectTeamMembersString(projectID));
            System.out.println();


        }
        if (option == 2) {
            addMembers(projectID);

            System.out.println();
            System.out.println(company.getProjectTeamMembersString(projectID));

            System.out.println();
        }
        if (option == 3) {

            List<Integer> employeesIDs = new ArrayList<>();

            System.out.println(" --- Display team members --- ");
            System.out.println(company.getProjectTeamMembersString(projectID));

            System.out.println("-- ");
            System.out.println("Please enter the ids of the employee you want to remove from the team");
            System.out.println("*** This method assumes you will enter correct ids contained in the list displayed above ***");
            do {
                System.out.print("Employee id: ");
                int employeeId = scan.nextInt();
                employeesIDs.add(employeeId);

                System.out.println("Continue to remove? y/n");
            } while (scan.next().equals("y"));

            boolean success = company.removeMembersFromTeam(projectID, employeesIDs);
            if (success) {
                System.out.println("Team members removed");
            } else {
                System.out.println("Something went wrong!");
            }

            System.out.println();
            System.out.println(company.getProjectTeamMembersString(projectID));
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


    private void addMembers(int projectID) {
        Scanner scan = new Scanner(System.in);
        Map<Integer, Boolean> employees = new HashMap<>();
        System.out.println(" --- Display all available employees --- ");
        List<String> listOfEmployee = company.getAvailableEmployees(projectID);
        for (String s : listOfEmployee) {
            System.out.println(s);
        }
        System.out.println("-- ");
        System.out.println("Please enter the ids of the employee you want to add to the team");
        System.out.println("*** This method assumes you will enter correct ids contained in the list displayed above ***");
        do {
            System.out.print("Employee id: ");
            int employeeId = scan.nextInt();
            System.out.println("Mark as a teamLead? y/n");
            String teamLead = scan.next();
            boolean isTeamLead = false;
            if (teamLead.equals("y")) {
                isTeamLead = true;
            }

            employees.put(employeeId, isTeamLead);
            displayTeamSoFar(employees);
            System.out.println("Continue to add? y/n");
        } while (scan.next().equals("y"));

        boolean success = company.addMembersToTeam(projectID, employees);
        if (success) {
            System.out.println("Team members added");
        } else {
            System.out.println("Something went wrong!");
        }
        System.out.println();
    }

    private void displayTeamSoFar(Map<Integer, Boolean> members) {
        Object employee = null;

        String result = String.format("%8s %10s %10s %22s %35s %13s %13s %13s", "ID", "First Name",
                "Last Name", "Role", "Email", "Address", "Birthdate", "Hired Date", "Expiration Date") + '\n';
        System.out.println(result);

        for (Map.Entry<Integer, Boolean> member : members.entrySet()) {
            Object e = company.findEmployeeById(member.getKey());
            System.out.println(e);

        }
        System.out.println();
        System.out.println();
    }

}
