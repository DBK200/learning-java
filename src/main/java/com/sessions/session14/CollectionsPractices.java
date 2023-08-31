package com.sessions.session14;

import java.util.*;

public class CollectionsPractices {

    public static void main(String[] args) {
        //create a list with the grades of student

//        ArrayList<Integer> grades = new ArrayList<>();
//        grades.add(4);
//        grades.add(8);
//        grades.add(10);
//
//        System.out.println(grades);
//        System.out.println(grades.get(1));
//
//        grades.remove((Integer) 4);
//        System.out.println(grades);
//
//        for (int i = 0; i < grades.size(); i++){
//            System.out.println(grades.get(i));
//        }
//
//        for (Integer grade : grades){
//            System.out.println(grade);
//            grades.remove(0);
//        }


//        LinkedList<String> names = new LinkedList<>();
//        names.add("Mike");
//        names.add("John");
//        names.addFirst("Ion");
//        System.out.println(names);
//        names.offer("Alex");
//        names.offerFirst("Jax");
//        System.out.println(names);

//        Set<String> weekDays = new HashSet<>();
//        //sorting is not guaranteed
//        Set<String> weekDays = new TreeSet<>();
//        //sorting is done in a natural order(or by implementing Comparable).
//        Set<String> weekDays = new LinkedHashSet<>();
//        //sorting is according to the sequence of adding the elements
//        weekDays.add("Tuesday");
//        weekDays.add("Monday");
//        weekDays.add("Monday");
//        System.out.println(weekDays);

        HashMap<String, String> emailAddressesMap = new HashMap();
        emailAddressesMap.put("George", "george@yahoo.com");
        emailAddressesMap.put("Diana", "diana@yahoo.com");
        System.out.println(emailAddressesMap);
        System.out.println(emailAddressesMap.get("George"));
//        for (String key : emailAddressesMap.keySet()) {
//            System.out.println(emailAddressesMap.get(key));
//        }

        for (Map.Entry<String, String> entry : emailAddressesMap.entrySet()){
            System.out.println(entry.getKey()+ " has this adress: " + entry.getValue());
        }



    }
}
