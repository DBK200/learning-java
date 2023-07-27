package com.sessions.session7.homework;

import java.util.ArrayList;
import java.util.Random;

public class ArrayHomework {

    public static void main(String[] args) {

        //ShoppingList
        String[] shoppingArrayList = {"mere","pere","morcov","rosi","castraveti"};
        System.out.print("Shopping List: ");
        for (String item : shoppingArrayList)
            System.out.print(item + " ");
        System.out.println();

        //Wishlist
        ArrayList<String> wishList = new ArrayList<>();
        wishList.add("Maimuta de plus");
        wishList.add("Un BMWx5");
        wishList.add("Un PC nou");
        wishList.add("O cana mare");
        System.out.println("Wishlist for christmas: " + wishList);

        //Student and Graduate lists
        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduateList = new ArrayList<>();
        String[][] nameArray = {{"Ana","Ion","John","Andrei","Gigel"},{"Popescu","Braga","Baciu","Ghinete"}};

        Random randomName = new Random();
        for (int i = 1; i <= 10; i++)
            studentList.add(nameArray[0][randomName.nextInt(0,4)] + " " + nameArray[1][randomName.nextInt(0,3)]);
        System.out.println("Student List: " + studentList);

        graduateList.addAll(studentList);
        System.out.print("Graduate List: ");
        graduateList.forEach((student) -> System.out.print(student + " "));

    }

}
