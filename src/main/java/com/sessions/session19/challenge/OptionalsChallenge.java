package com.sessions.session19.challenge;

import java.util.Arrays;
import java.util.Optional;

public class OptionalsChallenge {
    public static void main(String[] args) {

        // Challenge 1  (Verificarea valorii nule):
        //   Scrieți o metodă care primește un parametru de tip String și returnează un Optional
        //   ce conține valoarea în majuscule a parametrului, dacă acesta nu este null,
        //   sau un Optional gol în caz contrar.
        printOptional(null, getUpperCaseString(null));
        printOptional("parameter", getUpperCaseString("parameter"));


        // Challenge 2 (Găsirea maximului)
        //   Scrieți o metodă care primește un array de numere întregi și returnează un Optional
        //   ce conține valoarea maximă din array, sau un Optional gol dacă array-ul este gol.
        Integer[] array = {-1,2,9,-44,2,-41,51};
        //array = null;
        printOptional((array != null) ? Arrays.toString(array) : array,
                getMaxArrayElement(array));


        // Challenge 3 (Parsarea unui număr întreg)
        //   Scrieți o metodă care primește un String și încearcă să îl parseze într-un număr întreg (Integer).
        //   Dacă parsarea este reușită, returnează un Optional care conține valoarea parsată;
        //   în caz contrar, returnează un Optional gol.
        String sValue = "--123456";
        sValue = "+00123";
        printOptional(sValue, strToInt(sValue));


        // Challenge 4 (Suma numerelor întregi)
        //   Scrieți o metodă care primește două valori de tip Optional și calculează suma lor
        //   dacă ambele valori sunt prezente, returnând un Optional care conține rezultatul.
        //   Dacă una dintre valorile este absentă, returnează un Optional gol.
        Optional<Integer> op1 = Optional.ofNullable(25);
        Optional<Integer> op2 = Optional.ofNullable(null);
        printOptional(getValue(op1) + ", " + getValue(op2),
                getSum(op1, op2));


    }

    private static <T> String getValue(Optional<T> optional){
        return (optional.isPresent()) ? String.valueOf(optional.get()) : "Empty Optional";
    }

    private static <T,U> void printOptional(T argument, Optional<U> method){
        System.out.printf("Optional value for input parameter [%s]: %s%n",
                argument, getValue(method));
    }

    private static Optional<String> getUpperCaseString(String value) {
        return Optional.ofNullable(value).isPresent()
                ? Optional.of(value.toUpperCase()) : Optional.empty();
    }

    private static Optional<Integer> getMaxArrayElement(Integer[] array) {
        return Optional.ofNullable(array).isPresent()
                ? Optional.of(Arrays.stream(array).distinct().max(Integer::compareTo).get())
                : Optional.empty();
    }

    private static Optional<Integer> strToInt(String value) {
        try{
            return Optional.of(Integer.parseInt(value));
        }
        catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    private static Optional<Integer> getSum(Optional<Integer> op1, Optional<Integer> op2){
        return (op1.isPresent() && op2.isPresent())
                ? Optional.of(op1.get() + op2.get())
                : Optional.empty();
    }

}
