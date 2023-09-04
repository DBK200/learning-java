package com.sessions.session15.Homework.Challange6;

public class Main {
    public static void main(String[] args) {

        LightColor currentColor1 = LightColor.GREEN;

        System.out.println("Current Color: " + currentColor1);
        System.out.println("Description: " + currentColor1.getDescription());
        System.out.println("Duration: " + currentColor1.getDurationSeconds());
        System.out.println();

        LightColor currentColor2 = LightColor.YELLOW;

        System.out.println("Current Color: " + currentColor2);
        System.out.println("Description: " + currentColor2.getDescription());
        System.out.println("Duration: " + currentColor2.getDurationSeconds());
        System.out.println();

        LightColor currentColor3 = LightColor.RED;

        System.out.println("Current Color: " + currentColor3);
        System.out.println("Description: " + currentColor3.getDescription());
        System.out.println("Duration: " + currentColor3.getDurationSeconds());
    }
}
