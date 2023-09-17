package com.sessions.session18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Locale.filter;

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

        //mapping-accepta un function,transforma tipul de date de intrare intr un alt tip de date care sunt cele de iesire


        List<String> words=Arrays.asList("hello","how","are","you");

        //String->Integer

        List<Integer> lengthSet=words.stream().map(x->x.length()).distinct().collect(Collectors.toList());
        System.out.println(words);
        System.out.println(lengthSet);

        List<String> sortedList= words.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        words.stream().forEach(x-> System.out.println(x));
        words.stream().forEach(x->consumeString(x));



        List<String> stringList=List.of("abc","ksdkfns","ajd3");
        List<String> upperCase=stringList.stream().map(string->string.toUpperCase()).sorted().toList();
        System.out.println(upperCase);

        //Consummer-IN:objects...(String).....OUT :void
        //Suplier-IN: () OUT:objects(returneaza ceva)

        /*------------*/
        //Reduce

        List<Integer> numbers1=Arrays.asList(1,2,2,3,3,4,5,6);
        Integer result=numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println("Result:"+result);
        System.out.println(words.stream()
                                .reduce((s1,s2)->s1+s2));//or.Else("");

        //count-calculeaza nr de elemente

        long result1 = numbers1.stream()
                              .distinct()     // Elimină duplicatele: 1, 2, 3, 4, 5, 6
                              .filter(x -> x > 3) // Filtrează elementele mai mari decât 3: 4, 5, 6
                              .count();       // Numără elementele: 3

        System.out.println(result1);

        boolean isGreaterThan3=numbers1.stream()
                                       .anyMatch(x->x>3);

        System.out.println(isGreaterThan3);


        //Function:x -> y
        //Bifunction: x,y->z
    }
    private static void consumeString(String name)
    {
        System.out.println(name+"  altceva");
    }
}
