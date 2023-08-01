package com.sessions.session8;

public class HomeworkBAnimal {

    String animalName;
    private int legs;
    private String color;
    private int age;

    public  HomeworkBAnimal(String animalName, int legs, String color, int age){
        this.animalName = animalName;
        this.legs = legs;
        this.color = color;
        this.age = age;

    }
     public void AnimalSound(){
         System.out.println("The elephant make a sound");
     }

}
