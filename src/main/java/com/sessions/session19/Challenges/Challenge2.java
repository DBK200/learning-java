package com.sessions.session19.Challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Challenge2 {
    public static void main(String[] args) {

        //Exercițiul 2: Găsirea maximului - Scrieți o metodă care primește un array de numere
        // întregi și returnează un Optional care conține valoarea maximă
        // din array, sau un Optional gol dacă array-ul este gol.

        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Optional<Integer> maxValue = numList.stream().max(Integer::compareTo);
        if (maxValue.isPresent()){
            System.out.println(maxValue.get());
        }else {
            System.out.println("the list is empty");
        }


    }
}
