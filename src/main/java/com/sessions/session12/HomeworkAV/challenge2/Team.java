package com.sessions.session12.HomeworkAV.challenge2;
import java.util.*;

public class Team extends Manager implements Company {
    private int ID;
    private List<Employee> employees = new ArrayList<>();
    public Team() {
    }
    public Team(int ID) {
        this.ID = ID;
    }
    public void setEmployees(Employee employee) {
        employees.add(employee);
    }
    public void printTeamEmployees() {
        for (Employee employee: employees) {
            employee.printEmployeeData();
        }
    }
}