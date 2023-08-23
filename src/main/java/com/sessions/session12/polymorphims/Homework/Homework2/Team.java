package com.sessions.session12.polymorphims.Homework.Homework2;

import java.util.ArrayList;
import java.util.List;

public class Team{

    List<Employee> members = new ArrayList<>();


    public void addEmployee(Employee employee){
        members.add(employee);
    }

    public void printEmployees(){
        for (Employee employee : members){
            System.out.println(employee);
        }
    }
    public void removeEmployee(Employee employee){
        members.remove(employee);
    }
    public String assignTeamLead(Employee employee){
        return "Team leader is: " + employee.getName();
    }
}

