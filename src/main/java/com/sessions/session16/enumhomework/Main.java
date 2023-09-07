package com.sessions.session16.enumhomework;

public class Main {

    public static void main(String[] args) {
        LightColor lightColor1 = LightColor.GREEN;
        LightColor lightColor2 = LightColor.YELLOW;
        LightColor lightColor3 = LightColor.RED;

        System.out.println(lightColor1.name());
        System.out.println(lightColor1.ordinal());
        System.out.println(lightColor1.equals(lightColor2));
        System.out.println(lightColor2.name());
        System.out.println(lightColor2.ordinal());
        System.out.println(lightColor3.hashCode());


    }
}
