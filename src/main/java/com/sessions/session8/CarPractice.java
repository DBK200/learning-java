package com.sessions.session8;

public class CarPractice {

    private int numberOfWheels;
    private String paintColor;
    private String fuelType;

    public CarPractice(){};

    public CarPractice(int numberOfWheels, String paintColor, String fuelType){
        this.numberOfWheels = numberOfWheels;
        this.paintColor = paintColor;
        this.fuelType = fuelType;
    }

    public String getPaintColor(){
        return paintColor;
    }

    public void printCarStats(){
        System.out.println("Car nr. of wheels:" + numberOfWheels + " car paint:" + paintColor + " car fuel type:" + fuelType);
    }

    private void printHorsePower(){
        System.out.println("Horsepower: 23");
    }
    protected void protectedMethod(){
        System.out.println("Horsepower: 23");
    }

    void defaultAccessMethod(){
        System.out.println("Horsepower: 23");
    }

    public int getNumberOfWheels(){
        return numberOfWheels;
    }

}
