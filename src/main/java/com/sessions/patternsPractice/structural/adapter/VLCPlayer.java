package com.sessions.patternsPractice.structural.adapter;


// Adaptee class: VLC Player
class VLCPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // Do nothing
    }
}
