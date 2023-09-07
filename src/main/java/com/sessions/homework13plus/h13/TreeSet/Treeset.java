package com.sessions.homework13plus.h13.TreeSet;

import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        //1.Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Blue");
        colors.add("ORANGE");
        colors.add("PURPLE");
        colors.add("YELLOW");
        colors.add("RED");

        System.out.println(colors);

        //2. Write a Java program to iterate through all elements in a tree set.
        colors.iterator();

        //3.Write a Java program to add all the elements of a specified tree set to another tree set.
        TreeSet<String> colors2 = new TreeSet<>(colors.subSet("Blue","Purple"));

        //4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
        System.out.println(colors.descendingSet());

        //5. Write a Java program to get the first and last elements in a tree set.
        colors.first();
        colors.last();

        //6. Write a Java program to clone a tree set list to another tree set.
        TreeSet<String> colors3 = new TreeSet<>(colors);

        //7.Write a Java program to get the number of elements in a tree set.
        System.out.println(colors.size());

        //8. Write a Java program to compare two tree sets.
        colors2.equals(colors);

        //9. Write a Java program to find the numbers less than 7 in a tree set.
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(65);
        numbers.add(4);
        numbers.add(54);
        System.out.println(numbers.headSet(7));

        //10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.
        numbers.ceiling(3);

        //11. Write a Java program to get the element in a tree set which is less than or equal to the given element.
        numbers.floor(8);

        //12. Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element.
        numbers.higher(5);

        //13. Write a Java program to get an element in a tree set which is strictly less than the given element.
        numbers.lower(10);

        //14. Write a Java program to retrieve and remove the first element of a tree set.
        numbers.pollFirst();

        //15. Write a Java program to retrieve and remove the last element of a tree set.
        numbers.pollLast();

        //16. Write a Java program to remove a given element from a tree set.
        numbers.remove(5);

    }
}
