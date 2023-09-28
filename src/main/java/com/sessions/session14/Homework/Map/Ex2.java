package com.sessions.session14.Homework.Map;

import java.util.HashMap;
import java.util.Map;

public class Ex2
{
    //Write a Java program to copy all of the mappings from the specified map to another map.
    public static void main(String[] args)
    {
        Map<String ,Integer> map=new HashMap<>();
        map.put("cheie1",1);
        map.put("cheie2",2);
        map.put("cheie3",3);
        map.put("cheie4",4);
        map.put("cheie5",5);

        Map<String ,Integer> map2=new HashMap<>();
        map2.putAll(map);
        System.out.println("Map2:"+map2);

    }
}
