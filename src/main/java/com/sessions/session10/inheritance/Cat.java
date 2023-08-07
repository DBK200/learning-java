package com.sessions.session10.inheritance;

public class Cat extends Animal{

    public static void main(String[] args) {
        Cat kitty = new Cat();
        System.out.println(kitty.age);
        kitty.eat();
    }

    @Override
    protected void eat(){
        System.out.println("Kitty eating");
    }

}
