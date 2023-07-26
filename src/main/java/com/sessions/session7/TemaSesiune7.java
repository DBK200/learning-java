package com.sessions.session7;

import java.util.ArrayList;

public class TemaSesiune7
{

    public static void main(String[] args)
    {
        //1.Create a shopping list with Array and print the values

        System.out.println("Exercitiu 1:");

        String[] ShoppingList={"Apples","Banans","Oil","Sugar","Bred","Water"};
        for(int i=0;i<ShoppingList.length;i++)
        {
            System.out.println(ShoppingList[i]);
        }
        System.out.println(" ");


        //2.Create a wishlist for christmas with ArrayList and print the values

        System.out.println("Exercitiu 2:");

        ArrayList WishList=new ArrayList();
        WishList.add("Bananas");
        WishList.add("New car");
        WishList.add("Chocolate");
        WishList.add("to see my brothers");

        System.out.println(WishList);
        System.out.println(" ");


        //3.Create
        //2 empty ArrayLists: studentList and graduateStudentList
        //populate studentList with 10 students
        //copy values from studentList to graduateStudentList
        //iterate through graduateStudentList and print each graduated student

        System.out.println("Exercitiu 3:");

        ArrayList StudentList=new ArrayList();
        ArrayList GraduateStudentList=new ArrayList();

        StudentList.add("Alex Enache");
        StudentList.add("Ionut Munteanu");
        StudentList.add("Daniel Mic Duna");
        StudentList.add("Florina Mare");
        StudentList.add("Cezar Morariu");
        StudentList.add("Iasmina Pop");
        StudentList.add("Claudiu Lalu");
        StudentList.add("Deian Taran");
        StudentList.add("Cristi Munteanu");
        StudentList.add("Andreea Barbu");
        GraduateStudentList.add(StudentList);
        System.out.println(GraduateStudentList);










    }



}
