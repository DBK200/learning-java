package com.sessions.session10.Inheritence;

public class CatDavid extends AnimalDavid{

    public static void main(String[] args) {
        CatDavid kitty=new CatDavid();
        kitty.age=3;
        System.out.println(kitty.age);

        DogDavid rex=new DogDavid();
        rex.age=4;
        System.out.println(rex.age);
    }
}
