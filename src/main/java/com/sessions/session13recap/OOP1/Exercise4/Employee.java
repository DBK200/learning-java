package com.sessions.session13recap.OOP1.Exercise4;

public class Employee {
    private String name;
    private int id;
    private int salary;
    private String jobTitle;
    public Employee(String name, int id, int salary, String jobTitle) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }
    public int getAnnualSalary() {
        return salary * 12;
    }
    public void giveRaise(int sum) {
        salary += sum;
    }
    public void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Job title: " + jobTitle);
    }
}
