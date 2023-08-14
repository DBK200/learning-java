package com.sessions.session10.inheritanceAV;

public class CatAV extends AnimalAV{

    public static void main(String[] args) {
        CatAV kitty = new CatAV();
        kitty.age = 3;
        System.out.println(kitty.age);

        DogAV rex = new DogAV();
        rex.age = 4;
        System.out.println(rex.age);
    }
}
