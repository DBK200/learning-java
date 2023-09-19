package com.sessions.session19.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {

        /* Exercițiul 1: Verificarea valorii nule - Scrieți o metodă care primește un parametru de tip String și
        returnează un Optional care conține valoarea în majuscule a parametrului, dacă acesta nu este nul, sau un
        Optional gol în caz contrar. */
        System.out.println("**** Exercitiul 1 ****");
        System.out.println(toUpperCase("alabala"));
        System.out.println(toUpperCase(""));
        System.out.println(toUpperCase(null));

        /* Exercițiul 2: Găsirea maximului - Scrieți o metodă care primește un array de numere întregi și returnează un
        Optional care conține valoarea maximă din array, sau un Optional gol dacă array-ul este gol. */
        System.out.println("**** Exercitiul 2 ****");
        System.out.println(maximumValue(new Integer[]{5, 63, -7, 0}));
        System.out.println(maximumValue(new Integer[]{}));
        System.out.println(maximumValue(null));

        /* Exercițiul 3: Parsarea unui număr întreg - Scrieți o metodă care primește un String și încearcă să îl parseze
        într-un număr întreg (Integer).
        Dacă parsarea este reușită, returnează un Optional care conține valoarea parsată; în caz contrar, returnează un
        Optional gol. */
        System.out.println("**** Exercitiul 3 ****");
        System.out.println(tryParse("5"));
        System.out.println(tryParse("a"));
        System.out.println(tryParse(""));
        System.out.println(tryParse(null));

         /* Exercițiul 4: Suma numerelor întregi - Scrieți o metodă care primește două valori de tip Optional și
         calculează suma lor dacă ambele valori sunt prezente, returnând un Optional care conține rezultatul. Dacă
         una dintre valorile este absentă, returnează un Optional gol. */
        System.out.println("**** Exercitiul 4 ****");
        System.out.println(getSum(Optional.of(2), Optional.of(3)));
        System.out.println(getSum(Optional.of(2), Optional.empty()));
        System.out.println(getSum(Optional.empty(), Optional.of(3)));
        System.out.println(getSum(Optional.empty(), Optional.empty()));

        /* Exercitiul 5: Given a list of integers, find the first even number greater than 5 and print it. */
        System.out.println("**** Exercitiul 5 ****");
        System.out.println(Stream.of(3, 7, 32, 56).filter(e -> e % 2 == 0).filter(e -> e > 5).toList().get(0));
        System.out.println(getFirstEvenGreaterThan5(new int[]{3, 7, 32, 56}));

    }
    public static Optional<String> toUpperCase(String input) {
        AtomicReference<Optional<String>> stringOptional = new AtomicReference<>(Optional.ofNullable(input));
        stringOptional.get().ifPresent(x ->  {
            stringOptional.set(Optional.of(x.toUpperCase()));});
        return stringOptional.get();
    }
    public static Optional<Integer> maximumValue(Integer[] list) {
        Optional<Integer[]> listOptional = Optional.ofNullable(list);
        if (listOptional.isPresent()) {
            return Arrays.stream(listOptional.get()).max(Comparator.naturalOrder());
        } else {
            return Optional.empty();
        }
    }
    public static Optional<Integer> tryParse (String value) {
        Optional<String> optionalValue = Optional.ofNullable(value);
        Optional<Integer> optionalInteger = Optional.empty();
        if (optionalValue.isPresent()) {
            try {
                optionalInteger =  Optional.of(Integer.parseInt(value));
            } catch (NumberFormatException exception) {
                System.out.println("Eroare: " + exception);
            }

        }
        return optionalInteger;
    }

    public static Optional<Integer> getSum(Optional<Integer> a, Optional<Integer> b) {
        Optional<Integer> sum = Optional.empty();
        if (a.isPresent() && b.isPresent()) {
            sum = Optional.of(a.get() + b.get());
        }
        return sum;
    }

    public static int getFirstEvenGreaterThan5 (int[] numbers) {
        int firstEven = 0;
        for (int number : numbers) {
            if (number % 2 == 0 && number > 5) {
                return number;
            }
        }
        return firstEven;
    }
}
