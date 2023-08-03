package com.sessions.session9;

public class AnimalTestClass {
    public static void main(String[] args) {
        Animal1 animal = new Animal1();
//        animal.setName("Cat");
//        animal.setAge(3);

        Animal1 dog = new Animal1("dog", 4);
        System.out.println(dog.age);
        System.out.println(dog.name);

        Animal1 dog2 = new Animal1("canin", 6, "Azorel");



    }
}
