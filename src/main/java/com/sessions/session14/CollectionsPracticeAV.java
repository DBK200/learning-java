package com.sessions.session14;

import java.util.*;

public class CollectionsPracticeAV {
    public static void main(String[] args) {

        //create a list with the grades of students
//        List<Integer> grades = new ArrayList<>();
//        grades.add(5);
//        grades.add(10);
//        grades.add(6);
//
//        System.out.println(grades);
//        System.out.println(grades.get(1));
//
//        System.out.println(grades.remove((Integer)10));
//        System.out.println(grades);
//
//        for(int i = 0; i < grades.size(); i++) {
//            System.out.println(grades.get(i));
//        }
//
//        for (Integer grade: grades) {
//            System.out.println(grade);
//        }

//        LinkedList<String> names = new LinkedList<>();
//        names.add("Jhon");
//        names.add("Alex");
//        names.addFirst("Mike");
//        System.out.println(names);
//
//        names.offer("Teo");
//        System.out.println(names);
//
//        names.offerFirst("Daniel");
//        System.out.println(names);

//        Set<String> weekDays = new HashSet<>();
        //sorted id not guaranteed
//        Set<String> weekDays = new TreeSet<>();
        //sorting is done in "natural" order (or by implementing Comparable)
//        Set<String> weekDays = new LinkedHashSet<>();
//        weekDays.add("Tuesday");
//        weekDays.add("Monday");
//        weekDays.add("Monday");
//        System.out.println(weekDays);

//        HashMap<String, String> emailAddressesMap = new HashMap<>();
//        emailAddressesMap.put("George", "george@yahoo.com");
//        emailAddressesMap.put("Diana", "diana@yahoo.com");
//        System.out.println(emailAddressesMap);
//        System.out.println(emailAddressesMap.get("George"));

//        for(String cheie: emailAddressesMap.keySet()) {
//            System.out.println(emailAddressesMap.get(cheie));
//        }
//
//        for(String value: emailAddressesMap.values()) {
//            System.out.println(value);
//        }
//
//        for(Map.Entry entry: emailAddressesMap.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }

        HashMap<String, Integer> products = new HashMap<>();
        products.put("shampoo", 15);
        products.put("soap", 5);
        products.put("conditioner", 20);
        products.put("domestos", 19);

        System.out.println(products);
        System.out.println(products.get("soap"));

        products.put("soap", 10);
        System.out.println(products.get("soap"));

    }
}
