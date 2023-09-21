package com.sessions.session19.Homework;


import java.util.ArrayList;
import java.util.Optional;

public class Ex2 {
    public static void main(String[] args) {
        //Scrieți o metodă care primește un array de
        // numere întregi și returnează un Optional care conține valoarea maximă din array, sau un Optional gol dacă array-ul este gol.

        ArrayList<Integer> numbers = new ArrayList<>();
        Optional<Integer> result = numereintregi(numbers);
        if(result.isPresent()){
            System.out.println(result.get());
        }else{
            System.out.println("Optional is empty");
        }

}
public static Optional<Integer> numereintregi (ArrayList<Integer> number){
        if(number == null || number.isEmpty()){
            return Optional.empty();
        }else{
            return Optional.of(number.stream().max(Integer::compareTo).get());
        }
}
}

