package com.sessions.session14.Homework.LinkedList;

import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class ListEx
{

    public static void main(String[] args)
    {
        //Write a Java program to append the specified element to the end of a linked list.
        System.out.println("Ex1");
        // Ex1: Adăugare element la sfârșitul listei dublu înlănțuite
        List<Integer> list = Arrays.asList(2, 1, 5, 4, 7, 5, 2, 4);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un element:");
        int element = scanner.nextInt();

        // Creăm o instanță nouă de LinkedList și adăugăm elementele din lista existentă
        LinkedList<Integer> linkedList = new LinkedList<>(list);
        linkedList.addLast(element);

        System.out.println(linkedList);

        //Write a Java program to iterate through all elements in a linked list
        System.out.println("Ex2");
        List<Integer> list2 = Arrays.asList(2, 1, 5, 4, 7, 5, 2, 4);
        LinkedList<Integer> linkedList2 = new LinkedList<>(list);
        for( Integer element2:linkedList2)
        {
            System.out.println("Lista iterata:"+element2);
        }

        //Write a Java program to iterate through all elements in a linked list starting at the specified position
        System.out.println("Ex3");
        // Create a Scanner to read user input
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduceți poziția de la care să înceapă iterația:");
        int pozitie = scanner1.nextInt();

        // Create a linked list and add elements
        List<Integer> list3 = Arrays.asList(2, 1, 5, 4, 7, 5, 2, 4);
        LinkedList<Integer> linkedList3 = new LinkedList<>(list3);

        // Create a list iterator starting at the specified position
        ListIterator<Integer> integerListIterator = linkedList3.listIterator(pozitie);

        // Iterate through elements starting from the specified position
        System.out.println("Iterarea de la poziția " + pozitie + ":");
        while (integerListIterator.hasNext()) {
            Integer elementt = integerListIterator.next();
            System.out.println(elementt);
        }

        //write a Java program to iterate a linked list in reverse order
        System.out.println("Ex4");
        LinkedList<Integer> list4=new LinkedList<>();
        list4.add(2);
        list4.add(7);
        list4.add(4);
        list4.add(76);
        list4.add(1);
        for(int i=list4.size()-1;i>=0;i--)
        {
            Integer elll=list4.get(i);
            System.out.println(elll);
        }

        //Write a Java program to insert the specified element at the specified position in the linked list
        System.out.println("Ex5");
        LinkedList<Integer> list5=new LinkedList<>();
        list5.add(3);
        list5.add(34);
        list5.add(6);
        list5.add(98);
        list5.add(243);
        Scanner scanner3=new Scanner(System.in);
        System.out.println("Specificati elementul:");
        int elSpecificat=scanner3.nextInt();
        System.out.println("Specificati pozitia:");
        int poz=scanner3.nextInt();
        if(poz>=0 && poz<list5.size())
        {
            list5.add(poz,elSpecificat);
        }
        else
        {
            System.out.println("Pozitia nu este valida");
        }

        //Write a Java program to insert elements into the linked list at the first and last position
        System.out.println("Ex6");
        LinkedList<Integer> list6=new LinkedList<>();
        list6.add(3);
        list6.add(34);
        list6.add(6);
        list6.add(98);
        list6.add(243);
        list6.addFirst(111);
        list6.addLast(111);
        System.out.println("Lista:"+list6);

        //Write a Java program to insert some elements at the specified position into a linked list
        System.out.println("Ex8");
        LinkedList<Integer> list7=new LinkedList<>();
        list7.add(3);
        list7.add(34);
        list7.add(6);
        list7.add(98);
        list7.add(243);
        int poz1=0;
        int poz2=1;
        int poz3=2;
        list7.add(poz1,2);
        list7.add(poz2,2);
        list7.add(poz2,2);
        System.out.println(list7);


        //Write a Java program to get the first and last occurrence of the specified elements in a linked list
        System.out.println("Ex8");
        LinkedList<Integer> list8=new LinkedList<>();
        list8.add(3);
        list8.add(34);
        list8.add(6);
        list8.add(98);
        list8.add(243);
        list8.add(3);
        int elementSfecificat=3;
        list8.add(elementSfecificat);
        int primaAparitie=list8.indexOf(elementSfecificat);
        int ultimaAparitie=list8.lastIndexOf(elementSfecificat);

        if (primaAparitie != -1) {
            System.out.println("Prima apariție a elementului '" + elementSfecificat + "' este la indexul " + primaAparitie);
            System.out.println("Ultima apariție a elementului '" + elementSfecificat + "' este la indexul " + ultimaAparitie);
        } else {
            System.out.println("Elementul '" + elementSfecificat + "' nu a fost găsit în listă.");
        }

        //Write a Java program to display the elements and their positions in a linked list
        System.out.println("Ex9");
        LinkedList<Integer> list9=new LinkedList<>();
        list9.add(3);
        list9.add(34);
        list9.add(6);
        list9.add(98);
        list9.add(243);
        list9.add(3);
        for(Integer element1:list9)
        {
            System.out.println("Lista:"+element1);
        }
        for(int i=0;i<list9.size()-1;i++)
        {
            System.out.println("Pozitiile"+list9.size());
        }

        //12.Write a Java program to remove a specified element from a linked list.
        System.out.println("Exercitiu10");
        LinkedList<Integer> list10=new LinkedList<>();
        list10.add(3);
        list10.add(23);
        list10.add(21);
        list10.add(34);
        list10.add(98);
        list10.add(3);
        list10.add(363);
        int element_specificat=3;
        list10.remove(element_specificat);
        System.out.println(list10);

        //Write a Java program to remove first and last element from a linked list
        System.out.println("Ex11");
        LinkedList<Integer> list11=new LinkedList<>();
        list11.add(3);
        list11.add(23);
        list11.add(21);
        list11.add(34);
        list11.add(98);
        list11.add(3);
        list11.add(363);
        list11.removeFirst();
        list11.removeLast();
        System.out.println("Lista dupa ce am sters primul si ultimul element:"+list11);

        //Write a Java program to remove all the elements from a linked list
        System.out.println("Ex 12");
        LinkedList<Integer> list12=new LinkedList<>();
        list12.add(3);
        list12.add(23);
        list12.add(21);
        list12.add(34);
        list12.add(98);
        list12.add(3);
        list12.add(363);
        list12.removeAll(list12);
        System.out.println("Lista goala:"+list12);


        //Write a Java program of swap two elements in a linked list
        System.out.println("Ex13");
        LinkedList<Integer> list13=new LinkedList<>();
        list13.add(3);
        list13.add(23);
        list13.add(21);
        list13.add(34);
        list13.add(98);
        list13.add(3);
        list13.add(363);
        int index1=1;
        int index2=2;
        Collections.swap(list13,index1,index2);
        System.out.println("Lista dupa ce am facut swap la 2 elemente"+list13);

        //Write a Java program to shuffle the elements in a linked list
        System.out.println("Ex14");
        LinkedList<Integer> list14=new LinkedList<>();
        list14.add(3);
        list14.add(23);
        list14.add(21);
        list14.add(34);
        list14.add(98);
        list14.add(3);
        list14.add(363);
        Collections.shuffle(list14);
        System.out.println(list14);


        //Write a Java program to join two linked lists
        System.out.println("Ex15");
        LinkedList<Integer> list15=new LinkedList<>();
        list15.add(3);
        list15.add(23);
        list15.add(21);
        LinkedList<Integer> list16=new LinkedList<>();
        list16.add(3);
        list16.add(23);
        list16.add(21);
        LinkedList<Integer> lista17=new LinkedList<>();
        lista17.addAll(list15);
        lista17.addAll(list16);
        System.out.println("Lista 17:"+lista17);

        //Write a Java program to clone an linked list to another linked list
        System.out.println("Ex16");

        LinkedList<Integer> list17=new LinkedList<>();
        list17.add(3);
        list17.add(23);
        list17.add(21);
        LinkedList<Integer> lista18=(LinkedList<Integer>)list17.clone();
        System.out.println("Lista clonata:"+lista18);

        //Write a Java program to remove and return the first element of a linked list
        System.out.println("Ex17");
        LinkedList<Integer> list18=new LinkedList<>();
        list18.add(3);
        list18.add(23);
        list18.add(21);
        int first=list18.getFirst();
        list18.removeFirst();
        System.out.println(first);

        //Write a Java program to retrieve but does not remove, the first element of a linked list
        System.out.println("Ex18");
        LinkedList<Integer> list19=new LinkedList<>();
        list19.add(3);
        list19.add(23);
        list19.add(21);
        int primulElement=list19.getFirst();
        System.out.println("Primul element adaugat este:"+primulElement);

    }
}
