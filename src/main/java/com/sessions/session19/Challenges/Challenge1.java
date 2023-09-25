package com.sessions.session19.Challenges;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Challenge1 {
    //Exercițiul 1: Verificarea valorii nule - Scrieți o metodă care primește un
    // parametru de tip String și returnează un Optional care conține valoarea în majuscule a parametrului,
    // dacă acesta nu este nul, sau un Optional gol în caz contrar.

    public static Optional<String> toUppercase(String x){
        return  Optional.ofNullable(x).map(String::toUpperCase);
    }
    public static void main(String[] args) {

        String x = "Apple";
        Optional<String> result = toUppercase(x);
        if(result.isPresent()) {
            System.out.println(result.get());
        }else {
            System.out.println("invalid");
        }

    }
}
