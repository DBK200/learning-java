package com.sessions.session10.inheritance;

public class Huski extends Dog{

    public static void main(String[] args) {
        Huski huski = new Huski();

        System.out.println(huski.age + 1);
        System.out.println(huski.name);
    }

}
