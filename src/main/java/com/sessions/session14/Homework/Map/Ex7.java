package com.sessions.session14.Homework.Map;

import java.util.HashMap;
import java.util.Map;

public class Ex7
{
    //10.Write a Java program to get the value of a specified key in a map.
    public static void main(String[] args)
    {
        Map<String ,Integer> map=new HashMap<>();
        map.put("cheie1",1);
        map.put("cheie2",2);
        map.put("cheie3",3);
        map.put("cheie4",4);
        System.out.println("The value of a specified key in a map:"+map.get("cheie3"));
    }
}
