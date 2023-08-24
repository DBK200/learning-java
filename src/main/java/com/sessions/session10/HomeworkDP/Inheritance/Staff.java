package com.sessions.session10.HomeworkDP.Inheritance;

public class Staff extends User{

    private double salary;
    private String department;


    protected Staff(String email, String password, String name, String address, double salary, String department) {
        super(email, password, name, address);
        this.salary=salary;
        this.department=department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}
