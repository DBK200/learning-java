package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex9;

import java.time.LocalDate;
import java.time.Period;

public class Employee {

    private String name;
    private int salary;
    private LocalDate hireDate;

    public Employee(String name, int salary, LocalDate hireDate){
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getEmployeeDetails(){
        return "Name: " + name + " Salary: " + salary + " Hire Date: " + hireDate;
    }
    public String getYearsOfService(){
        return Period.between(hireDate, LocalDate.now()).getYears() + " years of service";
    }
}
