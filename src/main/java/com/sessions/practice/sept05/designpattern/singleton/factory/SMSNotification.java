package com.sessions.practice.sept05.designpattern.singleton.factory;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
}
