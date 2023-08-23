package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex8;

public class TrafficLight {

    private String color;
    private int duration;

    public TrafficLight(String color, int duration){
        this.color = color;
        this.duration = duration;
    }

    public boolean isRed(){
        return color.equals("Red");
    }
    public boolean isGreen(){
        return color.equals("Green");
    }
    public boolean isYellow(){
        return color.equals("Yellow");
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void changeColor(String newColor){
        color = newColor;
    }
    public void changeDuration(int newDuration){
        duration = newDuration;
    }
}
