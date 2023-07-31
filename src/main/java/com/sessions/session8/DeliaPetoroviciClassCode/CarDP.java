package com.sessions.session8.DeliaPetoroviciClassCode;

public class CarDP {
    private int numberOfWheels;
    private String color;
    private String fuelType;

    public CarDP(int numberOfWheels, String color, String fuelType){
        this.numberOfWheels=numberOfWheels;
        this.color=color;
        this.fuelType=fuelType;
    }

    public String getPaintColor(){
        return this.color;
    }
}
