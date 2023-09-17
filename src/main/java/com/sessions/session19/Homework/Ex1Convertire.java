package com.sessions.session19.Homework;

import java.util.Optional;

public class Ex1Convertire
{
    //Exercițiul 1: Verificarea valorii nule - Scrieți o metodă care
    // primește un parametru de tip String și returnează un Optional care
    // conține valoarea în majuscule a parametrului, dacă acesta nu este nul, sau un Optional gol în caz contrar.

    public static void main(String[] args)
    {
        String nume=null;
        //apelam metoda convert
        Optional<String> result=convert(nume);
        //verificam daca result are o valoare
        if(result.isPresent())
        {
            System.out.println(result.get());
        }
        else
        {
            System.out.println("Optionalul e gol");
        }

    }
    //creeam o metoda care primeste un String si returneaza un Optional care contine valoarea in majuscule a parametrului /
    //daca este null ,returneaza un Optional gol
    public static Optional<String> convert(String name)
    {
        //verific daca String ul name este null
        if(name==null)
        {
           return Optional.empty();
        }
        else
        {
            //Transformam toate literele in litere mari ,daca String ul nu este null
            return Optional.of(name.toUpperCase());
        }
    }
}
