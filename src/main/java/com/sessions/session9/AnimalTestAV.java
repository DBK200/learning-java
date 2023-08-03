package com.sessions.session9;

public class AnimalTestAV {

    public static void main(String[] args) {
        AnimalAV animal = new AnimalAV();
//        animal.setName("cat");
//        animal.setAge(2);

        AnimalAV dog = new AnimalAV("dog", 3);
        System.out.println(dog.name);
        System.out.println(dog.age);

        AnimalAV dog2 = new AnimalAV("canin", 2, "Azorel");
    }
}
