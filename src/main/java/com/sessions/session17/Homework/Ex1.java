package com.sessions.session17.Homework;

import java.util.ArrayList;
import java.util.List;

public class Ex1
{
    // Write a program that uses lambda expressions to filter a list of integers and return only the even numbers.
    public static void main(String[] args)
    {
        // Crearea unei liste de numere întregi
        List<Integer> numar = new ArrayList<>();
        numar.add(2);
        numar.add(5);
        numar.add(8);
        numar.add(3);
        numar.add(4);

        // Definirea unei instanțe a interfeței funcționale Exercitiu1 utilizând o expresie lambda
        Exercitiu1 lista1 = lista2 -> {
            List<Integer> lista = new ArrayList<>();
            // Iterarea prin lista de numere pentru a filtra numerele pare
            for (int el : lista2)
            {
                if (el % 2 == 0)
                {
                    lista.add(el); // Adaugarea numerelor pare în lista rezultată
                }
            }
            return lista; // Returnarea listei cu numere pare
        };

        // Apelarea metodei isEven a interfeței funcționale pentru a obține numerele pare
        List<Integer> numerePare = lista1.isEven(numar);

        // Afișarea rezultatului
        System.out.println("Numere pare: " + numerePare);
    }
}

// Interfața funcțională cu o singură metodă 'isEven' care primește o listă de numere întregi și returnează o listă cu numerele pare
interface Exercitiu1
{
    List<Integer> isEven(List<Integer> nr);
}

