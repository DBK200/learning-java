package com.sessions.practice.sept05.designpattern.singleton.factory;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending a Push Notification");
    }
}
