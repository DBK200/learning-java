package com.sessions.session13recap.oop;

public class Car {

    // 3. Car: Create a Car class that has the following attributes:
    // make, model, year, and color. Implement methods for starting
    // the car, stopping the car, accelerating, and braking.

    // Attributes
    private String make;
    private String model;
    private int year;
    private String color;



    private boolean isOn;
    private int currentSpeed;

    // Method to start the car
    public void engineOn(boolean isOn){
         isOn=true;
        System.out.println("The car is on");
    }

    // Method to stop the car
    public void engineOff(boolean isOn){
        isOn=false;
        System.out.println("The car is off");
    }

    // Method to accelerate the car
    public void accelerate(int speed){
        if(isOn) {
            currentSpeed += speed;
            System.out.println("You accelerated with " + speed + " km/h");
        } else{
            System.out.println("You cannot accelerate if the car is off");
        }
    }

    public void brake(){
            currentSpeed = 0;
    }



}
