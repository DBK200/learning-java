package com.sessions.session25.practice.interface_segregation_principle.after;

public class Television implements Switchable, AdjustableVolume, VideoPlayer {
    @Override
    public void turnOn() {
        // code to turn on the television
    }

    @Override
    public void turnOff() {
        // code to turn off the television
    }

    @Override
    public void volumeUp() {
        // code to increase volume of the television
    }

    @Override
    public void volumeDown() {
        // code to decrease volume of the television
    }

    @Override
    public void playVideo() {
        // code to play a video on the television
    }
}
