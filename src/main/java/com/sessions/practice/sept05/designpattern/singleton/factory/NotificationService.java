package com.sessions.practice.sept05.designpattern.singleton.factory;


        // Use factory class to create and get an object
        // of concrete class by passing some information

public class NotificationService {

    public static void main(String[] args) {
            NotificationFactory notificationFactory = new NotificationFactory();
            Notification notification = notificationFactory.createNotification("SMS");
            notification.notifyUser();
    }
}
