package com.sessions.session18.Homework;

import java.util.ArrayList;
import java.util.List;

public class Ex2Mapping
{
    //Mapping: Write a program that uses a stream to transform a list of
    // strings to uppercase and then sort them in alphabetical order.
    public static void main(String[] args)
    {
        List<String> list=new ArrayList<>();
        list.add("Ana");
        list.add("Alex");
        list.add("Madalina");
        list.add("Andrei");
        list.add("Stefan");
        System.out.println("Lista :"+list);

        List<String > sortedList=list.stream().map(String->String.toUpperCase()).sorted().toList();
        System.out.println("Lista sortata:"+sortedList);
    }
}
