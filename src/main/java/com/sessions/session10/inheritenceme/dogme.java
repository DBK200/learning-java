package com.sessions.session10.inheritenceme;

public class dogme extends animalme  {
    public static void main(String[] args) {
        dogme Dogme = new dogme();
        System.out.println(Dogme.age);
        Dogme.eat();
    }

    protected void eat(){
        System.out.println("Dog is eating something else....");
    }
    // method signature must be the same in both classes (parent and child)
    // access modifier cannot be more restrictive thn the method from parent class

}
