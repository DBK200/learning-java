package com.sessions.session1;

public class TV {

    private int yearOfFabrication;
    private double price;
    private double screenSize;
    private String brandName;
    private boolean has4K;

    public int getYearOfFabrication() {
        return yearOfFabrication;
    }

    public void setYearOfFabrication(int yearOfFabrication) {
        this.yearOfFabrication = yearOfFabrication;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public boolean isHas4K() {
        return has4K;
    }

    public void setHas4K(boolean has4K) {
        this.has4K = has4K;
    }

    public String getAllDetails(){
        return "My TV brand name is " +brandName + ", the screen size is " +screenSize + " and it costs " + price +"$ .";
    }

}
