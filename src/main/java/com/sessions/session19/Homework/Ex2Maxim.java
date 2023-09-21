package com.sessions.session19.Homework;

import java.util.ArrayList;
import java.util.Optional;

public class Ex2Maxim
{
    //Exercițiul 2: Găsirea maximului - Scrieți o metodă care primește
    // un array de numere întregi și returnează un Optional care conține valoarea maximă
    // din array, sau un Optional gol dacă array-ul este gol.


    public static void main(String[] args)
        {
            ArrayList<Integer> numbers = new ArrayList<>();
            Optional<Integer> result = maxx(numbers);

            if (result.isPresent())
            {
                System.out.println(result.get()); // Afișăm valoarea maximă dacă Optional conține o valoare
            }
            else
            {
                System.out.println("Optionalul este gol");
            }
        }
    //creeam o metoda care primeste un ArrayList<Integer> si returneaza valoarea maxima din lista,in caz ca nr este null,in caz
    //contrar returneaza un Optional gol
    public static Optional<Integer> maxx(ArrayList<Integer> nr)
    {
        if (nr == null || nr.isEmpty())
        {
            return Optional.empty();
        }
        else
        {
            return Optional.of(nr.stream().max(Integer::compareTo).get());
        }
    }
}



