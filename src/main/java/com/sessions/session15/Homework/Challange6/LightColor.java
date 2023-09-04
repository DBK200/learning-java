package com.sessions.session15.Homework.Challange6;

public enum LightColor {
    RED("Stop", 30),
    YELLOW("Caution", 5),
    GREEN("Go", 45);

    private final String description;
    private final int durationSeconds;

    private LightColor(String description, int durationSeconds){
        this.description = description;
        this.durationSeconds = durationSeconds;
    }

    public String getDescription(){
        return description;
    }
    public int getDurationSeconds(){
        return  durationSeconds;
    }
}
