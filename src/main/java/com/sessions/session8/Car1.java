package com.sessions.session8;

public class Car1 {

    private int numbersOfWheels;
    private String paintColor;
    private String fuelType;

    public  Car1(int numbersOfWheels, String paintColor, String fuelType){
        this.numbersOfWheels= numbersOfWheels;
        this.paintColor=paintColor;
        this.fuelType=fuelType;
    }

    public String getPaintColor(){
        return paintColor;
    }
}
