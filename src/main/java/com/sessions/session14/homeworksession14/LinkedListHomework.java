package com.sessions.session14.homeworksession14;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListHomework {

    public static void main(String[] args) {

        // 1.Write a Java program to append the specified element to the end of a linked list.
        LinkedList<String> words = new LinkedList<>();
        words.add("table");
        words.add("chair");
        words.add("fridge");
        words.add("soap");
        words.add("perfume");
        words.add("shampoo");
        words.addLast("something");
        //System.out.println(words);

        // 2.Write a Java program to iterate through all elements in a linked list.
//        for(int i=0; i < words.size(); i++){
//            System.out.println("Element at index " + i + " is " + words.get(i));
//        }

        // with Iterator - done
//        Iterator iterator = words.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        // 3.Write a Java program to iterate through all elements in a linked list starting at the specified position.
//        int startIndex=2;
//        for(int i=startIndex; i < words.size(); i++){
//            System.out.println("Element at index " + i + " is " + words.get(i));
//        }

        // 4.Write a Java program to iterate a linked list in reverse order.
//        System.out.println("Elements in reverse order: ");
//        for(int i = words.size() - 1; i >=0; i--){
//            System.out.println("Element at index " + i + " is " + words.get(i));
//        }

        // 5.Write a Java program to insert the specified element at the specified position in the linked list.
//        words.add(3, "somethingNew");
//        System.out.println(words);

        // 6.Write a Java program to insert elements into the linked list at the first and last position.
//        words.addFirst("add me first");
//        words.addLast("add me last");
//        System.out.println(words);

        // 7. Write a Java program to insert the specified element at the front of a linked list.
//        words.addFirst("1111");
//        System.out.println(words);

        // 8. Write a Java program to insert the specified element at the end of a linked list
//        words.addLast("9999");
//        System.out.println(words);

        // 9. Write a Java program to insert some elements at the specified position into a linked list
//        words.add(3, "add me at third position");
//        words.add(4, "add me at fourth position");
//        words.add(5, "add me at fifth position");
//        System.out.println(words);

        // 10. Write a Java program to get the first and last occurrence of the specified elements in a linked list
       // words.add("soap");
//        String targetElement = "nnnnn";
//        //String targetElement="soap";
//
//        int firstOccurence = -1;
//        int lastOccurence = -1;
//
//        for(int i=0; i < words.size(); i++){
//            if(targetElement==words.get(i)){
//                if(firstOccurence==-1){
//                    firstOccurence=i;
//                }
//                lastOccurence=i;
//            }
//        }
//        if(firstOccurence!=-1){
//            System.out.println("Element " + targetElement + " is first displayed at index " + firstOccurence);
//            System.out.println("Element " + targetElement + " is last displayed at index " + lastOccurence);
//        } else{
//            System.out.println("Element " + targetElement + " nout found");
//        }

        // 11. Write a Java program to display the elements and their positions in a linked list
//        for(int i=0; i < words.size(); i++){
//            System.out.println("Element " + words.get(i) + " at index " + i);
//        }

        // 12. Write a Java program to remove a specified element from a linked list
//        words.remove("soap");
//        words.remove("soap");
//        System.out.println(words);

        // 13. Write a Java program to remove first and last element from a linked list
//        words.removeFirst();
//        words.removeLast();
//        System.out.println(words);

        // 14. Write a Java program to remove all the elements from a linked list
//        words.clear();
//        System.out.println(words);

        // 15. Write a Java program of swap two elements in a linked list
//        Collections.swap(words, 0, 2);
//        System.out.println(words);

        // 16. Write a Java program to shuffle the elements in a linked list
//        Collections.shuffle(words);
//        System.out.println(words);

        // 17. Write a Java program to join two linked lists
//        LinkedList<String> words2 = new LinkedList<>();
//        words2.add("a");
//        words2.add("b");
//        words2.add("c");
//        words2.add("d");
//        words2.add("e");

      //  words.addAll(words2);
//        LinkedList<String> wordsConcat = new LinkedList<>();
//        wordsConcat.addAll(words);
//        wordsConcat.addAll(words2);
//        System.out.println(wordsConcat);

        // 18. Write a Java program to clone a linked list to another linked list
//        LinkedList<String> words2 = new LinkedList<>();
//        words2 = (LinkedList) words.clone();
//        System.out.println(words2);

        // 19. Write a Java program to remove and return the first element of a linked list
//        System.out.println( words.getLast());
//        words.removeLast();
//        System.out.println(words);

        // 20. Write a Java program to retrieve but does not remove, the first element of a linked list
        //System.out.println(words.getFirst());
    }
}
