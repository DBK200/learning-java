package com.sessions.session14.Homework.Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Ex9
{
    //12.Write a Java program to get a collection view of the values contained in this map
    public static void main(String[] args)
    { Map<String ,Integer> map=new HashMap<>();
        map.put("cheie1",1);
        map.put("cheie2",2);
        map.put("cheie3",3);
        map.put("cheie4",4);
        Collection<Integer> valori=map.values();
        System.out.println("Valori:"+valori);


    }

}
