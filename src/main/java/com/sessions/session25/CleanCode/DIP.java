package com.sessions.session25.CleanCode;

public class DIP {
}

interface Device{
    void turnOn();
    void turnOff();
}

class Light implements Device{

    public void turnOn(){
        System.out.println("Light is ON");
    }

    public void turnOff(){
        System.out.println("Light is OFF");
    }
}

class Fan implements Device{


    @Override
    public void turnOn() {
        System.out.println("Fan is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is OFF");
    }
}

class RemoteControl{
    private Device device;

    public RemoteControl(Device device){
        this.device = device;
    }

    public void pressButtonOn(){
        device.turnOn();
    }
    public void pressButtonOff(){
        device.turnOff();
    }
}

class Main{
    public static void main(String[] args) {
        Device light = new Light();
        RemoteControl remoteForLight = new RemoteControl(light);
        remoteForLight.pressButtonOff();
        remoteForLight.pressButtonOn();

        Device fan= new Fan();
        RemoteControl remoteForFan = new RemoteControl(fan);
        remoteForFan.pressButtonOn();
        remoteForFan.pressButtonOff();
    }
}


