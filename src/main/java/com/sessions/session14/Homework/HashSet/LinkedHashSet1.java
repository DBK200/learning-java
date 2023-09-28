package com.sessions.session14.Homework.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet1
{
    //1.Write a Java program to append the specified element to the end of a hash set.
    public static void main(String[] args)
    {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("mere");
        set.add("pere");
        set.add("lapte");
        set.add("prune");
        System.out.println(set);
        set.add("cirese");
        System.out.println(set);
    }
}
