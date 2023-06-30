package com.sessions;

public class Phone {

    private String brandName;
    private String model;
    private int price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    private double displaySize;

    public String getBrandName(){
        return brandName;
    }

    public void setBrandName(String brandName){
        this.brandName = brandName;
    }

}
