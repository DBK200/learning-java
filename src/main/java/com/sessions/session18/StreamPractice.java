package com.sessions.session18;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {
        //filtering
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

//        List<Integer> resultedList= numbers.stream().filter(n->n%2==0).toList();
//        System.out.println(resultedList);
//        System.out.println(numbers);

        //mapping
        List<String> words=Arrays.asList("hello","world","how","are","you");

        //String ->Integer
//        List<Integer> lengthSet= words.stream().map(x->x.length()).collect(Collectors.toList());
//        System.out.println(words);
//        System.out.println(lengthSet);


//        List<String>sortedList= words.stream().sorted().collect(Collectors.toList());
//        System.out.println(sortedList);

        //Supplier->IN: () OUT object (returneaza ceva)
        //Consumer-> IN: objects..(String)...Out:void
//        words.stream().forEach(x-> System.out.println(x));
//        words.stream().forEach(x-> consumeString(x));

        //reduce
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,7,8);
        Integer result= numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(result);
//        ...

        System.out.println(words.stream().reduce((s1,s2)->s1+s2));/*orElse(""));*/
        //count
        long numberOfElements=numbers.stream().distinct().filter(x->x>3).count();

        System.out.println(numberOfElements);

        boolean isGreaterThan3 = numbers.stream().anyMatch(x->x>3);
//        boolean isGreaterThan3 = numbers.stream().noneMatch(x->x>3);
//        boolean isGreaterThan3 = numbers.stream().allMatch(x->x>3);
        System.out.println(isGreaterThan3);



        //Function: x->y
        //Bifunction x,y->z



    }

    private static void consumeString(String name){
        System.out.println(name+" altceva");
    }

}
