package com.sessions;

//import java.time.LocalDate;

import java.time.*;
import java.util.List;
import java.util.stream.Collectors;

public class MyApplication{

    public static void main(String[] args) {
        MyApplication myApplication = new MyApplication();
        myApplication.toString();

        LocalDate localDate = LocalDate.now();

        List<String> myList = List.of("abcd", "abc", "a");
        System.out.println(myList);
        List<String> filteredList = myList.stream().filter(x -> x.length() < 2).collect(Collectors.toList());
        System.out.println(filteredList);
    }

}
