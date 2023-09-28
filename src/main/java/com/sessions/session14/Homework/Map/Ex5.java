package com.sessions.session14.Homework.Map;

import java.util.HashMap;
import java.util.Map;

public class Ex5
{
    //7.Write a Java program to test if a map contains a mapping for the specified key.
    public static void main(String[] args)
    {
        Map<String ,Integer> map=new HashMap<>();
        map.put("cheie1",1);
        map.put("cheie2",2);
        map.put("cheie3",3);
        map.put("cheie4",4);
        map.put("cheie5",5);
        if(map.containsKey("cheie1"))
        {
            System.out.println("Cheia 'cheie1' a fost găsită în mapare.");
        }
        else
        {
            System.out.println("Cheia 'cheie1' nu a fost găsită în mapare.");
        }
    }
}
