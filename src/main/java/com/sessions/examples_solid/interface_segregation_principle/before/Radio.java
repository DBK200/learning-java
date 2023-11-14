package com.sessions.examples_solid.interface_segregation_principle.before;

public class Radio implements Device{
    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void volumeUp() {
//..
    }

    @Override
    public void volumeDown() {

    }

    @Override
    public void playMusic() {

    }

    @Override
    public void playVideo() {

    }

    @Override
    public void takePicture() {

    }
}
