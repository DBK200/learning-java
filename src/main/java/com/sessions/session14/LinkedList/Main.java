package com.sessions.session14.LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        List<String> nameList = new LinkedList<>();

        nameList.add("Alex");
        nameList.add("Mike");
        nameList.add("John");
        nameList.add("Ana");

        System.out.println(nameList);

        String specifiedName = "Ion";
        nameList.add(specifiedName);
        System.out.println(nameList);

        for (String s : nameList){
            System.out.println(s);
        }
        System.out.println();

        ListIterator<String> iterator1 = nameList.listIterator(2);
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println();

        ListIterator<String> iterator2 = nameList.listIterator(nameList.size());
        System.out.println("Elements in reverse order: ");
        while (iterator2.hasPrevious()) {
            System.out.println(iterator2.previous());
        }

        nameList.add(2, "Anton");
        System.out.println(nameList);

        nameList.add(0, "Vali");
        nameList.add("Nelu");
        System.out.println(nameList);
        System.out.println();

        List<String> elementsToInsert = new LinkedList<>();
        elementsToInsert.add("Mihai");
        elementsToInsert.add("Daniela");
        nameList.addAll(3, elementsToInsert);
        System.out.println(nameList);
        System.out.println();

        ListIterator<String> iterator3 = nameList.listIterator();
        int position = 0;
        while (iterator3.hasNext()) {
            System.out.println("Position " + position + ": " + iterator3.next());
            position++;
        }
        System.out.println();

        nameList.remove(3);
        System.out.println(nameList);

        nameList.remove(0);
        nameList.remove(nameList.size() -1);
        System.out.println(nameList);

//        nameList.removeAll(nameList);
//        System.out.println(nameList);

        String element1 = nameList.get(1);
        String element2 = nameList.get(2);

        nameList.set(1, element2);
        nameList.set(2, element1);
        System.out.println(nameList);

        Collections.shuffle(nameList);
        System.out.println(nameList);

        List<String> clonedList = nameList;
        System.out.println(clonedList);

        String removedElement = nameList.remove(0);
        System.out.println(removedElement);
        System.out.println(nameList);


        System.out.println(nameList.get(0));


    }
}
