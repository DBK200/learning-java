package com.sessions.session18.Challenges;

import java.util.Comparator;
import java.util.List;

class CustomObject{

    private int age;
    private String name;

    public CustomObject(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age;
    }
}

public class Challenge4 {
    //Sorting: Write a program that uses a stream to sort a
    // list of custom objects by a specific property, such as age or name

    public static void main(String[] args) {

        CustomObject person5 = new CustomObject(56, "John");
        CustomObject person1 = new CustomObject(19, "Mark");
        CustomObject person2 = new CustomObject(26, "Mike");
        CustomObject person3 = new CustomObject(34, "Alin");
        CustomObject person4 = new CustomObject(18, "Marcu");


        List<CustomObject> customObjectList = List.of(person1, person2, person3, person4, person5);

        List<CustomObject> listSortedByAge = customObjectList.stream()
                .filter(x -> x.getAge() > 20)
                .sorted((z, y) -> Integer.compare(z.getAge(), y.getAge()))
                .toList();

        System.out.println("Persons with the age over 20: \n" + listSortedByAge + "\n");


        List<CustomObject> listSortedByName = customObjectList.stream()
                .sorted((x, y) -> x.getName().compareTo(y.getName()))
                .toList();
        System.out.println("List sorted by names: \n" + listSortedByName);

    }
}
