package com.sessions.session26.recap;

public class Problem9 {
    //Assuming the following code:
    public static void main(String[] args) {
            Dog d = new Dog();
    }
}
class Animal {
    Animal() {
        System.out.print("Animal ");
    }
}
class Dog extends Animal {
    Dog() {
        System.out.print("Dog ");
    }
}
/*
What will the output be?
a) Dog
b) Animal Dog x
c) Animal
d) None of the above
 */