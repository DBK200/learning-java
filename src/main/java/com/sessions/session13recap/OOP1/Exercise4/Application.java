package com.sessions.session13recap.OOP1.Exercise4;

public class Application {
    public static void main(String[] args) {

        Employee employee = new Employee("Ana Ion", 123, 3000, "sales manager");
        employee.giveRaise(300);
        employee.displayData();
        System.out.println("Annual salary: " + employee.getAnnualSalary());
    }
}
