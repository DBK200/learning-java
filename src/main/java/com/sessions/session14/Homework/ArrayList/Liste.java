package com.sessions.session14.Homework.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Liste
{
    public static void main(String[] args)
    {
        //1.Write a Java program to create a new array list, add some colors (string) and print out the collection.

        System.out.println("Exercitiu 1:");
        ArrayList lista1=new ArrayList<>();
        lista1.add("Verde");
        lista1.add("Rosu");
        lista1.add("Alb");
        lista1.add("Albastru");
        lista1.add("Negru");
        System.out.println(lista1);

        //2. Write a Java program to iterate through all elements in a array list.

        System.out.println("Exercitiu 2:");
        ArrayList<String> lista2=new ArrayList<>();
        lista2.add("mere");
        lista2.add("pere");
        lista2.add("banane");
        lista2.add("prune");
        for (String element:lista2)
        {
            System.out.println(element);
        }

        //3. Write a Java program to insert an element into the array list at the first position.

        System.out.println("Exercitiu 3:");
        ArrayList<String> lista3=new ArrayList<>();
        lista3.add("Java");
        String element="C++";
        lista3.add(0,element);
        System.out.println(lista3);

        //4.Write a Java program to retrieve an element (at a specified index) from a given array list.

        System.out.println("Exercitiu 4:");
        List<Integer> lista4=new ArrayList<>();
        lista4.add(2);
        lista4.add(1);
        lista4.add(5);
        lista4.add(22);
        lista4.add(28);
        lista4.add(34);
        lista4.add(12);
        int element1=242;
        lista4.add(3,element1);
        System.out.println(lista4);

        //5.Write a Java program to update specific array element by given element.

        System.out.println("Exercitiu 5:");
        List<Integer> lista5=new ArrayList<>();
        lista5.add(2);
        lista5.add(1);
        lista5.add(5);
        lista5.add(34);
        lista5.add(12);
        int element2=2721;
        //pt a actualiza un element de la un index specificat folosim set
        lista5.set(1,element2);
        System.out.println(lista5);

        //6.Write a Java program to remove the third element from a array list.

        System.out.println("Exercitiu 6:");
        List<Integer> lista6=new ArrayList<>();
        lista6.add(2);
        lista6.add(1);
        lista6.add(5);
        lista6.add(34);
        lista6.add(12);
        lista6.remove(3);
        System.out.println(lista6);

        //7.Write a Java program to search an element in a array list.

        System.out.println("Exercitiu 7:");
        List<Integer> lista7=new ArrayList<>();
        lista7.add(2);
        lista7.add(1);
        lista7.add(5);
        lista7.add(34);
        lista7.add(12);
        int cautat=5;
        int contor=0;
        for(int element0:lista7)
        {
            //contains verifica daca un element se afla intr o lista
         if(lista7.contains(cautat))
         {
             contor++;
         }
        }
        if(contor>0)
        {
            System.out.println("Elementul se afla in lista");
        }
        else
        {
            System.out.println("Elementul nu se afla in lista");
        }

        //8.Write a Java program to sort a given array list.

        System.out.println("Exercitiu 8:");
        List<Integer> lista8=new ArrayList<>();
        lista8.add(23);
        lista8.add(12);
        lista8.add(28);
        lista8.add(2);
        lista8.add(3);
        Collections.sort(lista8);
        System.out.println(lista8);

        //9.Write a Java program to copy one array list into another.

        System.out.println("Exercitiu 9:");
        List<String> listaS=new ArrayList<>();
        listaS.add("Ana");
        listaS.add("Maria");
        listaS.add("Denisa");
        listaS.add("Claudia");
        listaS.add("Crina");
        listaS.add("Anya");
        System.out.println("Lista:"+listaS);

        List<String> listaS2=new ArrayList<>();
        listaS2.addAll(listaS);
        System.out.println("Lista copiata:"+listaS2);

        //10.Write a Java program to shuffle elements in a array list.

        System.out.println("Exercitiu 10:");
        List<String> lista10=new ArrayList<>();
        lista10.add("Ana");
        lista10.add("Maria");
        lista10.add("Denisa");
        lista10.add("Claudia");
        lista10.add("Crina");
        lista10.add("Anya");
        Collections.shuffle(lista10);
        System.out.println("Lista:"+lista10);

        //11.Write a Java program to reverse elements in a array list.

        System.out.println("Exercitiu 11:");
        List<String> lista11=new ArrayList<>();
        lista11.add("Ana");
        lista11.add("Maria");
        lista11.add("Denisa");
        lista11.add("Claudia");
        lista11.add("Crina");
        lista11.add("Anya");
        Collections.reverse(lista11);
        System.out.println("Lista:");
        for(String el:lista11)
        {
            System.out.println(el);
        }

        //12.Write a Java program to extract a portion of a array list.
        List<String> lista12=new ArrayList<>();
        lista12.add("Ana");
        lista12.add("Maria");
        lista12.add("Denisa");
        lista12.add("Claudia");
        lista12.add("Crina");
        lista12.add("Anya");
        int fromIndex=1;
        int toIndex=3;
        List<String> portion=lista12.subList(fromIndex,toIndex);
        System.out.println("Lista:");
        for(String elmt:portion)
        {
            System.out.println(elmt);
        }

        //13.Write a Java program to compare two array lists.

        System.out.println("Exercitiu 13:");
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(22);
        list.add(12);
        list.add(38);
        List<Integer> list1=new ArrayList<>();
        list1.add(3);
        list1.add(32);
        list1.add(31);
        list1.add(23);
        if(list.containsAll(list1))
        {
            System.out.println("Cele doua liste sunt egale");
        }
        else
        {
            System.out.println("Cele doua liste nu sunt egale");
        }

        //14.Write a Java program of swap two elements in an array list.

        System.out.println("Exercitiu 14:");
        List<Integer> list2=new ArrayList<>();
        list2.add(3);
        list2.add(32);
        list2.add(31);
        list2.add(23);
        int index1=0;
        int index2=3;
       Collections.swap(list2,index1,index2);
        System.out.println("Lista:");
        for(int e:list2)
        {
            System.out.println(e);
        }

        //15.Write a Java program to join two array lists.

        System.out.println("Exercitiu 15:");
        List<Integer> list3=new ArrayList<>();
        list3.add(2);
        list3.add(22);
        list3.add(12);
        list3.add(38);
        List<Integer> list4=new ArrayList<>();
        list4.add(3);
        list4.add(32);
        list4.add(31);
        list4.add(23);
        list3.addAll(list4);
        System.out.println("Cele doua liste unite:");
        System.out.println(list3);

        //16.Write a Java program to clone an array list to another array list.

        System.out.println("Exercitiu 16:");
        List<Integer> list5=new ArrayList<>();
        list5.add(2);
        list5.add(22);
        list5.add(12);
        list5.add(38);
        List<Integer> list6=new ArrayList<>(list5);
        System.out.println("Lista clonata:");
        System.out.println(list6);

        //17.Write a Java program to empty an array list.

        System.out.println("Exercitiu 17:");
        List<Integer> list7=new ArrayList<>();
        list7.add(2);
        list7.add(22);
        list7.add(12);
        list7.add(38);
        list7.clear();
        System.out.println("Lista :"+list7);

        //18.Write a Java program to test an array list is empty or not.

        System.out.println("Exercitiu 18:");
        List<Integer> list8=new ArrayList<>();
        //adaugam elemente in lista
        list8.add(2);
        list8.add(22);
        list8.add(12);
        list8.add(38);
        //Verificam daca lista este goala
        if(list8.isEmpty())
        {
            System.out.println("Lista este goala");
        }
        else
        {
            System.out.println("Lista nu este goala");
        }

        //19.Write a Java program to trim the capacity of an array list the current list size.

        System.out.println("Execitiu 19:");

        // Crearea unei liste ArrayList cu o capacitate inițială mai mare
        List<Integer> list9 = new ArrayList<>(10); // Capacitatea inițială este 10

        // Adăugarea unor elemente la lista
        list9.add(2);
        list9.add(22);
        list9.add(12);
        list9.add(38);

        // Redimensionarea capacității listei la dimensiunea actuală
        ((ArrayList<Integer>) list9).trimToSize();

        // Afișarea capacității listei după redimensionare
        int capacitate = ((ArrayList<Integer>) list9).size();
        System.out.println("Capacitatea listei după redimensionare: " + capacitate);

        //20.Write a Java program to increase the size of an array list.
        System.out.println("Exercitiu 20:");

        List<Integer> list10=new ArrayList<>();

        list10.add(2);
        list10.add(22);
        list10.add(12);
        list10.add(38);

        // Afișarea dimensiunii listei după adăugarea elementelor
        int dimensiuneCurenta = list10.size();
        System.out.println("Dimensiunea listei după adăugare: " + dimensiuneCurenta);







    }


}
