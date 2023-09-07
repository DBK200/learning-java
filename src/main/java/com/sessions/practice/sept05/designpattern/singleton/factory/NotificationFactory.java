package com.sessions.practice.sept05.designpattern.singleton.factory;

        // Create a factory class called NotificationFactory
        // to instantiate concrete class
public class NotificationFactory {

        public Notification createNotification(String channel){
            if(channel == null || channel.isEmpty()){
                return null;
            }

            switch (channel){
                case "SMS":
                    return new SMSNotification();
                case "EMAIL":
                    return new EmailNotification();
                case "PUSH":
                    return new PushNotification();
                default:
                    throw new IllegalArgumentException("Unknown channel");
            }
        }

}
