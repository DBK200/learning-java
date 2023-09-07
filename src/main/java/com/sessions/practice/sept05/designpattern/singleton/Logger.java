package com.sessions.practice.sept05.designpattern.singleton;

public class Logger {

    // static instance
    private static Logger instance;

    // private constructor to prevent external instantiation
    private Logger(){

    }

    // 3. Lazy initialization
    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message){
        // Logic to log the message to a file, console, or elsewhere
        System.out.println("Log: " + message);
    }
}
