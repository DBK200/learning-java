package com.sessions.session10.Inheritance;

public class DogM extends AnimalM{
    public static void main(String[] args) {
        DogM dog = new DogM();
        System.out.println(dog.age);
        dog.eat("food");
    }
    protected String name;
    public void eat(String xd){
        System.out.println("Dog is eating something else...");
    }
    // 1 method signature (eat) must be the same in both classes (parent and child)
    // 2 access modifier cannot be more restrictive than the method from parent class
    // 3 return type must be covariant (same type or a subclass)
    // 4 if exception is thrown in parent class method, child class method cannot throw a broader exception type

}
