package com.sessions.session21.creational.Challenges.Facade;

public class HardDrive {
    public void startHdd(boolean a){
        if (a == true){
        System.out.println("The Hdd is running");
        } else if (a == false) {
            System.out.println("The hdd isn't running");
        }
    }
}
