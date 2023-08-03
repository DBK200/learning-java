package com.sessions.session10.Inheritance;

public class Dog extends Animal{

    protected String name;

//    public static void main(String[] args) {
//        Dog dog = new Dog();
//        System.out.println(dog.age);
//
//        dog.eat();
//    }

    /* Reguli pt supraincarcarea metodei (Override):
       - semnatura metodei trebuie sa fie aceeasi atat la cea initiala cat si la cea supraincarcata
       - Method signatura must be the same in both classes (parent and child)
       - Access modifier cannot be more restrictive than the method from parent class (trebuie sa fie la fel sau mai permisiva)
       - Return type must be covariant (meaning same type or a subclass)
       - if exception in thrown in parent class method, child class method cannot throw a broader exception type (adica un tip mai permisiv)
     */
    @Override
    protected void eat() throws RuntimeException{
        System.out.println("Dog is eating something else..");
    }
}
