package com.sessions.session16.enumhomework;

public enum LightColor {
    RED("Stop", 30),
    YELLOW("Caution", 5),
    GREEN("Go", 45);

    private String representation;
    private int duration;

    LightColor(String representation, int duration){
        this.representation = representation;
        this.duration = duration;
    }
}
