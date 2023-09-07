package com.sessions.practice.sept05.designpattern.singleton.factory;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an e-mail notification");
    }
}
