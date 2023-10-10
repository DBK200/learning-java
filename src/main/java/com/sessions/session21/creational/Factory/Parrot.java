package com.sessions.session21.creational.Factory;

public class Parrot implements Bird{
    @Override
    public void fly() {
        System.out.println("The parrot is flying");
    }
    public void taking(){
        System.out.println("The parrot is taking");
    }
}
