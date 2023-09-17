package com.sessions.session19.Homework.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Varianta1
{
    //Varianta cu stream

    // Find and Optional Given a list of integers, find the first even number greater than 5 and print it.
    public static void main(String[] args)
    {
        // Crearea unei liste de numere întregi
        List<Integer> list= Arrays.asList(2,13,8,23,21,11,7,20);

        // Utilizarea stream-ului pentru a procesa lista
        Optional<Integer> result=list.stream()
                                     .filter(x->x%2==0 && x>5)// Filtrarea pentru numerele pare și mai mari decât 5
                                     .findFirst(); // Găsirea primului astfel de număr

        // Verificarea dacă s-a găsit un rezultat
        if(result.isPresent())
        {
            // Afișarea rezultatului găsit
            System.out.println("Cel mai mare nr par ca 5 este "+result.get());
        }
        else
        {
            // Afișarea unui mesaj în cazul în care nu s-a găsit niciun rezultat
            System.out.println("Optional gol");
        }
    }
}
