package com.sessions.session8;

public class Car
{
    private int numberOfWheels;
    private String paintColor;
    private String fuelType;

    public Car(int numberOfWheels, String paintColor, String fuelType)
    {
        this.numberOfWheels = numberOfWheels;
        this.paintColor = paintColor;
        this.fuelType = fuelType;
    }

    public String getPaintColor()
    {
        return paintColor;
    }
}
