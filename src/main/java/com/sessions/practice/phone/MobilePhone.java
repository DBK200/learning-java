package com.sessions.practice.phone;

public class MobilePhone implements Telephone{
    private String myNumber;
    private boolean isRinging;
    private boolean isPowerOn;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Mobile phone powered on");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on mobile phone");
    }

    @Override
    public void answer() {
        if(isRinging && isPowerOn){
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if(phoneNumber==myNumber && isPowerOn){
            isRinging=true;
            System.out.println("Phone ringing");
        } else{
            System.out.println("Either wrong number entered or mobile phone is off");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
