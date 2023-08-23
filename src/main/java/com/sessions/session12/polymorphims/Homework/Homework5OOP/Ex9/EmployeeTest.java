package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex9;

import java.time.LocalDate;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee = new Employee("Mike", 3000, LocalDate.parse("2011-05-25"));

        System.out.println(employee.getEmployeeDetails());
        System.out.println(employee.getYearsOfService());
    }
}
