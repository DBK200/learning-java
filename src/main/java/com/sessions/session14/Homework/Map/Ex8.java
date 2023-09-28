package com.sessions.session14.Homework.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex8
{
    //11.Write a Java program to get a set view of the keys contained in this map.
    public static void main(String[] args)
    {
        Map<String ,Integer> map=new HashMap<>();
        map.put("cheie1",1);
        map.put("cheie2",2);
        map.put("cheie3",3);
        map.put("cheie4",4);
        Set<String> setChei=map.keySet();
        System.out.println(setChei);
    }
}
