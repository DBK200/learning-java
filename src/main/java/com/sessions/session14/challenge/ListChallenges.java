package com.sessions.session14.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListChallenges {

}

/*
ArrayList
    1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
    2. Write a Java program to iterate through all elements in an array list.
    3. Write a Java program to insert an element into the array list at the first position.
    4. Write a Java program to retrieve an element (at a specified index) from a given array list.
    5. Write a Java program to update specific array element by given element.
    6. Write a Java program to remove the third element from an array list.
[x] 7. Write a Java program to search an element in an array list.
[x] 8. Write a Java program to sort a given array list.
[x] 9. Write a Java program to copy one array list into another.
    10. Write a Java program to shuffle elements in an array list.
    11. Write a Java program to reverse elements in an array list.
    12. Write a Java program to extract a portion of an array list.
    13. Write a Java program to compare two array lists.
[x] 14. Write a Java program of swap two elements in an array list.
    15. Write a Java program to join two array lists.
[x] 16. Write a Java program to clone an array list to another array list.
[x] 17. Write a Java program to empty an array list.
    18. Write a Java program to test an array list is empty or not.
    19. Write a Java program to trim the capacity of an array list the current list size.
    20. Write a Java program to increase the size of an array list.
*/

class ArrayListChallenges {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> alResult0 = new ArrayList<>(List.of(1,2,3,4,3233,6));
        Integer iLookup = 33;
        System.out.printf("The search of '%d' returned: %s%n",
                iLookup, searchList(iLookup, alResult0));

        ArrayList<String> alResult1 = new ArrayList<>(List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        String lookup = "sday";
        System.out.printf("The search of '%s' returned: %s%n",
                lookup, searchList(lookup, alResult1));
        sortList(alResult1, false);
        System.out.printf("The ascending sort returned: %s%n", alResult1);
        sortList(alResult1, true);
        System.out.printf("The descending sort returned: %s%n", alResult1);


        // Add alResult1 to itself
        alResult1.addAll(alResult1);
        System.out.println("After append: " + alResult1);
        alResult1.trimToSize();

        // Clone an array list to another
        ArrayList<String> alResult2 = (ArrayList) alResult1.clone();
        System.out.println("After cloning: " + alResult2);

        // Swapping elements from index 1 and 2
        Collections.rotate(alResult1.subList(1,3),1);
        System.out.println("[alResult1] After swapping elements at index 1 and 2: " + alResult1
                + "\n[alResult2] is: " + alResult2);

        // Clearing the list and trims to the size
        //alResult2.clear();
        alResult2.trimToSize();
        System.out.println("[alResult2] After list clearing: " + alResult2);

        System.out.println(alResult1.containsAll(alResult2));


    }

    private static <T> ArrayList<T> searchList(T lookup, ArrayList<T> arrayList) {
        if (arrayList.isEmpty()) return null;

        ArrayList<T> alResult = new ArrayList<>();

        for (T e: arrayList) {
            if (e instanceof String || e instanceof Number) {
                if ((e.toString()).contains(lookup.toString())) alResult.add(e);
            }
            else {
                if (e.equals(lookup)) alResult.add(e);
            }
        }

        return alResult;
    }

    private static void sortList(ArrayList<String> arrayList, boolean reverse) {
        if (arrayList.isEmpty()) return;

        if (!reverse) Collections.sort(arrayList);
        else Collections.sort(arrayList, Collections.reverseOrder());
    }

}