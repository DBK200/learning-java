package com.sessions.session14.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Collections {

    public static void main(String[] args) {

// ### Lists ###
//        // Grades list
//        List<Integer> grades = new ArrayList<>();
//        ArrayList<Integer> grades = new ArrayList<>();
//        grades.add(5);
//        grades.add(10);
//        grades.add(8);
//        // If casting is not used,
//        // remove(int) is used instead of
//        // remove(Object)
//        grades.remove((Integer)5);
//        // It works, but returns false
//        System.out.println("Trying to remove element 10.1: " + grades.remove(10.1));
//
//        // Prints out all elements using For loop
//        for (int i = 0; i < grades.size(); i++) {
//            System.out.println(i + ": " + grades.get(i));
//        }
//
//        // Prints out all elements using ForEach loop
//        for (Integer grade: grades) {
//            System.out.println(grade);
//        }

//// ### LinkedList ###
////        List<String> names = new LinkedList<>();
//        LinkedList<String> names = new LinkedList<>();
////        Deque<String> names = new LinkedList<>();
////        names.add("Name01");
////        names.add("Name02");
//        names.addFirst("Name03");
//        System.out.println(names);
//
//        // Identical to add()
//        names.offer("Name04");
//        System.out.println(names);
//
//        // Identical to addFirst()
//        names.offerFirst("Name05");
//        System.out.println(names);

//// ### Sets ###
//// No duplicates
//
//        // Sorting is not guaranteed
//        Set<String> weekDays = new HashSet<>();
//
//        // Sorting in natural order is guaranteed
//        // (or by implementing a Comparable)
////        Set<String> weekDays = new TreeSet<>();
//
//        // Sorting is according to input order
////        Set<String> weekDays = new LinkedHashSet<>();
//
//        weekDays.add("Tuesday");
//        weekDays.add("Monday");
//        weekDays.add("Monday");
//        weekDays.add("Friday");
//
//        System.out.println(weekDays);

// ### Maps ###
//        HashMap<String,String> emailAddressesMap = new HashMap();
        LinkedHashMap<String,String> emailAddressesMap = new LinkedHashMap();
        emailAddressesMap.put("Name01", "name01@yahoo.com");
        emailAddressesMap.put("Name02", "name02@yahoo.com");
        System.out.println(emailAddressesMap);
        System.out.println(emailAddressesMap.get("Name01"));
        // If it doesn't exist, returns NULL
        System.out.println(emailAddressesMap.get("Name0"));

        // Returns a complete set of keys
        System.out.println(emailAddressesMap.keySet());

        // keySet() returns a complete set of keys
        for (String key: emailAddressesMap.keySet()) {
            System.out.println("Name: " + emailAddressesMap.get(key));
        }

        // Returns a complete set of values
        System.out.println(emailAddressesMap.values());
        // values() returns a complete set of values
        for (String val: emailAddressesMap.values()) {
            System.out.println("email: " + val);
        }

        // entrySet() returns a complete set of entries
        for (Map.Entry<String, String> set: emailAddressesMap.entrySet()) {
            System.out.println(set.getKey() + " has email address "
                    + set.getValue());
        }

    }
}
