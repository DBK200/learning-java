package com.sessions.session14;

import java.util.*;

public class CollectionsPracticeM {

    public static void main(String[] args) {
        //create a List with the grades of a student
//        ArrayList<Integer> grades = new ArrayList<>();
//        grades.add(5);
//        grades.add(10);
//        grades.add(6);
//
//        System.out.println(grades);
//        System.out.println(grades.get(1));
//
//        grades.remove((Integer) 10);
//        System.out.println(grades);
//
//        for (int i = 0; i < grades.size(); i++) {
//            System.out.println(grades.get(i));
//        }
//        for (Integer grade : grades) {
//            System.out.println(grade);

//        LinkedList<String> names = new LinkedList<>();
//        names.add("John");
//        names.add("Alex");
//        names.addFirst("Mike");
//        System.out.println(names);
//        names.offer("Teo");
//        System.out.println(names);
//        names.offerFirst("Daniel");
//        System.out.println(names);

//         Set<String> weekDays = new HashSet<>();
        // sorting is not guaranteed
//        Set<String> weekDays = new TreeSet<>();
        //sorting is done in "natural" order (or by implementing Comparable)
//        Set<String> weekDays = new LinkedHashSet<>();
//        //sorting is according to the sequence of adding the elements
//        weekDays.add("Tuesday");
//        weekDays.add("Monday");
//        weekDays.add("Monday");
//        System.out.println(weekDays);

        HashMap<String, String> emailAdressesMap = new HashMap();
        emailAdressesMap.put("George", "george@yahoo.com");
        emailAdressesMap.put("Diana", "diana@yahoo.com");
        System.out.println(emailAdressesMap);
        System.out.println(emailAdressesMap.get("George"));
//        for (String cheie : emailAdressesMap.keySet()) {
//            System.out.println(emailAdressesMap.get(cheie));
//        }

        for (Map.Entry<String, String> entry : emailAdressesMap.entrySet()) {

            System.out.println(entry.getKey() + " has this address: "+ entry.getValue());
        }

    }

}

