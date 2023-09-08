package com.sessions.session17;

import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
public interface MySupplier {
    // Functional interfaces

    // The supplier - an operation that takes no input argument and returns a result   - deci return type nu poate fi void si nici parametrii de intrare nu are

    String generateDescription();
}

class Practice{

    public static void main(String[] args) {
        // lambda function in locul implementarii clasice a functiei din interfata in clasa
        MySupplier mySupplier = () -> "anything";  // nu ia nimic ca input si returneaza un string
        System.out.println(mySupplier.generateDescription());

        List<String> myList = List.of("abcd", "abc", "a");
        System.out.println(myList);

        List<String> filteredList = myList.stream().filter(x -> x.length() < 2).collect(Collectors.toList());
        System.out.println(filteredList);
    }
}


