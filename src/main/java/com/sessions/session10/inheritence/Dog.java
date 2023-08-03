package com.sessions.session10.inheritence;

public class Dog extends Animal{

    protected String name;

//    public static void main(String[] args) {
//        Dog dog = new Dog();
//        System.out.println(dog.age);
//        dog.eat("food");
//    }

    protected void eat(String xd) {
        System.out.println("Dog is eating something else..");
    }

    // 1 method signature must be the same in both classes (parent and child)
    // 2 access modifier cannot be more restrictive than the method from parent class
    // 3 return type must be covariant ( same type or a subclass)
    // 4 if exception is thrown in parent class method, child class method cannot throw a broader
    //   exception type

}
