package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex6;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("Jon");
        employee.setJobTitle("Programmer");
        employee.setSalary(4000);
        System.out.println(employee.getSalary());
        employee.increaseSalary(2500);
        employee.decreaseSalary(1200);
        System.out.println(employee.getSalary());
    }
}
