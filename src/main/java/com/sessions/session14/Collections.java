package com.sessions.session14;

import java.util.*;

public class Collections
{
    public static void main(String[] args)
    {
        //liste-putem avea elemente duplicate
        //ArrayList

        //create a list with students grates
//        List<Integer> grades=new ArrayList<>();
//        grades.add(5);
//        grades.add(6);
//        grades.add(2);
//        grades.add(10);
//        System.out.println(grades);
//        System.out.println(grades.get(1));
//        grades.remove((Integer) 10);
//        System.out.println(grades);
//        for(int i=0;i<grades.size();i++)
//        {
//            System.out.println(grades.get(i));
//        }
//        for(Integer grade:grades)
//        {
//            System.out.println(grade);
//            grades.add(2);
//            grades.remove(0);
//        }
//


        //Linked List

        LinkedList<String> names=new LinkedList<>();
        names.add("Alex");
        names.add("John");
        System.out.println(names);
        names.addFirst("Mike");
        System.out.println(names);
        names.offer("Teo");
        System.out.println(names);
        names.offerFirst("Daniel");
        System.out.println(names);

        //Set-date care nu se repeta,se foloseste cand avem date unice

        //Set<String> weekDay=new HashSet<>();-Ordinea nu este garantata,il folosim cand nu
        //ne intereseaza ordinea

        //Set<String> weekDay=new TreeSet<>();//le face in ordinea alfabetica la String(or by implementing Comparable)
        //ordinea lor naturala la numere

        Set<String> weekDay=new LinkedHashSet<>();//-sortarea se face in ordinea in care a fost adaugate
        weekDay.add("Monday");
        weekDay.add("Tuesday");
        weekDay.add("Monday");
        System.out.println(weekDay);

        //Map
        LinkedHashMap<String, String> emailAddressesMap = new LinkedHashMap<>();
        emailAddressesMap.put("George", "george@yahoo.com");
        emailAddressesMap.put("Diana", "diana@yahoo.com");
        System.out.println(emailAddressesMap);
        System.out.println(emailAddressesMap.get("George"));
//        for (String cheie : emailAddressesMap.keySet()) {
//            System.out.println(emailAddressesMap.get(cheie));
//        }

        for (Map.Entry<String, String> entry : emailAddressesMap.entrySet())
        {
            System.out.println(entry.getKey() + " has this address: "
                    + entry.getValue());
        }






    }
}
