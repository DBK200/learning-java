package com.sessions.homework13plus.h13.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        //1. Write a Java program to append the specified element to the end of a linked list.

        LinkedList<String> myList = new LinkedList<>();
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");
        myList.add("6");
        myList.add("7");

        myList.addLast("8");
        System.out.println(myList);

        //2. Write a Java program to iterate through all elements in a linked list.
        for(String element:myList){
            System.out.println(element);
        }

        //3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
        myList.listIterator(3);

        //4. Write a Java program to iterate a linked list in reverse order.
        Collections.reverse(myList);
        myList.listIterator(0);

        //5. Write a Java program to insert the specified element at the specified position in the linked list.
        myList.set(2,"30");
        System.out.println(myList);

        //6. 6. Write a Java program to insert elements into the linked list at the first and last position.
        myList.addFirst("PRIMU");
        myList.addLast("ULTIMU");

        //7. Write a Java program to insert the specified element at the front of a linked list.
        myList.push("PRIMUL PRIM");
        System.out.println(myList);

        //8.Write a Java program to insert the specified element at the end of a linked list.
        myList.offerLast("Ultimul ultim");

        //9.  Write a Java program to insert some elements at the specified position into a linked list.
        myList.add(5,"da");

        //10.Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        myList.peekFirst();
        myList.peekLast();

        //11.Write a Java program to display the elements and their positions in a linked list.
        for(String str : myList){
            System.out.println(str +" are indexul "+ myList.indexOf(str));
        }

        //12. Write a Java program to remove a specified element from a linked list.
        myList.remove("da");

        //13.Write a Java program to remove first and last element from a linked list.
        myList.removeFirst();
        myList.removeLast();

        //14.Write a Java program to remove all the elements from a linked list.
        // myList.removeAll(myList);

        //15. Write a Java program of swap two elements in a linked list. .
        Collections.swap(myList,2 ,3);

        //16. Write a Java program to shuffle the elements in a linked list.
        Collections.shuffle(myList);

        //17.  Write a Java program to join two linked lists.
        //myList.addAll()

        //18. Write a Java program to clone an linked list to another linked list.
        LinkedList<String> myList2 = new LinkedList<>(myList);

        //19.Write a Java program to remove and return the first element of a linked list.
        myList.pop();

        //20. Write a Java program to retrieve but does not remove, the first element of a linked list.
        myList.peekFirst();

    }
}
