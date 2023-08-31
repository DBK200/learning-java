package com.sessions.session14.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Black");
        list.add("Green");
        list.add("Magenta");

        for (String s : list) {
            System.out.println(s);
        }

        list.add(0, "Pink");

        System.out.println(list.get(1));

        list.set(1, "White");

        System.out.println(list);

        list.remove(2);

        System.out.println(list.contains("Pink"));

        Collections.sort(list);
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2 = list;

        System.out.println(list2);

        Collections.shuffle(list2);

        System.out.println(list2);

        Collections.reverse(list2);

        System.out.println(list2);

        List<String> subList = list2.subList(0, 2);
        System.out.println(subList);

        System.out.println(compareLists(list, list2));

        Collections.swap(list2, 0, 2);

        System.out.println(list2);

        ArrayList<String> joinedList = new ArrayList<>(list);
        joinedList.addAll(list2);

        System.out.println(joinedList);

        ArrayList<String> clonedList = new ArrayList<>(list);
        System.out.println(clonedList);

        clonedList.removeAll(clonedList);

        System.out.println(clonedList);

        System.out.println(clonedList.isEmpty());

        list2.trimToSize();
        System.out.println(list2);

        int newSize = 7;
        for (int i = list2.size(); i < newSize; i++) {
            list2.add("New Color " + (i + 1));
        }

        System.out.println("ArrayList after increasing size: " + list2);
    }



    public static String compareLists(ArrayList<?> list1, ArrayList<?> list2) {
        if (list1.size() > list2.size()) {
            return list1 + " is larger than " + list2;
        }
        if (list2.size() > list1.size()) {
            return list2 + " is larger than " + list1;
        }
        if (list1.size() == list2.size()) {
            return list1 + " is equal to " + list2;
        }
        return null;
    }

}
