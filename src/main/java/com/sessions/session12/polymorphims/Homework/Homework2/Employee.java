package com.sessions.session12.polymorphims.Homework.Homework2;

public class Employee {

    private String name;
    private String role;
    private int age;

    public Employee(String name, String role, int age){
        this.name = name;
        this.role = role;
        this.age = age;
    }

    public Employee(String name) {
        this.name = name;
    }
    public void work(){
        System.out.println("The employee is working");
    }
    @Override
    public String toString(){
        return "Name: " + name + ", Role: " + role + ", Age: " + age;
    }

    public void receiveAnnouncements(String message){
        System.out.println("Employees received message: " + message);

    }
    public String getName(){
        return name;
    }
}
