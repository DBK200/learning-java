package com.sessions.session17.challenges;

import java.util.ArrayList;
import java.util.List;

public interface Challenge1 {
    
    boolean test(int number);
}

class EvenNum{
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        List<Integer> evenNumbers = filterList(numbers, number -> number % 2 == 0);

        System.out.println(evenNumbers);

    }
    public static List<Integer> filterList(List<Integer> list, Challenge1 evenNum){
        List<Integer> result = new ArrayList<>();
        for (Integer item : list){
            if (evenNum.test(item)){
                result.add(item);
            }
        }
        return result;
    }

}
