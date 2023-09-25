package com.sessions.session19.Challenges;

import java.util.Optional;

public class Challenge4 {
    //Exercițiul 4: Suma numerelor întregi - Scrieți o metodă care primește două valori de tip Optional
    // și calculează suma lor dacă ambele valori sunt prezente, returnând un Optional care conține rezultatul.
    // Dacă una dintre valorile este absentă, returnează un Optional gol.
    public static Optional<Integer> values(Optional<Integer> a, Optional<Integer> b){
        if (a.isPresent() && b.isPresent()){
            int sum = a.get() + b.get();
            return Optional.of(sum);
        }else {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {

        Optional<Integer> optional1 = Optional.of(10);
        Optional<Integer> optional2 = Optional.of(15);
        Optional<Integer> emptyOptional = Optional.empty();

        Optional<Integer> result1 = values(optional1, optional2);

        System.out.println(result1.get());





    }
}
