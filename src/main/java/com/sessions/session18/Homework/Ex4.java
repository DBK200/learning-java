package com.sessions.session18.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex4 {

    public static void main(String[] args) {
        //Sorting: Write a program that uses a stream to sort a list of custom objects by a specific property, such as age or name.
        List<User> list = new ArrayList<>();
        list.add(new User(25, "Robert"));
        list.add(new User(30, "Ion"));
        list.add(new User(20, "Marian"));

        list.sort(Comparator.comparing(User::getAge));
        System.out.println(list);
        List<User> sortedList = list.stream().sorted(Comparator.comparing(User::getAge)).toList();
        System.out.println(sortedList);

    }
}
class User{
    private int age;
    private String name;


    User(int age, String name){
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
}