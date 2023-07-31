package com.sessions.session8;

public class Carr {

    private int numberOfWheels;
    private String paintColor;
    private String fuelType;

    private int getNumberOfWheels(){
        return numberOfWheels;
    }


    public Carr(){

    }

    public Carr(int numberOfWheels, String paintColor, String fuelType){
        this.numberOfWheels = numberOfWheels;
        this.paintColor = paintColor;
        this.fuelType = fuelType;

    }

    public String getPaintColor(){
        return paintColor;
    }

    private void printHorsepower(){
        System.out.println("Horsepower : 100");
    }

    protected void protectedMethod(){
        System.out.println("protected : 100");
    }
    void defaultMethod(){
        System.out.println("default : 100");
    }
}
