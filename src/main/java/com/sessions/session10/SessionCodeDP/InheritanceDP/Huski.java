package com.sessions.session10.SessionCodeDP.InheritanceDP;

public class Huski extends Dog {

    //Animal <- Dog <- Husky
    //       <- Cat

    public static void main(String[] args) {
        Huski huski =new Huski();
        System.out.println(huski.age);
        System.out.println(huski.name);
    }



}
