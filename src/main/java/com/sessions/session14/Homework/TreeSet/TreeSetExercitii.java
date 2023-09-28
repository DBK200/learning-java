package com.sessions.session14.Homework.TreeSet;
import java.util.TreeSet;
public class TreeSetExercitii
{
    public static void main(String[] args)
    {

        //Write a Java program to create a new tree set, add some colors (string) and print out the tree set. 
        System.out.println("Exercitiu 1:");
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("alb");
        treeSet.add("albastru");
        treeSet.add("roz");
        treeSet.add("negru");
        System.out.println(treeSet);
        //2.Write a Java program to iterate through all elements in a tree set.
        System.out.println("Exercitiu 2");
        TreeSet<String> treeSet1=new TreeSet<>();
        treeSet1.add("alb");
        treeSet1.add("albastru");
        treeSet1.add("roz");
        treeSet1.add("negru");
        for(String color:treeSet1)
        {
            System.out.println(color);
        }

        //3.Write a Java program to add all the elements of a specified tree set to another tree set.
        System.out.println("Exercitiu 3");
        TreeSet<String> treeSet2=new TreeSet<>();
        treeSet2.add("alb");
        treeSet2.add("albastru");
        treeSet2.add("roz");
        treeSet2.add("negru");
        TreeSet<String> treeSet3=new TreeSet<>(treeSet2);
        System.out.println(treeSet3);

        //4.Write a Java program to create a reverse order view of the elements contained in a given tree set.
        System.out.println("Exercitiu 4");
        TreeSet<String> treeSet4=new TreeSet<>();
        treeSet4.add("alb");
        treeSet4.add("albastru");
        treeSet4.add("roz");
        treeSet4.add("negru");
        System.out.println(treeSet4.descendingSet());

        //Write a Java program to get the first and last elements in a tree set.
        System.out.println("Exercitiu 5");
        TreeSet<String> treeSet5=new TreeSet<>();
        treeSet5.add("alb");
        treeSet5.add("albastru");
        treeSet5.add("roz");
        treeSet5.add("negru");
        String primulElement=treeSet5.first();
        System.out.println("Primul element :"+primulElement);
        String ultimulElement=treeSet5.last();
        System.out.println("Ultimul element:"+ultimulElement);

        //6.Write a Java program to clone a tree set list to another tree set.
        System.out.println("Exercitiu 6");
        TreeSet<String> treeSet6=new TreeSet<>();
        treeSet6.add("alb");
        treeSet6.add("albastru");
        treeSet6.add("roz");
        treeSet6.add("negru");
        TreeSet<String> treeSet7=(TreeSet<String>)treeSet6.clone();
        System.out.println("Clona:"+treeSet7);

        //7.Write a Java program to get the number of elements in a tree set.
        System.out.println("Exercitiu 7");
        TreeSet<String> treeSet8=new TreeSet<>();
        treeSet8.add("alb");
        treeSet8.add("albastru");
        treeSet8.add("roz");
        treeSet8.add("negru");
        System.out.println("Nr de elemente:"+treeSet8.size());

        //8.Write a Java program to compare two tree sets.\
        System.out.println("Exercitiu 8");
        TreeSet<String> treeSet9=new TreeSet<>();
        treeSet9.add("alb");
        treeSet9.add("albastru");
        treeSet9.add("roz");
        treeSet9.add("negru");
        TreeSet<String> treeSet10=new TreeSet<>();
        treeSet10.add("alb");
        treeSet10.add("albastru");
        treeSet10.add("roz");
        treeSet10.add("negru");
        System.out.println(treeSet10.equals(treeSet9));

        //9.Write a Java program to find the numbers less than 7 in a tree set.
        System.out.println("Exercitiu 9:");
        TreeSet<Integer> numbers=new TreeSet<>();
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);
        numbers.add(19);
        for(Integer nr:numbers)
        {
            if(nr<7)
            {
                System.out.println(nr);
            }
        }

        //10.Write a Java program to get the element in a tree set which is greater than or equal to the given element.
        System.out.println("Exercitiu 10");
        TreeSet<Integer> numbers1=new TreeSet<>();
        numbers1.add(3);
        numbers1.add(9);
        numbers1.add(1);
        numbers1.add(19);
        numbers1.add(4);
        Integer nrDat=4;
        for(Integer el1:numbers1)
        {
            if(el1>=nrDat)
            {
                System.out.println(el1);
            }
        }

        //Write a Java program to retrieve and remove the first element of a tree set
        System.out.println("Exercitiu 11");
        TreeSet<Integer> numbers2=new TreeSet<>();
        numbers2.add(3);
        numbers2.add(9);
        numbers2.add(1);
        numbers2.add(19);
        numbers2.add(4);
        int nr=numbers2.first();
        numbers2.remove(nr);
        System.out.println(numbers2);

        //Write a Java program to retrieve and remove the last element of a tree set
        System.out.println("Exercitiu 12");
        TreeSet<Integer> numbers3=new TreeSet<>();
        numbers3.add(3);
        numbers3.add(9);
        numbers3.add(1);
        numbers3.add(19);
        numbers3.add(4);
        int nr1=numbers3.last();
        numbers3.remove(nr);
        System.out.println(numbers3);

        //16.Write a Java program to remove a given element from a tree set.
        System.out.println("Exercitiu 13");
        TreeSet<Integer> numbers4=new TreeSet<>();
        numbers4.add(3);
        numbers4.add(9);
        numbers4.add(1);
        numbers4.add(19);
        numbers4.add(4);
        int nrDat1=3;
        numbers4.remove(nrDat1);
        System.out.println(numbers4);
    }
}
