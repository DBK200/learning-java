package com.sessions.session17.Homework;

import java.util.ArrayList;
import java.util.List;

public class Ex3
{
    //3 Write a program that uses lambda expressions to calculate the sum of all the elements in a list of integers.
    public static void main(String[] args)
    {
        List<Integer> lista1 = new ArrayList<>(); // Crearea unei liste de numere întregi goale

        // Adăugarea unor numere întregi în lista "lista1"
        lista1.add(2);
        lista1.add(5);
        lista1.add(8);
        lista1.add(3);
        lista1.add(4);

        // Utilizarea unei expresii lambda pentru a calcula suma elementelor din lista
        Suma suma = lista -> { // Definirea unei instanțe a interfeței "Suma" cu o expresie lambda
            int sumaa = 0; //  Inițializarea unei variabile pentru a stoca suma
            for (int el : lista) { // Iterarea prin lista de numere întregi
                sumaa += el; //  Adunarea fiecărui element la suma existentă
            }
            return sumaa; //  Returnarea sumei
        };

        int rezultat = suma.sumaLista(lista1); //  Calcularea sumei apelând metoda "sumaLista" din instanța "suma"
        System.out.println("Suma este: " + rezultat); // Afișarea rezultatului în consolă
    }
}

// Interfața corectată cu o metodă care primește o listă de numere întregi și returnează un număr întreg
interface Suma
{
    int sumaLista(List<Integer> lista); // Declarația metodei "sumaLista" cu o listă de numere întregi ca argument și un număr întreg ca rezultat
}
