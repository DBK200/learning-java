package com.sessions.session19.Homework;

import java.util.Optional;

public class Ex4Suma
{
   // Exercițiul 4: Suma numerelor întregi - Scrieți o metodă care primește două valori de tip Optional
    // și calculează suma lor dacă ambele valori sunt prezente, returnând un Optional care conține rezultatul.
    // Dacă una dintre valorile este absentă, returnează un Optional gol.
   public static void main(String[] args)
   {
       Integer a=2;
       Integer b=3;
       Optional<Integer> result=sum(a,b);

       if(result.isPresent())
       {
           System.out.println("Suma este:" +result.get());
       }
       else
       {
           System.out.println("Optional gol");
       }

   }

   //am facut o metoda pt a face suma a doua valori de tip Optional
   public static Optional<Integer> sum(Integer x,Integer y)
   {
        Integer suma=x+y;

       if(x==null||y==null)
       {
            return Optional.empty();
       }
       else
       {
           return Optional.of(suma);
       }
   }

}
