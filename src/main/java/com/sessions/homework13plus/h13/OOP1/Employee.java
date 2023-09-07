package com.sessions.homework13plus.h13.OOP1;

public class Employee {
    //Employee: Create an Employee class that has the following attributes: name, id, salary, and job title. Implement methods
    // for calculating the employee's annual salary, giving the employee a raise, and displaying the employee's information.
    String name, jobTitle;
    int id;
    double salary;

    public Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("John Marston", " Cowboy");
        employee1.setId(1);
        employee1.setSalary(3000);
        employee1.displayInfo();
        employee1.annualSalary();
        employee1.giveRaise(505);
        employee1.annualSalary();
        employee1.displayInfo();
    }

    private double annualSalary() {
        double anualSal = 12 * this.salary;
        System.out.println("The annual salary of " + this.name + " is equal to " + anualSal + "$");
        return anualSal;
    }

    private void giveRaise(double raise) {
        this.salary += raise;
        System.out.println(this.name + " has recieved a raise in the amount of " + raise + "$" + ". His new salary is equal to " + this.salary + "$");
    }

    private void displayInfo() {
        System.out.println("Name : " + this.name + "\n ID: " + this.id + "\n Job Title : " + this.jobTitle + " \n Salary " + this.salary + "$");
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
