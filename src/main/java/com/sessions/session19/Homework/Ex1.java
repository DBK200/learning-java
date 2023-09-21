package com.sessions.session19.Homework;

import java.util.Optional;

public class Ex1 {
    public static void main(String[] args) {
        //Verificarea valorii nule - Scrieți o metodă care primește un parametru de tip String și
        // returnează un Optional care conține valoarea în majuscule a parametrului, dacă acesta nu este nul, sau un Optional gol în caz contrar.


        String nume = null;
        Optional<String> result = param(nume);
        if(result.isPresent()){
            System.out.println(result.get());
        }else{
            System.out.println("Optional is empty");
        }
    }
    public static Optional<String> param (String name){
        if(name == null){
            return Optional.empty();
        }else{
            return Optional.of(name);
        }
    }
}


