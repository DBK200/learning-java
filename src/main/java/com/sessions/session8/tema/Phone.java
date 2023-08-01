package com.sessions.session8.tema;

public class Phone
{
    private String paintColor;
    private int numberOfCameras;
    private int batteryCapacity;

    public int getBatteryCapacity()
    {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity)
    {
        this.batteryCapacity = batteryCapacity;
    }

    public int getNumberOfCameras()
    {
        return numberOfCameras;
    }

    public void setNumberOfCameras(int numberOfCameras)
    {
        numberOfCameras = numberOfCameras;
    }

    public String getPaintColor()
    {
        return paintColor;
    }

    public void setPaintColor(String paintColor)
    {
        this.paintColor = paintColor;
    }
}
