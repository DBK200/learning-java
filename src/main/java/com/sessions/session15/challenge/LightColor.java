package com.sessions.session15.challenge;

/*
    Challenge - Enumeration Classes

    1. Create an enum called [LightColor] that represents the three colors of a
       traffic light: red, yellow, and green.
       Each color should have a string representation and a duration (in seconds) associated with it
       (e.g., red = "Stop", 30 seconds; yellow = "Caution", 5 seconds; green = "Go", 45 seconds).
*/

import java.util.Arrays;
import java.util.Scanner;

public enum LightColor {
    RED("Stop", 30), YELLOW("Caution", 5), GREEN("Go", 45);

    private String message;
    private int seconds;
    private LightColor(String message, int seconds){
        this.message = message;
        this.seconds = seconds;
    }

    public String getMessage() {
        return message;
    }

    public int getSeconds() {
        return seconds;
    }
}

class EnumTest{

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter a color [RED, YELLOW, GREEN]: ");

        String sInput = scanner.next().toUpperCase();

        LightColor color = null;
        try {
            color = LightColor.valueOf(sInput);
        }
        catch (IllegalArgumentException e) {
            System.out.printf("[%s] is not present in list %s",
                    sInput, Arrays.toString(LightColor.values()));
        }

        if (color != null)
            System.out.printf("You've entered : %s%n"
                            + "The entry has the following additional values:%n"
                            + "\t- list index: %d%n"
                            + "\t- message: %s%n"
                            + "\t- time: %s [seconds]%n",
                    sInput, color.ordinal(), color.getMessage(), color.getSeconds());
    }
}