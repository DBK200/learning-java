package com.sessions.recap.OOP;

public class Employee {

//    Employee: Create an Employee class that has the following attributes: name, id, salary,
//    and job title. Implement methods for calculating the employee's annual salary, giving
//    the employee a raise, and displaying the employee's information.

    private String name;
    private int id;
    private double salary;
    private String jobTitle;

    public Employee(String name,int id,double salary, String jobTitle){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.jobTitle=jobTitle;
    }

    public void calculateAnnualSalary(){
        System.out.println("Annual salary is "+salary*12);
    }

    public void salaryRaise(double x){
        salary+=x;
        System.out.println("The salary was increased to "+salary);
    }

    public void employeesInformation(){
        System.out.println("The employee's information are:");
        System.out.println("Name:" +name);
        System.out.println("Id: "+id);
        System.out.println("Salary: "+salary);
        System.out.println("Job Title: "+jobTitle);
    }

}
