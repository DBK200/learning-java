package com.sessions.session19.Homework;

import java.util.Optional;

public class Ex3Parsare
{
    // Exercițiul 3: Parsarea unui număr întreg - Scrieți o metodă care primește un String
    // și încearcă să îl parseze într-un număr întreg (Integer).
    // Dacă parsarea este reușită, returnează un Optional care conține valoarea parsată;
    // în caz contrar, returnează un Optional gol.

    public static void main(String[] args)
    {
        String sir = "123";
        //apelam metoda parsare cu sirul de mai sus "sir" si in stocam in Optionalul "result"
        Optional<Integer> result = parsare(sir);
        if (result.isPresent())
        {
            System.out.println("Nr parsat:" + result.get());
        } else
        {
            System.out.println("Optional gol");
        }
    }

    // Metoda "parsare" primește un șir de caractere "x".
    public static Optional<Integer> parsare(String x)
    {
        try {
            // Se încearcă parsarea șirului de caractere "x" într-un număr întreg "numar".
            int numar = Integer.parseInt(x);

            // Dacă parsarea reușește, se returnează un Optional care conține valoarea parsată.
            return Optional.of(numar);
        } catch (NumberFormatException e)
        {
            // Dacă parsarea eșuează , se returnează un Optional gol.
            return Optional.empty();
        }
    }
}
