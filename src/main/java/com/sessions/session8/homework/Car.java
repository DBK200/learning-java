package com.sessions.session8.homework;

public class Car {

    private int carSerialNumber;
    private String brand;
    private String color;

    public int getCarSerialNumber() {
        return carSerialNumber;
    }
    public void setCarSerialNumber(int carSerialNumber) {
        this.carSerialNumber = carSerialNumber;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Car(){};
    public Car(int carSerialNumber, String brand, String color){
        this.carSerialNumber = carSerialNumber;
        this.brand = brand;
        this.color = color;
    }

    public void carInfo(){
        System.out.println("Car " + carSerialNumber + "B:" + brand + "C:" + color);
    }

}
