package com.sessions.session11.AbstractTest;

public class AbstractTestR implements UserProfileRoxana
{
    public void getEmailAddress()
    {
        System.out.println("this is a email address");
    }
    public void getUserPhoneNumber()
    {
        System.out.println("this is a phone number");
    }
    public String getUserAdress()
    {
        return "this is from current class";
    }
    public static void main(String[] args) {
//        CarR car=new CarR();
//        car.startEngine();
        //metoda statica se poate folosi si intr o clasa abstracta
        VehicleR.myMethod();
        AbstractTestR abstractTestR = new AbstractTestR();
        System.out.println(abstractTestR.getUserAdress());


    }
}
