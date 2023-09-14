package com.sessions.session18.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex4 {
    private int age;
    private String name;


    Ex4(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return this.age + " " + this.name;
    }

    public static void main(String[] args) {
        //Sorting: Write a program that uses a stream to sort a list of custom objects by a specific property, such as age or name.
        List<Ex4> list = new ArrayList<Ex4>();
        list.add(new Ex4(25, "Robert"));
        list.add(new Ex4(30, "Ion"));
        list.add(new Ex4(20, "Marian"));

        list.sort(Comparator.comparing(Ex4::getAge));



    }
}
