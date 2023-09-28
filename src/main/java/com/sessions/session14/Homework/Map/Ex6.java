package com.sessions.session14.Homework.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex6
{
    //9.Write a Java program to create a set view of the mappings contained in a map.
    public static void main(String[] args)
    {
        Map<String ,Integer> map=new HashMap<>();
        map.put("cheie1",1);
        map.put("cheie2",2);
        map.put("cheie3",3);
        map.put("cheie4",4);
        map.put("cheie5",5);
        Set<String> setChei = map.keySet();
        for (String cheie : setChei)
        {
            System.out.println("Cheie: " + cheie);
        }
    }
}
