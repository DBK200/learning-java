package com.sessions.session12.Homework.Challange2.ViewMock;

import com.sessions.session12.Homework.Challange2.Model.Company;

import java.util.*;

public class AdminView {


    Company company;
    ArrayList<String> actions;

    AdminView(Company company) {
        this.company = company;
        this.actions = new ArrayList<>();
        setActions();
    }

    private void setActions() {
        this.actions.add("1 - AddEmployee");
        this.actions.add("2 - See All Employees");
        this.actions.add("3 - Find Employee By Id");
        this.actions.add("4 - Create A New Project");
        this.actions.add("5 - Display All Projects");
        this.actions.add("6 - Add Resouce Type");


    }

    public List<String> getActions() {
        return this.actions;
    }


//------------------------- EMPLOYEES -----------------------------------

    public void addEmployee() {
        System.out.println("Adding employee");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the following information for the new employee: ");
        System.out.println("Press enter if you want to skip optional fields press 0 ");
        System.out.print("(Required) First name: ");
        String firstName = scan.next();
        System.out.print("(Required) Last name: ");
        String lastName = scan.next();
        System.out.print("(Required) Email: ");
        String email = scan.next();
        System.out.print("(Required) Address: ");
        String address = scan.next();
        System.out.print("(Required) Birthday in format \'dd-MM-yyyy\': ");
        String birthday = scan.next();
        System.out.print("(Required) Hired date in format \'dd-MM-yyyy\': ");
        String hiredDate = scan.next();
        System.out.print("(Optional) Contract expiration date in format \'dd-MM-yyyy\': ");
        String contractExpirationDate = scan.next();
        if (contractExpirationDate.equals("0")) {
            contractExpirationDate = "";
        }
        System.out.println("(Required) Role: ");
        String role = scan.next();

        boolean result = company.addEmployee(firstName, lastName, email, address, birthday, hiredDate, contractExpirationDate, role);
        System.out.println("--------------------------");
        if (result) {
            System.out.println("Employee added");
        } else {
            System.out.println("Something went wrong! Employee was not added");
        }
        System.out.println("--------------------------");
        System.out.println();


    }

    public void seeAllEmployees() {
        System.out.println(" ----- Employee list ----- ");
        System.out.println();
        String result = String.format("%8s %10s %10s %22s %35s %13s %13s %13s", "ID", "First Name",
                "Last Name", "Role", "Email", "Address", "Birthdate", "Hired Date", "Expiration Date") + '\n';
        System.out.println(result);
        System.out.println(company.seeAllEmployees());

        System.out.println();
    }


    public void findEmployeeById() {
        Scanner scan = new Scanner(System.in);

        System.out.println(" ----- Searching employee by id -----");
        System.out.println();
        System.out.println("Enter 0 if you want to quit, or ");
        System.out.print("Enter employee ID: ");
        int employeeID = scan.nextInt();
        while (!checkEmployeeIdFormat(employeeID) && employeeID != 0) {
            System.out.println("Employee ID not valid! It must contain 6 digits");
            System.out.println("Enter 0 if you want to quit, or ");
            System.out.println("Enter employee ID: ");
            employeeID = scan.nextInt();
        }

        System.out.println("Searching for employee with id: " + employeeID + "...");
        System.out.println();

        Object obj = company.findEmployeeById(employeeID);
        if (obj == null) {
            System.out.println("Employee not found");
            return;
        }

        String result = String.format("%8s %10s %10s %22s %35s %13s %13s %13s", "ID", "First Name",
                "Last Name", "Role", "Email", "Address", "Birthdate", "Hired Date", "Expiration Date");
        System.out.println(result);
        System.out.println(obj);
        System.out.println();

        System.out.println("If you want to continue with one of the option enter the corresponding number." +
                "Otherwise, press -1 to exit.");

        System.out.println("Options: ");
        System.out.println(" 1 - Modify Employee Data");
        System.out.println(" 2 - Remove Employee");
        System.out.println("-1 - Exit");

        int option = scan.nextInt();
        if (option == 1) {
            System.out.println();
            System.out.println(obj);
            modifyEmployeeData(employeeID);
        }
        if (option == 2) {
            //remove employee
            removeEmployee(employeeID);
        }


    }


    private void modifyEmployeeData(int id) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the option for the field you want to modify:");
        System.out.println("1. First name");
        System.out.println("2. Last name");
        System.out.println("3. Email");
        System.out.println("4. Address");
        System.out.println("5. Contract expiration date");
        System.out.println("6. Role");
        System.out.println("-1.Save & Exit");
        System.out.println();


        String firstName = "", lastName = "", email = "", address = "", contractExpirationDate = "", role = "";
        int option = scan.nextInt();
        while (option > 0 && option < 7) {
            switch (option) {
                case 1:
                    System.out.print("Enter new first name: ");
                    firstName = scan.next();
                    break;
                case 2:
                    System.out.print("Enter new last name: ");
                    lastName = scan.next();
                    break;
                case 3:
                    System.out.print("Enter new email : ");
                    email = scan.next();
                    break;
                case 4:
                    System.out.print("Enter new address: ");
                    address = scan.next();
                    break;
                case 5:
                    System.out.print("Enter new contract expiration date: ");
                    contractExpirationDate = scan.next();
                    break;
                case 6:
                    System.out.print("Enter new role: ");
                    role = scan.next();
                    break;
            }

            System.out.print("If you want to modify another field enter the corresponding number: ");
            option = scan.nextInt();
        }

        Object empObj = company.modifyEmployeeData(id, firstName, lastName, email, address, contractExpirationDate, role);
        if (empObj == null) {
            System.out.println("Something went wrong!");
        } else {
            System.out.println("Employee has been modified");
            System.out.println();
            String result = String.format("%8s %10s %10s %22s %35s %13s %13s %13s", "ID", "First Name",
                    "Last Name", "Role", "Email", "Address", "Birthdate", "Hired Date", "Expiration Date");
            System.out.println(result);
            System.out.println(empObj);
        }
    }


    private void removeEmployee(int id) {
        if (company.removeEmployee(id)) {
            System.out.println("Employee with id " + id + " was removed");
        } else {
            System.out.println("Something went wrong! Employee was not removed!");
        }
    }

    private boolean checkEmployeeIdFormat(int employeeId) {

        if (employeeId / 100000 > 0) {
            return true;
        }
        return false;

    }


//-----------------------------------------------------------------------------


    public void createProject() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" ----- Create A New Project ----- ");
        System.out.print("Enter a project description: ");
        String description = scan.nextLine();
        System.out.print("Enter a start date in format \'dd-MM-yyyy\':");
        String startDate = scan.next();
        System.out.print("Enter a deadline datein format \'dd-MM-yyyy\':");
        String deadline = scan.next();

        System.out.println();



        System.out.println(" ----  Add manager for project ---- ");
        System.out.println("Listing all managers available...");
        System.out.println();
        String result = String.format("%8s %10s %10s %22s %35s %13s %13s %13s", "ID", "First Name",
                "Last Name", "Role", "Email", "Address", "Birthdate", "Hired Date", "Expiration Date") + '\n';
        System.out.println(result);
        System.out.println(company.getEmployeesByRole("manager"));

        System.out.println();
        System.out.print("Enter the id of the manager you want to select: ");
        int managerID = scan.nextInt();


        System.out.println();
        System.out.println(" ----- Adding a construction blueprint ----- ");
        System.out.println("Enter blueprint description: ");
        String blueprintDescription = scan.next();



        int projectId=company.addProject(description,startDate,deadline,managerID,blueprintDescription);
        if(projectId==-1){
            System.out.println("Something went wrong! The project was not created!");
        }else{
            System.out.println("Project created with id: "+ projectId);
        }

        addResourcesToConstructionBlueprint(projectId);



    }

    private void  addResourcesToConstructionBlueprint(int projectId){
        Scanner scan=new Scanner(System.in);
        System.out.println(" --- Adding resources needed for construction  ---");
        System.out.println();
        int id;
        int quantity;
        Map<Integer, String> resources=company.getResourceRecordsAsMap();

        seeAllResources();
        do {
            System.out.print("Select id of resource from list of resources: ");
            id=scan.nextInt();

            String resourceName=resources.get(id) ;

            while(resourceName==null){
                System.out.println("No resource with id: "+id);
                System.out.print("Select id of resource from list of resources: ");
                id=scan.nextInt();
                resourceName=resources.get(id) ;
            }





            System.out.print("Enter quantity needed: ");
            quantity=scan.nextInt();
          boolean success= company.addResourceToProject(projectId,id,resourceName,quantity);
            if(success){
                System.out.println("Resource added");
            }else{
                System.out.println("Something went wrong");
            }

            System.out.println("Would you like to add more? y/n");


        }while(scan.next().equals("y"));




    }

    public void addResouceType(){
        int id=company.getResourceRecords().size()+1;
        Scanner scan=new Scanner(System.in);
        String resourceType="";
        int quantity;
        boolean result=false;
        System.out.println(" ----- Adding new resource type ----- ");
        do {
            System.out.print("Enter resource type name: ");
            resourceType = scan.next();


           result=company.addResourceRecord(resourceType);
            if(result){
                System.out.println("New resource added");
            }else{
                System.out.println("Something went wrong");
            }

            System.out.println("Would you like to add more? y/n");
        }while(scan.next().equals("y"));


        seeAllResources();





    }



    public void seeAllResources(){
        System.out.println(" ----- Display all resources ----- ");
        System.out.println();
        System.out.println(String.format("%6s %20s ","ID","Resource Name"));
        System.out.println(company.getResourcesAsString());
        System.out.println();
    }




    public void displayAllProjects(){
        System.out.println(" ----- Display all projects ----- ");
        System.out.println();
        String headline=String.format("%15s %12s %12s %40s %20s %12s","Description","Start Date","Deadline","Phase ","Manager","Manager ID");
        System.out.println(headline);
        System.out.println();
        List<String> projects=company.getAllProjects();
        for(String s:projects){

            System.out.println(s);
        }

    }

}
