package com.sessions.session15.Homework.Exercise6;

public enum LightColor {
    RED("Stop", 30),
    YELLOW("Caution", 5),
    GREEN("Go", 45);
    private String action;
    private int duration;
    LightColor(String action, int duration) {
        this.action = action;
        this.duration = duration;
    }
    public String getAction() {
        return action;
    }
    public int getDuration() {
        return duration;
    }
}
