package com.sessions.session19.Homework;

import java.util.Optional;

public class Ex4 {
    public static void main(String[] args) {
        //Suma numerelor întregi - Scrieți o metodă care primește două valori de tip Optional și calculează suma
        // lor dacă ambele valori sunt prezente, returnând un Optional care conține rezultatul.
        // Dacă una dintre valorile este absentă, returnează un Optional gol.

        Integer a = 4;
        Integer b = 7;
        Optional<Integer> result = sum(a , b);

        if(result.isPresent()){
            System.out.println(result.get());
        }else {
            System.out.println("Optional is empty");
        }

    }

    public static Optional<Integer> sum(Integer x, Integer y) {
        Integer sum1 = x + y;
        if (x == null || y == null) {
            return Optional.empty();
        } else {
            return Optional.of(sum1);
        }
    }
}
