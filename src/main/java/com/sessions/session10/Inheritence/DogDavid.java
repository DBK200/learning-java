package com.sessions.session10.Inheritence;

public class DogDavid extends AnimalDavid{
    protected String name;

//    public static void main(String[] args) {
//        DogDavid dogDavid=new DogDavid();
//        System.out.println(dogDavid.age);
//        dogDavid.eat();
//    }

    @Override
    public void eat(){
        System.out.println("Dog is eating something else...");
    }

    //method signature must be the same in both classes(parent and child)
    //access modifier cannot be more restrictive than the method from parent class
    //return type must be covariant(same type or a subclass)
    //if exception is throw in parent class method, child class cannot throw a broader
    //exception type
}
