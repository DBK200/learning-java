package com.sessions.session19;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;
import java.util.*;

public class Homework19 {

//    Exercițiul 1: Verificarea valorii nule - Scrieți o metodă care primește un parametru de tip String și
//    returnează un Optional care conține valoarea în majuscule a parametrului, dacă acesta nu este nul, sau
//    un Optional gol în caz contrar.
    public static Optional<String> majuscule(String cuvant){
        if(cuvant!=null) {
            return Optional.of(cuvant.toUpperCase());
        }
        else {
            return Optional.empty();
        }
    }

//    Exercițiul 2: Găsirea maximului - Scrieți o metodă care primește un array de numere întregi și returnează
//    un Optional care conține valoarea maximă din array, sau un Optional gol dacă array-ul este gol.

    public static Optional<Integer> maxim(List<Integer> numere){

            return Optional.of(numere.stream().max((x1,x2)->x1.compareTo(x2))).orElse(Optional.empty());
    }

//    Exercițiul 3: Parsarea unui număr întreg - Scrieți o metodă care primește un String și încearcă să îl parseze
//        într-un număr întreg (Integer).
//    Dacă parsarea este reușită, returnează un Optional care conține valoarea parsată; în caz contrar, returnează
//    un Optional gol.

    public static Optional<Integer> parsare(String string){

        return Optional.of(Integer.parseInt(string));
    }

//    Exercițiul 4: Suma numerelor întregi - Scrieți o metodă care primește două valori de tip Optional și calculează suma
//    lor dacă ambele valori sunt prezente, returnând un Optional care conține rezultatul.  Dacă una dintre valorile este
//    absentă, returnează un Optional gol.

    public static Optional<Integer> suma(Optional<Integer> x,Optional<Integer> y){

        if(x.isPresent()&&y.isPresent())
            return Optional.of(x.get()+ y.get());
        else
            return Optional.empty();
    }


    public static void main(String[] args) {
//        Ex1
//        String cuvant="abcdef";
//        Optional<String> rezultat=majuscule(cuvant);
//        System.out.println(rezultat.get());

//        Ex2
//        List<Integer> nr=Arrays.asList(1,4,3,5,6,2,3);
//        Optional<Integer> nrMax=maxim(nr);
//        System.out.println(nrMax.get());

//        Ex3
//        String nr="12345";
//        Optional<Integer>nrParsat=parsare(nr);
//        System.out.println(nrParsat.get());

//        Ex4
//        Optional<Integer> x = Optional.of(2);
//        Optional<Integer> y = Optional.of(3);
//        System.out.println(suma(x,y));


    }
}
