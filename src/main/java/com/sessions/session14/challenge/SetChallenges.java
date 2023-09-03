package com.sessions.session14.challenge;

/*
    1. Write a Java program to append the specified element to the end of a hash set.
    2. Write a Java program to iterate through all elements in a hash list.
    3. Write a Java program to get the number of elements in a hash set.
    4. Write a Java program to empty a hash set.
    5. Write a Java program to test a hash set is empty or not.
    6. Write a Java program to clone a hash set to another hash set.
    7. Write a Java program to convert a hash set to an array.
    8. Write a Java program to convert a hash set to a tree set.
    9. Write a Java program to convert a hash set to a List/ArrayList.
    10. Write a Java program to compare two hash set.
    11. Write a Java program to compare two sets and retain elements which are the same on both sets.
    12. Write a Java program to remove all the elements from a hash set.
*/

import java.util.*;

public class SetChallenges {
    public static void main(String[] args) {
        // Challenge 1
        LinkedHashSet<Integer> setHashSet1 = new LinkedHashSet<>(Set.of(11,41,5,2,8));
        setHashSet1.add(0);
        setHashSet1.add(-3);

        // Challenge 2
        StringBuilder sbSetValues = new StringBuilder();
        for (Integer element: setHashSet1) {
            sbSetValues.append(sbSetValues.isEmpty() ? "" : "; ").append(element);
        }
        System.out.printf("[HashSet1] values: [%s]%n", sbSetValues);

        // Challenge 3
        System.out.printf("[HashSet1] has %d elements%n", setHashSet1.size());

        // Challenge 6
        HashSet<Integer> setHashSet2 = (HashSet) setHashSet1.clone();
        //HashSet<Integer> setHashSet2 = new HashSet<>(setHashSet1);
        setHashSet2.add(-9);

        // Challenge 4
        System.out.printf("[HashSet2] values: %s%n", setHashSet2.toString());
//        setHashSet2.clear();
//        System.out.printf("... and after clearing %d elements.%n", setHashSet2.size());

        // Challenge 5
        System.out.printf("[HashSet2] is empty returns: %b%n", setHashSet2.isEmpty());

        // Challenge 8
        TreeSet<Integer> setTreeSet = new TreeSet<>(setHashSet1);
        System.out.printf("[TreeSet] values: %s%n", setTreeSet.toString());

        // Challenge 8
        ArrayList alList = new ArrayList(setTreeSet);
        alList.add(0);
        System.out.println("The [alList] array values: " + alList);

        // Challenge 10
        System.out.println("[setTreeSet] contains [setHashSet1] returned: " + setTreeSet.containsAll(setHashSet1));

        // Challenge 11
        System.out.println("Elements present in both [setHashSet1] and [setHashSet2] sets: \n"
                + getEquals(setHashSet1, setHashSet2));
    }

    private static <T> HashSet<T> getEquals(HashSet<T> hsSet1, HashSet<T> hsSet2) {
        HashSet<T> hsResult = new HashSet<>();
        for (T element: hsSet1) {
            if (hsSet2.contains(element)) hsResult.add(element);
        }
        return hsResult;
    }
}
