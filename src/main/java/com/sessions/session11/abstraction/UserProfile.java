package com.sessions.session11.abstraction;

public interface UserProfile {

    // public static final fields
    // abstract methods

    // Variables
    int x = 2;
    public static final int y = 3;

    // De adaugat comentarii de genul asta la metode pentru mai multa claritate:
    /*
    * This method returns an email of the user
    * Accepts ... parameters
     */

    // Abstract methods
    public abstract void getEmailAddress();

    void getUserPhoneNumber();

    // default methods - sunt metode care au implementare si se gasesc in interfete
    default String getUserAddress(){
        return "default address";
    }
}
