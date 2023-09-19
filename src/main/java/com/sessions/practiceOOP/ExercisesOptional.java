package com.sessions.practiceOOP;

import java.util.Arrays;
import java.util.Optional;

public class ExercisesOptional {


//    Exercițiul 1: Verificarea valorii nule Scrieți o metodă care primește un parametru de tip `String` și returnează un `Optional` care conține
//    valoarea în majuscule a parametrului, dacă acesta nu este nul, sau un `Optional` gol în caz contrar.

    public Optional<String> toUppercase(String str) {
        return Optional.ofNullable(str).map(String::toUpperCase);
    }

//    Exercițiul 2: Găsirea maximului Scrieți o metodă care primește un array de numere întregi și returnează un `Optional` care conține valoarea maximă din array,
//    sau un `Optional` gol dacă array-ul este gol.

    public Optional<Integer> findMax(int[] numbers) {
        if (numbers.length == 0) {
            return Optional.empty();
        }
        int max = Arrays.stream(numbers).max().getAsInt();
        return Optional.of(max);
    }

    //    Exercițiul 3: Parsarea unui număr întreg Scrieți o metodă care primește un `String` și încearcă să îl parseze într-un număr întreg (`Integer`).
    //    Dacă parsarea este reușită, returnează un `Optional` care conține valoarea parsată; în caz contrar, returnează un `Optional` gol.
    public Optional<Integer> parseInteger(String str) {
        try {
            int value = Integer.parseInt(str);
            return Optional.of(value);
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

//    Exercițiul 4: Suma numerelor întregi Scrieți o metodă care primește două valori de tip `Optional` și
//    calculează suma lor dacă ambele valori sunt prezente, returnând un `Optional` care conține rezultatul.
//    Dacă una dintre valorile este absentă, returnează un `Optional` gol.

    public Optional<Integer> sum(Optional<Integer> a, Optional<Integer> b) {
        if (a.isPresent() && b.isPresent()) {
            int sum = a.get() + b.get();
            return Optional.of(sum);
        } else {
            return Optional.empty();
        }
    }


}
