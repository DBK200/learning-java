package com.sessions.session9;

public class AnimalTest {

    public static void main(String[] args) {
        Animal animal = new Animal();
//        animal.setName("cat");
//        animal.setAge(2);

        Animal dog = new Animal("dog", 3);
        System.out.println(dog.name);
        System.out.println(dog.age);

        Animal dog2 = new Animal("canin", 2, "Azorel");


    }
}
