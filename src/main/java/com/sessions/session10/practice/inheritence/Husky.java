package com.sessions.session10.practice.inheritence;

public class Husky extends Dog {
/*
    Level 1:  Animal
    Level 2:  Dog, Cat
    level 3:  Husky
*/

    public static void main(String[] args) {
        Husky husky = new Husky();
        // This comes from [Animal] class
        System.out.println(husky.age);
        // This comes from [Dog] class
        System.out.println(husky.name);

    }
}
