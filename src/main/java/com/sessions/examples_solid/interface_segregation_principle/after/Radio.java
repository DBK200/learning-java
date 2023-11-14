package com.sessions.examples_solid.interface_segregation_principle.after;

public class Radio implements Switchable, AdjustableVolume, MusicPlayer {

    @Override
    public void volumeUp() {
        System.out.println("turning voluming up...");
    }

    @Override
    public void volumeDown() {
        System.out.println("Radeio ...turning voluming down...");
    }

    @Override
    public void playMusic() {

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}
