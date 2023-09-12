package com.sessions.session17.challenges;

import java.util.ArrayList;
import java.util.List;

public interface Challenge3<T> {
    Integer calculateSum(List<Integer> list);
}

class Test {
    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);
        numList.add(6);
        numList.add(7);
        numList.add(8);
        numList.add(9);

        Challenge3<Integer> sumList = list -> {
            int sum = 0;
            for (int number: list){
                sum += number;
            }
            return sum;
        };
        int sum = sumList.calculateSum(numList);
        System.out.println(sum);
    }
}
