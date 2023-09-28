package com.sessions.session14.Homework.Map;

import java.util.HashMap;
import java.util.Map;

public class Ex3
{
    //Write a Java program to remove all of the mappings from a map.
    public static void main(String[] args)
    {
        Map<String ,Integer> map=new HashMap<>();
        map.put("cheie1",1);
        map.put("cheie2",2);
        map.put("cheie3",3);
        map.put("cheie4",4);
        map.put("cheie5",5);
        map.remove("cheie1");
        map.remove("cheie2");
        map.remove("cheie3");
        map.remove("cheie4");
        map.remove("cheie5");
        System.out.println(map);
    }
}
