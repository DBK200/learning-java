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

        //apelam metoda " sum " atribuindu i cele doua nr de mai sus si le stocam intr un Optional "resul"

       Optional<Integer> result=sum(a,b);

       //verificam daca result contine o valoare

       if(result.isPresent())
       {
           //cele doua nr nu sunt nulle si afisam suma
           System.out.println("Suma este:" +result.get());
       }
       else
       {
           //inseamna ca cele doua nr sunt nulle si afisam un optional gol
           System.out.println("Optional gol");
       }

   }

   //am facut o metoda pt a face suma a doua valori de tip Optional
   public static Optional<Integer> sum(Integer x,Integer y)
   {
        Integer suma=x+y;
        //verificam daca optionalele sunt nulle
       if(x==null||y==null)
       {
           //daca da returnam un optional gol
            return Optional.empty();
       }
       else
       {
           //daca nu sunt nulle returnam suma
           return Optional.of(suma);
       }
   }

}
