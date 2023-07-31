package com.sessions.session8.HomeworkPackage;

public class Animal {

    private String name;
    private String type;
    private String color;
    private int age;


    public Animal (String name, String type, String color, int age){
        this.name = name;
        this.type = type;
        this.color = color;
        this.age = age;
    }

    public void run(){
        System.out.println("The animal is running");
    }
    public void eat(){
        System.out.println("The animal is eating");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    public void makeSound(){
        System.out.println("The animal makes it's specific sound");
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
}
