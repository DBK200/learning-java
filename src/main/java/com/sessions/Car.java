package com.sessions;

public class Car {
    private String brand;
    private String engineType;
    private boolean fourWD;
    private int cylinders;
    private boolean twelveCylinder;

    public void setBrand(String brand){

        this.brand = brand;
    }
    public void setEngineType(String engineType){

        this.engineType = engineType;
    }
    public void  setFourWD(boolean fourWD) {

        this.fourWD = fourWD;

    }
    public void setCylinders(int cylinders){

        this.cylinders = cylinders;
    }
    public String getBrand(){

        return brand;
    }
    public String getEngineType(){
        return engineType;
    }
    public int getCylinders() {
        return cylinders;
    }
    public boolean fourWD(){
        return fourWD;
    }
    public void setTwelveCylinder(boolean twelveCylinder){
        this.twelveCylinder = twelveCylinder;

    }
    public boolean getTwelveCylinder(){
        return twelveCylinder;
    }
}
