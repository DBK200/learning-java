package com.sessions.session17.challenge;

import java.util.ArrayList;
import java.util.List;

public class LambdaChallenge {
    public static void main(String[] args) {

/*
        1.  Write a program that uses lambda expressions to filter
            a list of integers and return only the even numbers.
*/

/**********************************************************************
        // This implementation will throw an exception when
        // the input parameter is an immutable list passed
        // by a List.of() call, thus was discarded.
        Filter filter = list -> {
            for (int i = 0; i < list.size();) {
                if (list.get(i).longValue() % 2 == 0) list.remove(i);
                else i++;
            };
            return list;
        };
*************************************************************************/

        Filter filter = list -> {
            List<Number> lResult = new ArrayList<>();
            for (Number e: list) {
                if (e.doubleValue() - e.longValue() == 0
                        && e.longValue() % 2 == 0) lResult.add(e);
            };
            return lResult;
        };


        //List<Integer> alList1 = List.of(10, 11, 12, 15, 33, 34);
        List<Float> alList1 = List.of(10.0f, 11f, 12.55f, 15.2f, 33f, 34.2f);
        System.out.println(filter.even(alList1));

        // Using streams(): filter()
        List alList0 = alList1.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(alList0);


/*
        2.  Write a program that uses lambda expressions
            to sort a list of strings in alphabetical order.
*/
        List<String> alList2 = new ArrayList<>(List.of("First string", "Second string",
                "Third string", "Extra string", "I'm lonely!"));
        System.out.println("Unsorted list: " + alList2);
        alList2.sort((s1,s2) -> s1.compareToIgnoreCase(s2));
        //alList2.sort(String::compareToIgnoreCase);
        System.out.println("Ascending sorted list: " + alList2);
        alList2.sort((s1,s2) -> -s1.compareToIgnoreCase(s2));
        System.out.println("Descending sorted list: " + alList2);

/*
        3.  Write a program that uses lambda expressions to calculate
            the sum of all the elements in a list of integers.
*/
        List<Integer> lValues = List.of(10, 11, 12, 15, 33, 34);
        System.out.println("List of integers to be summed up: " + lValues);

        // Using streams(): mapToInt()
        Integer iSum = lValues.stream().mapToInt(Integer::intValue).sum();
        System.out.println("\t- Using streams().mapToInt(): " + iSum);

        // Using streams(): reduce()
        // In this case we're going to add up values over previous iSum value.
        // If a fresh start is wanted, 0 should be passed instead of iSum.
        iSum = lValues.stream().reduce(iSum, Integer::sum);
        System.out.println("\t- Using streams().reduce(), added up on top of previous sum: " + iSum);

        // Using custom functional interface
        MathFunc func = list -> {
            Number nrResult = 0;
            for(Number e: list) {
                nrResult = nrResult.doubleValue() + e.doubleValue();
            };
            return nrResult;
        };
        System.out.println("\t- Using custom functional interface: " + func.sum(lValues).longValue());
    }

}

/*
    1.  Write a program that uses lambda expressions to filter
        a list of integers and return only the even numbers.
*/
@FunctionalInterface
interface Filter {
    List<? extends Number> even(List<? extends Number> list);
}

/*
    3.  Write a program that uses lambda expressions to calculate
        the sum of all the elements in a list of integers.
*/
@FunctionalInterface
interface MathFunc {
    Number sum(List<? extends Number> list);
}
