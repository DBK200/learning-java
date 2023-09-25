package com.sessions.session19.Challenges;

import java.util.Optional;

public class Challenge3 {
    //Exercițiul 3: Parsarea unui număr întreg - Scrieți o metodă care primește un String și
    // încearcă să îl parseze într-un număr întreg (Integer).
    // Dacă parsarea este reușită, returnează un Optional care conține valoarea parsată;
    // în caz contrar, returnează un Optional gol.


    public static void main(String[] args) {

        String input1 = "434343";
        String input2 = "assa";

        Optional<Integer> a = tryParse(input1);
        Optional<Integer> b = tryParse(input2);

        a.ifPresent(x-> System.out.println(a));
        b.ifPresent(y-> System.out.println(b));



    }
    public static Optional<Integer> tryParse(String a){
        try {
            int parsedValue = Integer.parseInt(a);
            return Optional.of(parsedValue);
        }catch (NumberFormatException e){
            return Optional.empty();
        }
    }

}
