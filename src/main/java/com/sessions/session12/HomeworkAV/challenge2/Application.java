package com.sessions.session12.HomeworkAV.challenge2;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Employee> allEmployees = new ArrayList<>();

        Employee employee1 = new Employee(1, "X", "test1@gmail.com",Role.TeamPosition.MEMBER);
        allEmployees.add(employee1);
        Employee employee2 = new Employee(2, "Y", "test2@gmail.com", Role.TeamPosition.MEMBER);
        allEmployees.add(employee2);
        Employee employee3 = new Employee(3, "Z", "test3@gmail.com", Role.TeamPosition.MEMBER);
        allEmployees.add(employee3);
        Employee employee4 = new Employee(4, "W", "test4@gmail.com", Role.TeamPosition.LEAD);
        allEmployees.add(employee4);

        Team team1 = new Team(1);
        team1.setEmployees(employee1);
        team1.setEmployees(employee2);
        team1.setEmployees(employee3);
        team1.setEmployees(employee4);

        Manager manager1 = new Employee(5, "S", "test5@gmail.com", Role.User.MANAGER);
        allEmployees.add((Employee) manager1);
        manager1.setTeam(team1);
        System.out.println("Manager1 employees: ");
        manager1.printEmployees();
        manager1.changeEmployeePosition(employee1, Role.TeamPosition.LEAD);
        manager1.changeEmployeePosition(employee4, Role.TeamPosition.MEMBER);
        System.out.println("Manager1 employees after role change: ");
        manager1.printEmployees();

        Employee employee6 = new Employee(6, "W", "test6@gmail.com", Role.ADMIN);
        allEmployees.add(employee6);
        Employee employee7 = new Employee(7, "S", "test7@gmail.com", Role.User.CONSTRUCTOR);
        allEmployees.add(employee7);

        System.out.println("Sending announcement to...");
        for(Employee employee: allEmployees) {
            System.out.println(employee.getEmail());
        }
        System.out.println("All employees received the announcement.");

    }
}