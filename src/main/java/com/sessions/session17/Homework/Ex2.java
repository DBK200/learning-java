package com.sessions.session17.Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex2
{
    //2 Write a program that uses lambda expressions to sort a list of strings in alphabetical order.
    public static void main(String[] args)
    {
        List<String> listaFructe = new ArrayList<>();
        listaFructe.add("mere");
        listaFructe.add("pere");
        listaFructe.add("banane");
        listaFructe.add("prune");
        listaFructe.add("caise");
        listaFructe.add("visine");
        listaFructe.add("ciresi");

        // Utilizarea unei expresii lambda pentru a sorta lista de fructe
        Sortare sortare = lista -> {
            List<String> listaSortata = new ArrayList<>(listaFructe);
            Collections.sort(listaSortata); // Sortarea listei utilizând metoda Collections.sort
            return listaSortata;
        };

        List<String> listaSortata = sortare.sortare(listaFructe); // Apelarea metodei "sortare" pentru a obține lista sortată
        System.out.println("Lista sortata: " + listaSortata); // Afișarea listei sortate în consolă
    }
}

// Interfața cu o metodă "sortare" pentru a sorta o listă de șiruri de caractere
interface Sortare
{
    List<String> sortare(List<String> a);
}
