package com.sessions.session12.polymorphism.polymorphismexample;

public class Dog extends Animal{

    int age = 5;
    String breed;

    // Constructor
    public Dog(String breed){
        this.breed=breed;
    }

    public String doSomething(int age){
        if(age < 3){
            return "Your dog is a baby dog";
        } else if (age >=3 && age < 5){
            return "Your dog is middle age";
        } else{
            return "Your dog is plus age";
        }
    }

}
