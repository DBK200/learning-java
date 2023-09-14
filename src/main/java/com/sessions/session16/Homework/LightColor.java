package com.sessions.session16.Homework;

public enum LightColor {
    RED("Stop", 30),
    YELLOW("Caution", 5),
    GREEN("Go", 45);


    private String LightColor;
    private int seconds;

    LightColor(String LightColor, int seconds) {
        this.LightColor = LightColor;
        this.seconds = seconds;
    }

    public String getLightColor() {
        return LightColor;
    }

    public int getSeconds() {
        return seconds;
    }
     class TrafficLights{
        public static void main(String[] args) {

        }
    }
}
