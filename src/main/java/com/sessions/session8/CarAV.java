package com.sessions.session8;

public class CarAV {

    private int numberOfWheels;
    private String paintColor;
    private String fuelType;

    public CarAV(){

    }

    public CarAV(int numberOfWheels, String paintColor, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.paintColor = paintColor;
        this.fuelType = fuelType;
    }
    public String getPaintColor() {
      return paintColor;
    }
    public int getNumberOfWheels(){
        return numberOfWheels;
    }

    private void printHorsePower() {
        System.out.println("Horsepower: 23");
    }

    protected void protectedMethod() {
        System.out.println("protected");
    }

    void defaultMethod() {
        System.out.println("defaultMethod");
    }
}
