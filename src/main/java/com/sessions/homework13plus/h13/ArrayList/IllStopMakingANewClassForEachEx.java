package com.sessions.homework13plus.h13.ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class IllStopMakingANewClassForEachEx {
    public static void main(String[] args) {
//5. Write a Java program to update specific array element by given element.

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("Yellow");
        myArrayList.add("Purple");
        myArrayList.add("Blue");
        myArrayList.add("Green");
        myArrayList.add("Red");


        myArrayList.set(myArrayList.indexOf("Blue"), "REPLACED");
        System.out.println(myArrayList);

//6. Write a Java program to remove the third element from a array list.
        myArrayList.remove(3);
        System.out.println(myArrayList);

//7. Write a Java program to search an element in a array list.
        System.out.println(myArrayList.indexOf("Red"));

        //8. Write a Java program to sort a given array list.
        Collections.sort(myArrayList);
        System.out.println(myArrayList);

        //9. Write a Java program to copy one array list into another.

        ArrayList<String> myArrayList2 = new ArrayList<>(myArrayList);
        System.out.println(myArrayList2);

        //10. Write a Java program to shuffle elements in a array list.
        Collections.shuffle(myArrayList);
        System.out.println(myArrayList);

        //11. Write a Java program to reverse elements in a array list.
        Collections.reverse(myArrayList2);
        System.out.println(myArrayList2);

        //12. Write a Java program to extract a portion of a array list.
        System.out.println(myArrayList.subList(1,3));

        //13. Write a Java program to compare two array lists.
        System.out.println(myArrayList.equals(myArrayList2));

        //14. Write a Java program of swap two elements in an array list.
        Collections.swap(myArrayList,1,3);
        System.out.println(myArrayList2);

        //15. Write a Java program to join two array lists.
        myArrayList.addAll(myArrayList2);
        System.out.println(myArrayList);

        //16. Write a Java program to clone an array list to another array list.
        myArrayList.clone();
        System.out.println(myArrayList);

        //17. Write a Java program to empty an array list.
        myArrayList.removeAll(myArrayList);
        System.out.println(myArrayList);

        //18. Write a Java program to test an array list is empty or not.
        System.out.println(myArrayList.isEmpty());

        //19. Write a Java program to trim the capacity of an array list the current list size.
        myArrayList2.trimToSize();

        //20. Write a Java program to increase the size of an array list.

        myArrayList2.ensureCapacity(10);

     }
}
