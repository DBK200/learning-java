package com.sessions.practice.w3resourceaug20;

public class TrafficLight {

    // Properties / attributes
    private String color;
    private int duration;

    // All args constructor
    public TrafficLight(String color, int duration){
        this.color = color;
        this.duration = duration;
    }

    // Getters and setters
    // Getters
    public String getColor(){
        return color;
    }

    public int getDuration(){
        return duration;
    }

    // Setters
    public void setColor(String color){
        this.color = color;
    }    // --> to use when we need to change the color of the traffic light

    public void setDuration(int duration){
        this.duration = duration;
    }


    // Method to check if the color is red
    public boolean checkIfColorIsRed(String color){
        String colorInLowerCase = color.toLowerCase();
        return colorInLowerCase.equals("red");
    }

    public boolean checkIfColorIsGreen(String color){
        String colorInLowerCase = color.toLowerCase();
        return color.equals("green");
    }
}
