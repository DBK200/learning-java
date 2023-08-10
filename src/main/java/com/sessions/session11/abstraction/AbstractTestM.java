package com.sessions.session11.abstraction;

import com.sessions.session11.UserProfileM;

public class AbstractTestM implements UserProfileM {

    public void getEmailAddress(){
        System.out.println("This is the email address");
    }

    public void getUserPhoneNumber(){
        System.out.println("This is the phone number");
    }
    public String getUserAddress(){
        return "this is from current class";
    }
    public static void main(String[] args) {
//        Vehicle car = new CarM();
//        car.startEngine();
//        Vehicle.myMethod();

        AbstractTestM abstractTestM = new AbstractTestM();
        System.out.println(abstractTestM.getUserAddress());

    }
}
