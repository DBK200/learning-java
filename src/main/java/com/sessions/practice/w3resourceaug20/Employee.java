package com.sessions.practice.w3resourceaug20;

public class Employee {

    // Properties/ attributes
    private String name;
    private String jobTitle;
    private double salary;

    // Parameterized constructor
    public Employee(String name, String jobTitle, double salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getters and setters
    // Getters

    public String getName(){
        return name;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    public double getSalary(){
        return salary;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setJobTitle(String name){
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    // Method to update salary
    public void salaryRaise(double percentage){
        salary = salary +salary*percentage/100 ;
        //return newSalary;
    }

    // Method to print Employee Details
    public void printEmployeeDetails(){
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }

}
