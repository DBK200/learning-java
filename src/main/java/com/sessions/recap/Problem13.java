package com.sessions.recap;

public class Problem13 {

    //Given:
    public static void main(String[] args) {
        Cat whiskers = new Cat(3);
        System.out.println(whiskers.age);
    }
}
class Cat {
    int age;
    Cat() {
        this(5);
    }
    Cat(int age) {
        this.age = age;
    }
}
/*
What will be the value of whiskers.age?
a) 0
b) 5
c) 3 x
d) null
 */