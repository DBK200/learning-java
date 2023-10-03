package com.sessions.session21.creational;

public class SingletonHomework {
    // Static variable reference of single_instance
    // of type Singleton
    private static SingletonHomework single_instance = null;

    // Declaring a variable of type String
    public String s;

    // Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
    public  SingletonHomework getSingle_instance() {
        s = "Hello I am a string part of Singleton class";
        return single_instance;
    }

    // Static method
    // Static method to create instance of Singleton class
    public static synchronized SingletonHomework getInstance()
    {
        if (single_instance == null)
            single_instance = new SingletonHomework();

        return single_instance;
    }
}
class Test2 {
    public static void main(String[] args) {
        SingletonHomework x = SingletonHomework.getInstance();
        SingletonHomework y = SingletonHomework.getInstance();
        SingletonHomework z = SingletonHomework.getInstance();
        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());
        System.out.println("Hashcode of z is "
                + z.hashCode());
        if (x == y && y == z) {

            // Print statement
            System.out.println(
                    "Three objects point to the same memory location on the heap i.e, to the same object");
        }

        else {
            // Print statement
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
        }
    }


}
