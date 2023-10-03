package com.sessions.session24.interface_segregation_principle.after;

public class BluetoothSpeaker implements Switchable, AdjustableVolume, MusicPlayer {
    @Override
    public void turnOn() {
        // code to turn on the Bluetooth speaker
    }

    @Override
    public void turnOff() {
        // code to turn off the Bluetooth speaker
    }

    @Override
    public void volumeUp() {
        // code to increase volume of the Bluetooth speaker
    }

    @Override
    public void volumeDown() {
        // code to decrease volume of the Bluetooth speaker
    }

    @Override
    public void playMusic() {
        // code to play music on the Bluetooth speaker
    }
}
