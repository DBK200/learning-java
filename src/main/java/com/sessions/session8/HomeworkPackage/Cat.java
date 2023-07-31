package com.sessions.session8.HomeworkPackage;

public class Cat extends Animal{

    public Cat(String name, String type, String color, int age) {
        super(name, type, color, age);
    }
    @Override
    public void makeSound(){
        System.out.println(getType() + "says Meow");
    }
    @Override
    public void run() {
        System.out.println(getType() +  "is running");
    }
    public void scratchFurniture(){
        System.out.println("The cat is scratching the furniture.");
    }
}
