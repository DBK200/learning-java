package com.sessions.session11.practice.abstraction;

public interface UserInterface extends UserInterfaceA, UserInterfaceB {
    // For interface inheritance, the keyword EXTENDS must be used, not IMPLEMENT
    // An interface can extend more than one interface!!!

    // All the variables are by default PUBLIC, STATIC and FINAL
    // They have to be initialised because initialiser blocks and constructors are not allowed
    int x = 2;
    public static final int y = 3;


    // Abstract method
    public abstract void getEmailAddress();

    // PUBLIC and ABSTRACT are implicit in an interface, thus optional
    void getUserPhoneNumber();

    // In an interface, usually is not allowed to have concrete methods,
    // but by using the keyword DEFAULT a concrete method can be added.
    // This is useful when a method is added after deployment.
    default void getUserAddress() {
        System.out.println("This is the user address");
    }
}

interface UserInterfaceA {
    void getUserManager();
}

interface UserInterfaceB {
    void getUserManager();
}
