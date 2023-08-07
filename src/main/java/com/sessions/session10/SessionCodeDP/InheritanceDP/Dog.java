package com.sessions.session10.SessionCodeDP.InheritanceDP;

public class Dog extends Animal{

    protected String name;
    //method signature must be the same in both classes(parent and child)
    //access modifier cannot be more restrictive than method from parent class
    //return type must be covariant (same type or subclass of type)
    //if exception is thrown in parent class method, child class method cannot throw a broader exception type
    @Override
    protected void eat(){
        System.out.println("Dog is eating");
    }

//    public static void main(String[] args){
//        Dog dog=new Dog();
//        System.out.println(dog.age);
//        dog.eat();
//    }
}
