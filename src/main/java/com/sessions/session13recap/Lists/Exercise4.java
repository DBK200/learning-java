package com.sessions.session13recap.Lists;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise4 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(-7);
        list.add(1);
        list.add(10);
        list.add(7);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
