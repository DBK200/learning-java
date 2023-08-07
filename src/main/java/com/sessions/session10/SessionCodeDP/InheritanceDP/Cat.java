package com.sessions.session10.SessionCodeDP.InheritanceDP;



public class Cat extends Animal {

    public static void main(String[] args) {
        Cat kitty=new Cat();
        kitty.age=3;
        System.out.println(kitty.age);

        Dog rex=new Dog();
        rex.age=4;
        System.out.println(rex.age);
    }
}
