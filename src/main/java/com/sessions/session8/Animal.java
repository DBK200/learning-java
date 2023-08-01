package com.sessions.session8;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    private int numberOfMembers;
    private String color;
    //private String[] typeOfAlimentation={"Carnivore","Herbivore","Omnivore"};

    public Animal(int numberOfMembers,String color)
    {
        this.numberOfMembers=numberOfMembers;
        this.color=color;

    }

    public String GetColor(){

        return color;
    }
}
