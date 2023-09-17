package com.sessions.session18.Homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex4Sorting
{
    //write a program that uses a stream to sort a list of custom objects by a specific property ,such as age or name

    public static void main(String[] args)
    {
        List<User1> list=new ArrayList<>();
        list.add(new User1(13,"Ana"));
        list.add(new User1(23,"Maria"));
        list.add(new User1(43,"Crina"));
        list.add(new User1(16,"Roxana"));
        System.out.println("Lista nesortata:"+list);
        List<User1> sortedList=list.stream().sorted(Comparator.comparing(User1::getAge)).toList();
        System.out.println("Lista sortata:"+sortedList);
    }
}
class User1{
    private int age;
    private String name;
    User1(int age,String name)
    {
        this.age=age;
        this.name=name;

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
