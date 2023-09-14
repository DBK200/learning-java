package com.sessions.session18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx
{
    public static void main(String[] args)
    {
        //filtering

        List<Integer> numbers = Arrays.asList(2, 4, 3, 1, 2, 5, 8, 14);

        List<Integer> resultList=numbers.stream().filter(n -> n % 2 == 0).toList();
        //filter primeste un predicat
        System.out.println(resultList);
        System.out.println(numbers);

        //mapping-accepta un function

        List<String> words=Arrays.asList("hello","how","are","you");
        //String->Integer
        List<Integer> lengthSet=words.stream().map(x->x.length()).distinct().collect(Collectors.toList());
        System.out.println(words);
        System.out.println(lengthSet);
       List<String> sortedList= words.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        words.stream().forEach(x-> System.out.println(x));

        List<String> stringList=List.of("abc","ksdkfns","ajd3");
        List<String> upperCase=stringList.stream().map(string->string.toUpperCase()).sorted().toList();
        System.out.println(upperCase);
    }
}
