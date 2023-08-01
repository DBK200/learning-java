package com.sessions.session8.HomeworkSession8;

public class Car {

    // Properties
   private String make;
   private String model;
   private int year;
   private String color;
   private int currentSpeed;
   private boolean engineOn;

   // Constructor
    public Car(String make, String model, int year, String color, int currentSpeed, boolean engineOn){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.currentSpeed = currentSpeed;
        this.engineOn = engineOn;
    }

    // Getters
    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public String getColor(){
        return color;
    }

    public int getCurrentSpeed(){
        return currentSpeed;
    }



    public void turnOn(){
        if(!engineOn) {
            engineOn = true;
            System.out.println("Engine is now on");
        } else{
            System.out.println("Engine is already on");
        }
    }

    public void turnOff(){
        if(engineOn){
            engineOn = false;
            System.out.println("Engine is now off");
        } else{
            System.out.println("Engine is already off");
        }
    }

    public void accelerate(int speed){
        if(engineOn){
            currentSpeed+=speed;
            System.out.println("Accelerating to " + currentSpeed + " km/h");
        } else {
            System.out.println("Please turn on the engine first");
        }
    }

    public void decelerate(int speed){
        if(engineOn){
            currentSpeed-=speed;
            if(currentSpeed<0){
                currentSpeed=0;
            }
            System.out.println("Decelerate to " + currentSpeed + " km/h");
        } else{
            System.out.println("Please turn on the engine first");
        }

    }

}
