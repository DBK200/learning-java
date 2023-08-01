package com.sessions.session8;

public class CarRoxana
{
    private int numberOfWheels;
    private String paintColor;
    private String fuelType;

    private int getNumberOfWheels(){
        return numberOfWheels;
    }

    public CarRoxana(){
    }

    public CarRoxana(int numberOfWheels, String paintColor, String fuelType){
        this.numberOfWheels = numberOfWheels;
        this.paintColor = paintColor;
        this.fuelType = fuelType;
    }

    public String getPaintColor(){
        return paintColor;
    }

    private void printHorsepower(){
        System.out.println("Horsepower : 23");
    }

    protected void protectedMethod(){
        System.out.println("Protected : 23");
    }

    void defaultAccessModifierMethod(){
        System.out.println("Protected : 23");
    }

}
