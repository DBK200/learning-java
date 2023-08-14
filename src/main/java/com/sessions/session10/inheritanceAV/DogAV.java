package com.sessions.session10.inheritanceAV;

public class DogAV extends AnimalAV{ //Dog is an Animal

    protected String name;

//    public static void main(String[] args) {
//        DogAV dog = new DogAV();
//        System.out.println(dog.age);
//        dog.eat("food");
//
//    }

    @Override //adnotare care indica ca o sa facem o metoda suprascrisa
    protected void eat(String xd) {
        System.out.println("Dog is eating something else...");
    }

    //1. method signature must be the same in both classes (parent and child)
    //2. cannot make weaker access modifier (acces modifier cannot be more restrictive than the method from tge parent class)
    //3. return type must be the same or a subclass of the type (return type must be covariant - same type or subclass)
    //4. if parent class method throws expection, the child method cannot throw a more general/broader exception
}
