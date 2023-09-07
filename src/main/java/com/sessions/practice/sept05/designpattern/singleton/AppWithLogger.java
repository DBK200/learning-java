package com.sessions.practice.sept05.designpattern.singleton;

public class AppWithLogger {
    public static void main(String[] args) {

        // get the Logger instance
        Logger logger = Logger.getInstance();

        // Log messages with log method from Logger class
        logger.log("Application started");
        logger.log("Processing data...");
        logger.log("Application finished");
    }
}
