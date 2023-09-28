package com.sessions.session14.Homework.Map;

import java.util.HashMap;
import java.util.Map;

public class Ex1
{
      //.Write a Java program to count the number of key-value (size) mappings in a map.
      public static void main(String[] args)
      {
          //creeam map
          Map<String ,Integer> map=new HashMap<>();
          //adaugam chei
          map.put("cheie1",1);
          map.put("cheie2",2);
          map.put("cheie3",3);
          map.put("cheie4",4);
          map.put("cheie5",5);
          int size=map.size();
          System.out.println("Size:"+size);

      }
}
