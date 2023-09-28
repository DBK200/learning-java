package com.sessions.session14.Homework.Map;

import java.util.HashMap;
import java.util.Map;

public class Ex4
{
    //Write a Java program to check whether a map contains key-value mappings (empty) or not.
    public static void main(String[] args)
    {
        Map<String ,Integer> map=new HashMap<>();
        map.put("cheie1",1);
        map.put("cheie2",2);
        map.put("cheie3",3);
        map.put("cheie4",4);
        map.put("cheie5",5);
        if(map.isEmpty())
        {
            System.out.println("The map is empty");
        }
        else
        {
            System.out.println("The map is not empty");
        }
    }
}
