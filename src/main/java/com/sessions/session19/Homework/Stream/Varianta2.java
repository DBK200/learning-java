package com.sessions.session19.Homework.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Varianta2
{
    //Inca un exercitiu pentru streams (recomand sa incercati sa il faceti in cel putin 2 moduri,
    // unul in care sa folositi streams si unul in care sa nu folositi streams):
    // Find and Optional Given a list of integers, find the first even number greater than 5 and print it.
    public static void main(String[] args)
    {
        //creeam o lista
        List<Integer> numbers=Arrays.asList(2,4,31,12,4,6,5,34,56,9);
        //apelam metoda "theFirstEvenNumberGreaterThan5" unde ii atribuim lista de mai sus numbers,
        // si o stocam in result
        Optional<Integer> result=theFirstEvenNumberGreaterThan5((List<Integer>) numbers);
        //verificam daca result contine o valoare
        if(result.isPresent())
        {
            //daca da, printam cel mai mare nr par mai mare ca 5
            System.out.println("Cel mai mare nr par ca 5 este "+result.get());
        }
        else
        {
            //daca nu ,printam Optional gol
            System.out.println("Optional gol");
        }


    }
    //facem o metoda care primeste o lista si cu ajutorul unui for verificam fiecare nr din lista daca este par si mai mare ca 5
    //in caz ca lista este goala returnam un Optional gol
    public static Optional<Integer> theFirstEvenNumberGreaterThan5(List<Integer> list)
    {
        for(Integer nr:list)
        {
            if(nr%2==0 &&nr>5)
            {
                return Optional.of(nr);
            }
        }
        return Optional.empty();
    }
}
