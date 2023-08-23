package com.sessions.session12.polymorphims.Homework.Homework2;

import com.sessions.session11.abstraction.defaultMethod.A;
import com.sessions.session12.polymorphims.Administrator;

public class AppTest {

    public static void main(String[] args) {

        Team team = new Team();

        ProjectManager projectManager = new ProjectManager();

        Admin admin = new Admin();



        Employee employee1 = new Employee("Mike", "Electrician", 25);
        Employee employee2 = new Employee("Levi", "Engineer", 34);
        Employee employee3 = new Employee("John", "Architect", 27);

        team.addEmployee(employee1);
        team.addEmployee(employee2);
        team.addEmployee(employee3);

        team.printEmployees();

        System.out.println(team.assignTeamLead(employee1));

        employee1.receiveAnnouncements("Good work!");

        admin.setBricks(3000);
        admin.setCement(2000);
        admin.setGlass(150);
        admin.setMetal(565);
        admin.setWood(700);
        System.out.println(admin.getData());
        System.out.println(admin.viewProgress());


    }
}
