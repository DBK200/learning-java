package com.sessions.session19.Challenges;

import java.util.List;
import java.util.Optional;

public class Challenge5 {
    public static void main(String[] args) {

        // Find and Optional Given a list of integers,
        // find the first even number greater than 5 and print it.


        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //1'st method
        for (int number : intList) {
            if (number > 5 && number % 2 == 0){
                System.out.println("primul numar par mai mare decat 5 este: " + number);
                break;
            }
        }

        //2 method
        Optional<Integer> integerOptional = intList.stream()
                .filter(number -> number > 5 && number % 2 ==0)
                .findFirst();

        if (integerOptional.isPresent()){
            System.out.println(integerOptional.get());
        }else {
            System.out.println("no number");
        }
    }

}
