package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex6;

public class Employee {

    private String name;
    private String jobTitle;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void increaseSalary(int salary){
        this.salary += salary;
        System.out.println("New salary: " + this.salary);
    }
    public void decreaseSalary(int salary){
        this.salary -= salary;
        System.out.println("New salary: " + this.salary);
    }
}
