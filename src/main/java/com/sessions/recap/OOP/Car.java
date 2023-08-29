package com.sessions.recap.OOP;

public class Car {

//    Car: Create a Car class that has the following attributes: make, model, year, and color.
//    Implement methods for starting the car, stopping the car, accelerating, and braking.

    private String make;
    private String model;
    private int year;
    private String color;


    public Car(){

    }
    public Car(String make,String model,int year,String color)
    {
        this.make=make;
        this.model=model;
        this.year=year;
        this.color=color;
    }

    public void startingTheCar(){
        System.out.println("The car started");
    }
    public void stoppingTheCar(){
        System.out.println("The car stopped");
    }
    public void acceleratingTheCar(){
        System.out.println("The car accelerates");
    }
    public void brakingTheCar(){
        System.out.println("The car brakes");
    }
}
