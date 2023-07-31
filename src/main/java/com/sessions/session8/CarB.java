package com.sessions.session8;

public class CarB {

    //Proprietati
    private int numbersOfWheels;
    private String paintColor;
    private String fuelType;



    public CarB(int numbersOfWheels, String paintColor, String fuelType){
        this.numbersOfWheels = numbersOfWheels;
        this.paintColor = paintColor;
        this.fuelType = fuelType;
    }
    private int getNumberOfWheels(){
        return numbersOfWheels;
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
        void defaultAccessModifierMethod() {
            System.out.println("Protected : 23");
    }

}
