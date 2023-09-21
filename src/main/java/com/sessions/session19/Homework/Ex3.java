package com.sessions.session19.Homework;

import java.util.Optional;

public class Ex3 {
    // Parsarea unui număr întreg - Scrieți o metodă care primește un String și încearcă să îl parseze într-un număr întreg (Integer).
    // Dacă parsarea este reușită, returnează un Optional care conține valoarea parsată; în caz contrar, returnează un Optional gol.
    public static void main(String[] args) {

        String number2 = "123";
        Optional<Integer> result = parse(number2);
        if(result.isPresent()){
            System.out.println(result.get());
        }else {
            System.out.println("Optional is empty");
        }

    }

    public static Optional<Integer> parse(String number) {
        try {
            int number1 = Integer.parseInt(number);
            return Optional.of(number1);
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

}
