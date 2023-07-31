package com.sessions.session8.HomeworkPackage;

public class Phone {
    private String brand;
    private int price;
    private String color;

    public String getBrand() {
        return "The brand of the phone is: " + brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getPrice(){
        return "The price of the phone is: " + price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getColor(){
        return "The color of the phone is: " + color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void powerOn(){
        System.out.println("The phone is powering on");
    }
    public void powerOff(){
        System.out.println("The phone is powering off");
    }
    public void ring(){
        System.out.println("The phone is ringing");
    }
    public void openCamera(){
        System.out.println("Opening camera app");
    }
}
