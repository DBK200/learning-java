package com.sessions.session17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsMethods {

    private <T extends List<String>> String getDetails(T item){
        return item.toString();
    }

    public static void main(String[] args) {
        GenericsMethods genericsMethods = new GenericsMethods();
        System.out.println(genericsMethods.getDetails(List.of("a","b","c")));

        List<String> linkedList = new LinkedList<>();
        linkedList.add("d");
        linkedList.add("e");
        linkedList.add("f");
        String result = genericsMethods.getDetails(linkedList);
        System.out.println(result);
    }



}
