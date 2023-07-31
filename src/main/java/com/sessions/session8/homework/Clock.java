package com.sessions.session8.homework;

public class Clock {
    private String type;
    private String brand;
    private int cost;

    public Clock (String type, String brand, int cost) {
        this.type = type;
        this.brand = brand;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }
    public String getBrand() {
        return brand;
    }
    public int getCost() {
        return cost;
    }
}
