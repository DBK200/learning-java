package com.sessions.session14.TreeSet;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        System.out.println(colors);

        for (String s : colors){
            System.out.println(s);
        }
        Set<String> colors2 = new TreeSet<>();
        colors2.addAll(colors);
        System.out.println(colors2);
        Set<String> reverseColors = ((TreeSet<String>) colors).descendingSet();
        System.out.println(reverseColors);
        System.out.println();

        System.out.println(((TreeSet<String>) colors).first());
        System.out.println(((TreeSet<String>) colors).last());

        Set<String> colors3 = new TreeSet<>(colors);
        System.out.println(colors3);

        System.out.println(colors.size());

        System.out.println(colors.equals(colors2));

        Set<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        Set<Integer> numbersLessThanSeven = new TreeSet<>();
        for (Integer num : numbers) {
            if (num < 7) {
                numbersLessThanSeven.add(num);
            }
        }
        System.out.println("Numbers less than 7: " + numbersLessThanSeven);

        Set<Integer> greaterThanOrEqual = ((TreeSet<Integer>) numbers).tailSet(5);
        System.out.println(greaterThanOrEqual);

        Set<Integer> lessThanOrEqual = ((TreeSet<Integer>) numbers).headSet(5, true);
        System.out.println(lessThanOrEqual);

        Set<Integer> strictlyGreaterThanOrEqual = ((TreeSet<Integer>) numbers).tailSet(5 + 1);
        System.out.println(strictlyGreaterThanOrEqual);

        Set<Integer> strictlyLessThan = ((TreeSet<Integer>) numbers).headSet(5);
        System.out.println(strictlyLessThan);

        String removedFirstElement = colors.iterator().next();
        colors.remove(removedFirstElement);
        System.out.println(removedFirstElement);
        System.out.println(colors);

        Integer lastElement;
        Iterator<Integer> iterator = ((TreeSet<Integer>) numbers).descendingIterator();
            lastElement = iterator.next();
            iterator.remove();
        System.out.println(lastElement);
        System.out.println(numbers);

        colors.remove("Yellow");
        System.out.println(colors);

    }
}
