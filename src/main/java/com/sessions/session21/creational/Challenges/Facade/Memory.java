package com.sessions.session21.creational.Challenges.Facade;

public class Memory {
    public void startMemory(boolean a){
        if (a == true) {
            System.out.println("The memory is running");
        } else if (a == false) {
            System.out.println("The memory isn't running");
        }
    }
}
