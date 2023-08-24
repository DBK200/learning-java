package com.sessions.session12.Homework.Challange2.ViewMock;


import com.sessions.session12.Homework.Challange2.Model.*;
import com.sessions.session12.Homework.Challange2.Model.Project.ConstructionBlueprint;
import com.sessions.session12.Homework.Challange2.Model.Project.Project;
import com.sessions.session12.Homework.Challange2.Model.Project.Resource;
import com.sessions.session12.Homework.Challange2.Model.Project.ResourceRecord;


import java.time.LocalDate;
import java.util.*;

public class App {

    AdminView admin;
    ManagerView manager;
    ConstructorEngineerView constructorEngineer;

    private Company company;

    public App() {

    }




    public String login() {
        Scanner scan = new Scanner(System.in);
        System.out.println("In order to login you have to enter one of the following usernames: ");
        System.out.println("admin_100001");
        System.out.println("manager_100000");
        System.out.println("manager_100005");
        System.out.println("manager_100008");
        System.out.println("construction-engineer_100002");
        System.out.println("construction-engineer_100004");
        System.out.println("construction-engineer_100006");
        System.out.println("builder_100003");
        System.out.println("builder_100007");
        System.out.println("builder_100010");
        System.out.println("The password can be anything you want");

        System.out.println("Enter you credentials below: ");
        System.out.print("Username: ");
        String username = scan.next();
        System.out.print("Password: ");
        String password = scan.next();
        String[] user = loginMockHelper(username);
        if (user[0].equals("admin")) {
            System.out.println("Loged in as admin");
            this.company = new Admin(true);
            company.setLoggedInID(Integer.parseInt(user[1]));
            mockCompanyData(company);
            displayEmployeeInfo(company,Integer.parseInt(user[1]));
            this.admin = new AdminView(company);
            return "admin";

        } else if (user[0].equals("manager")) {
            System.out.println("Logged in as manager");
            this.company = new Manager(true);
            company.setLoggedInID(Integer.parseInt(user[1]));
            mockCompanyData(company);
            displayEmployeeInfo(company,Integer.parseInt(user[1]));
            this.manager = new ManagerView(company);
            return "manager";
        } else if (user[0].equals("construction-engineer")) {
            System.out.println("Logged in as construction engineer");

            this.company = new ConstructionEngineer(true);
            company.setLoggedInID(Integer.parseInt(user[1]));
            mockCompanyData(company);
            displayEmployeeInfo(company,Integer.parseInt(user[1]));
            this.constructorEngineer = new ConstructorEngineerView(company);


            return "construction-engineer";
        }

        return null;
    }

    private String[] loginMockHelper(String username) {
        String[] user = username.split("_");
        int userID = Integer.parseInt(user[1]);

        return user;


    }

    private void displayEmployeeInfo(Company company,int id){
        Object employee=company.findEmployeeById(id);
        System.out.println();
        System.out.println(employee.toString());
        System.out.println();
    }

    public AdminView getAdmin() {
        return admin;
    }

    public ManagerView getManager() {
        return manager;
    }

    public ConstructorEngineerView getConstructorEngineer() {
        return constructorEngineer;
    }




    private void mockCompanyData(Company company) {



        System.out.println("adding employees");

        Employee employee2 = new Employee(100001, "Emma", "Blue", "Emma.Blue@gmail.com", "Romania", LocalDate.of(1997, 7, 15), LocalDate.of(2023, 3, 12), LocalDate.of(2024, 8, 30), Role.ADMIN);

        Employee employee1 = new Employee(100000, "Ian", "Red", "Ian.Red@gmail.com", "Romania", LocalDate.of(1991, 2, 5), LocalDate.of(2000, 3, 10), Role.MANAGER);
        Employee employee6 = new Employee(100005, "Zoe", "Yellow", "Zoe.Yellow@gmail.com", "Romania", LocalDate.of(1991, 10, 28), LocalDate.of(2020, 3, 1), Role.MANAGER);
        Employee employee9 = new Employee(100008, "Daniel", "Brown", "Daniel.Brown@gmail.com", "Romania", LocalDate.of(1975, 5, 9), LocalDate.of(2019, 5, 15), Role.MANAGER);


        Employee employee3 = new Employee(100002, "Robert", "Green", "Robert.Green@gmail.com", "Romania", LocalDate.of(1989, 1, 24), LocalDate.of(2015, 3, 15), Role.CONSTRUCTOR_ENGINEER);
        Employee employee5 = new Employee(100004, "Olivia", "White", "Olivia.White@gmail.com", "Romania", LocalDate.of(1987, 2, 8), LocalDate.of(2015, 3, 1), Role.CONSTRUCTOR_ENGINEER);
        Employee employee7 = new Employee(100006, "William", "Amber", "William.Amber@gmail.com", "Romania", LocalDate.of(1985, 12, 10), LocalDate.of(2010, 4, 6), Role.CONSTRUCTOR_ENGINEER);
        Employee employee12 = new Employee(100011, "Noah", "Camel", "Noah.Camel@gmail.com", "Romania", LocalDate.of(1991, 10, 3), LocalDate.of(2018, 8, 3), Role.CONSTRUCTOR_ENGINEER);

        Employee employee13 = new Employee(100012, "Rory", "Cooper", "Rory.Cooper@gmail.com", "Romania", LocalDate.of(1989, 9, 13), LocalDate.of(2017, 2, 4), Role.BUILDER);
        Employee employee10 = new Employee(100009, "Carlos", "Buff", "Carlos.Buff@gmail.com", "Romania", LocalDate.of(2000, 6, 11), LocalDate.of(2021, 8, 1), Role.BUILDER);
        Employee employee11 = new Employee(100010, "Ravi", "Canary", "Ravi.Canary@gmail.com", "Romania", LocalDate.of(1992, 1, 19), LocalDate.of(2018, 9, 2), Role.BUILDER);
        Employee employee8 = new Employee(100007, "David", "Violet", "David.Violet@gmail.com", "Romania", LocalDate.of(1980, 2, 12), LocalDate.of(2019, 2, 15), Role.BUILDER);
        Employee employee4 = new Employee(100003, "James", "Black", "James.Black@gmail.com", "Romania", LocalDate.of(1999, 9, 21), LocalDate.of(2019, 3, 19), Role.BUILDER);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);
        employees.add(employee9);
        employees.add(employee10);
        employees.add(employee11);
        employees.add(employee12);
        employees.add(employee13);
        EmployeeList employeeList = new EmployeeList(employees);
        company.setEmployeeList(employeeList);





        ResourceRecord r26=new ResourceRecord(0, "Planks");
        ResourceRecord r1=new ResourceRecord(1, "Cement");
        ResourceRecord r2=new ResourceRecord(2, "Sand");
        ResourceRecord r3=new ResourceRecord(3, "Steel");
        ResourceRecord r4=new ResourceRecord(4, "Bitumen");
        ResourceRecord r5=new ResourceRecord(5, "Concrete");
        ResourceRecord r6=new ResourceRecord(6, "Structural steel");
        ResourceRecord r7=new ResourceRecord(7, "Binding Wires");
        ResourceRecord r8=new ResourceRecord(8, "Aggregate");
        ResourceRecord r9=new ResourceRecord(9, "Bricks");
        ResourceRecord r10=new ResourceRecord(10, "Blocks");
        ResourceRecord r11=new ResourceRecord(11, "Timber");
        ResourceRecord r12=new ResourceRecord(12, "Nails");
        ResourceRecord r13=new ResourceRecord(13, "Paint");
        ResourceRecord r14=new ResourceRecord(14, "Bamboo");
        ResourceRecord r15=new ResourceRecord(15, "Pipes");
        ResourceRecord r16=new ResourceRecord(16, "Glass");
        ResourceRecord r17=new ResourceRecord(17, "Tiles");
        ResourceRecord r18=new ResourceRecord(18, "Marble");
        ResourceRecord r19=new ResourceRecord(19, "Mud");
        ResourceRecord r20=new ResourceRecord(20, "Metal Sheet");
        ResourceRecord r21=new ResourceRecord(21, "Stone");
        ResourceRecord r22=new ResourceRecord(22, "Soil");
        ResourceRecord r23=new ResourceRecord(23, "Iron");
        ResourceRecord r24=new ResourceRecord(24, "Aluminum");
        ResourceRecord r25=new ResourceRecord(25, "Copper");


        List<ResourceRecord> resources =new ArrayList<>();
        resources.add(r26);
        resources.add(r1);
        resources.add(r2);
        resources.add(r3);
        resources.add(r4);
        resources.add(r5);
        resources.add(r6);
        resources.add(r7);
        resources.add(r8);
        resources.add(r9);
        resources.add(r10);
        resources.add(r11);
        resources.add(r12);
        resources.add(r13);
        resources.add(r14);
        resources.add(r15);
        resources.add(r16);
        resources.add(r17);
        resources.add(r18);
        resources.add(r19);
        resources.add(r20);
        resources.add(r21);
        resources.add(r22);
        resources.add(r23);
        resources.add(r24);
        resources.add(r25);


        company.setResourceRecords(resources);


        //Construction blueprint
        ConstructionBlueprint blueprint1=new ConstructionBlueprint("Farmhouse");
         blueprint1.addResourceNeeded(r1,213);
         blueprint1.addResourceNeeded(r5,545);
         blueprint1.addResourceNeeded(r21,524);
         blueprint1.addResourceNeeded(r14,2437);
         blueprint1.addResourceNeeded(r7,7242);
         blueprint1.addResourceNeeded(r11,7524);
        ConstructionBlueprint blueprint2=new ConstructionBlueprint("Restaurant");

        blueprint2.addResourceNeeded(r1,3253);
        blueprint2.addResourceNeeded(r2,4235);
        blueprint2.addResourceNeeded(r7,52424);
        blueprint2.addResourceNeeded(r21,442);
        blueprint2.addResourceNeeded(r17,4267);
        blueprint2.addResourceNeeded(r18,40476);
        blueprint2.addResourceNeeded(r11,1420);
        blueprint2.addResourceNeeded(r8,7552);
        blueprint2.addResourceNeeded(r13,2725);
        ConstructionBlueprint blueprint3=new ConstructionBlueprint("Hospital");
        blueprint3.addResourceNeeded(r1,3253);
        blueprint3.addResourceNeeded(r2,4235);
        blueprint3.addResourceNeeded(r7,52424);
        blueprint3.addResourceNeeded(r21,442);
        blueprint3.addResourceNeeded(r17,4267);
        blueprint3.addResourceNeeded(r18,40476);
        blueprint3.addResourceNeeded(r11,1420);
        blueprint3.addResourceNeeded(r8,7552);
        blueprint3.addResourceNeeded(r13,2725);
        ConstructionBlueprint blueprint4=new ConstructionBlueprint("Data center");
        blueprint4.addResourceNeeded(r1,3253);
        blueprint4.addResourceNeeded(r2,4235);
        blueprint4.addResourceNeeded(r7,52424);
        blueprint4.addResourceNeeded(r21,442);
        blueprint4.addResourceNeeded(r17,4267);
        blueprint4.addResourceNeeded(r18,40476);
        blueprint4.addResourceNeeded(r11,1420);
        blueprint4.addResourceNeeded(r8,7552);
        blueprint4.addResourceNeeded(r13,2725);


        //Projects

        Project project1 = new Project(0,"Residential", LocalDate.of(2023, 4, 5), LocalDate.of(2023, 8, 30), employee1, blueprint1);
        Project project2 = new Project(1,"Commercial", LocalDate.of(2023, 6, 1),  LocalDate.of(2024, 6, 1), employee6, blueprint2);
        Project project3 = new Project(2,"Institutional",  LocalDate.of(2023, 9, 1), LocalDate.of(2025, 2, 1), employee1, blueprint3);
        Project project4 = new Project(3,"Industrial", LocalDate.of(2023, 5, 5), LocalDate.of(2024, 8, 30), employee9, blueprint4);


        Team team=new Team();
        team.addTeamMember(employee3, true);
        team.addTeamMember(employee10, false);
        team.addTeamMember(employee11, false);
        project1.setTeam(team);


        team=new Team();
        team.addTeamMember(employee5, true);
        team.addTeamMember(employee7, false);
        team.addTeamMember(employee13, false);
        team.addTeamMember(employee8, false);
        project2.setTeam(team);

        List<Project> projects=new ArrayList<>();
        projects.add(project1);
        projects.add(project2);
        projects.add(project3);
        projects.add(project4);

        company.setProjects(projects);

        /*
        ----- Employee list -----

      ID First Name  Last Name                   Role                               Email       Address     Birthdate    Hired Date

  100000        Ian        Red                MANAGER                   Ian.Red@gmail.com       Romania    1991-02-05    2000-03-10
  100001       Emma       Blue                  ADMIN                 Emma.Blue@gmail.com       Romania    1997-07-15    2023-03-12
  100002     Robert      Green   CONSTRUCTOR_ENGINEER              Robert.Green@gmail.com       Romania    1989-01-24    2015-03-15
  100003      James      Black                BUILDER               James.Black@gmail.com       Romania    1999-09-21    2017-03-19
  100004     Olivia      White   CONSTRUCTOR_ENGINEER              Olivia.White@gmail.com       Romania    1987-08-02    2015-03-01
  100005        Zoe     Yellow                MANAGER                Zoe.Yellow@gmail.com       Romania    1991-10-28    2020-03-01
  100006    William      Amber   CONSTRUCTOR_ENGINEER             William.Amber@gmail.com       Romania    1985-12-10    2010-04-06
  100007      David     Violet                BUILDER              David.Violet@gmail.com       Romania    1980-02-12    2019-02-15
  100008     Daniel      Brown                MANAGER              Daniel.Brown@gmail.com       Romania    1975-05-09    2019-05-15
  100009     Carlos       Buff                BUILDER               Carlos.Buff@gmail.com       Romania    2000-06-11    2021-08-01
  100010       Ravi     Canary                BUILDER               Ravi.Canary@gmail.com       Romania    1992-01-19    2018-09-02
  100011       Noah      Camel   CONSTRUCTOR_ENGINEER                Noah.Camel@gmail.com       Romania    1991-10-03    2018-08-03
  100012       Rory     Cooper                BUILDER               Rory.Cooper@gmail.com       Romania    1989-09-17    2017-02-04

         */


    }






}
