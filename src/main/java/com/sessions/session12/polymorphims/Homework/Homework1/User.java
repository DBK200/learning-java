package com.sessions.session12.polymorphims.Homework.Homework1;

public class User implements Person{

    int Id = 33;

    public int getId(){
        return Id;
    }
    public void saySomething(){
        System.out.println("Hello");
    }

    @Override
    public void printSomething() {
        System.out.println("Superclass");
    }
    public int multiplication(int a, int b){
        return a * b;
    }
    public int multiplication(int a, int b, int c){
        return a * b * c;
    }
}
