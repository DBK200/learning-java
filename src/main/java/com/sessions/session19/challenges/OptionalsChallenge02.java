package com.sessions.session19.challenges;

import java.util.*;

/**
 *   <h1>Challenge 2 (Găsirea maximului)</h1>
 *   Scrieți o metodă care primește un array de numere întregi și returnează un {@code Optional}
 *   ce conține valoarea maximă din array, sau un {@code Optional} gol dacă array-ul este gol.
 **/

public class OptionalsChallenge02 {
    public static void main(String[] args) {

        Integer[] array = {-1,2,9,-44,2,-41,51};
        array = null;
        Utils.out.printOptional("Maximum value in array %s is: %s",
                array, getMaxArrayElement(array));
    }

    private static Optional<Integer> getMaxArrayElement(Integer[] array) {
        return Optional.ofNullable(array).isPresent()
                ? Arrays.stream(array).distinct().max(Integer::compareTo)
                : Optional.empty();
    }
}
