package com.sessions.session16.Homework16;

public enum LightColor {

    RED("Stop",30),
    YELLOU("Caution",5),
    GREEN("Go",45);

    private String representation;
    private int duration;

    LightColor(String representation, int duration) {
        this.representation = representation;
        this.duration = duration;
    }

    public String getRepresentation() {
        return representation;
    }

    public int getDuration() {
        return duration;
    }
}
