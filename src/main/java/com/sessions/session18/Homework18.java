package com.sessions.session18;

import com.sessions.session7.Array;

import java.util.*;

public class Homework18 {
    public static void main(String[] args) {

//        Filtering: Write a program that uses a stream to filter out all the negative numbers from a list of integers.
//        List<Integer> numbers= Arrays.asList(1,-1,4,67,43,-2,-3,3);
//        System.out.println(numbers);
//        List<Integer> resultedList= numbers.stream().filter(n->n>0).toList();
//        System.out.println(resultedList);

//        Mapping: Write a program that uses a stream to transform a list of strings to uppercase and then sort them in alphabetical order.
//        List<String> words=Arrays.asList("hello","world","how","are","you");
//        System.out.println(words);
//        List<String> sortedList=words.stream().map(x->x.toUpperCase()).sorted().toList();
//        System.out.println(sortedList);

//        Reducing: Write a program that uses a stream to calculate the product of all the elements in a list of integers.
//        List<Integer> numbers= Arrays.asList(2,1,3);
//        System.out.println(numbers);
//        int product=numbers.stream().reduce(1,(x,y)->x*y);
//        System.out.println(product);

//        Sorting: Write a program that uses a stream to sort a list of custom objects by a specific property, such as age or name.
//        List<Person>personList=new ArrayList<>();
//        personList.add(new Person("David",21));
//        personList.add(new Person("Alex",30));
//        personList.add(new Person("Cristi",18));
//        personList.add(new Person("Bogdan",46));
//        System.out.println(personList);
//        List<Person> alphabeticalSorting=personList.stream().sorted(Comparator.comparing(Person::getName)).toList();
//        System.out.println(alphabeticalSorting);


    }
}
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}