package com.sessions.session13.Homework.OOP1;

import java.util.WeakHashMap;

public class Employee
{
    ////Employee: Create an Employee class that has the following attributes:
    // name, id, salary, and job title. Implement methods
    //    // for calculating the employee's annual salary, giving the employee
    //    a raise, and displaying the employee's information.
    private String name;
    private long  id;
    private int salary;
    private String jobTittle;
    Employee(String name,long id,int salary,String jobTittle)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.jobTittle=jobTittle;
    }
    //metoda pentru calcularea salariilor
    public long annualSalary()
    {
        return 12*salary;
    }
    //metoda pt mari salariilor
    public long raise()
    {
        int raise=200;
        return raise;
    }
    //metoda care arata informatiile
    public void information()
    {
        System.out.println("Name:"+name);
        System.out.println("ID:"+id);
        System.out.println("Salary:"+salary);
        System.out.println("Job title:"+jobTittle);

    }

    public static void main(String[] args)
    {
        Employee employee=new Employee("Roxana Enache",238947738,2300,"Software developer");
        System.out.println("The salary for one year is:");
        System.out.println(employee.annualSalary());
        System.out.println("Raise:");
        System.out.println(employee.raise());
        System.out.println("Informatii:");
        employee.information();



    }

}
