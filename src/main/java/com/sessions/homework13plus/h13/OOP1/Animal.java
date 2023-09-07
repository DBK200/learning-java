package com.sessions.homework13plus.h13.OOP1;

public class Animal {
    //animal: Create an Animal class that has the following attributes: name, type, and sound. Implement methods for making
    // the animal make its sound, and for displaying the animal's name and type.
String name, type, sound;

    public Animal() {
    }

    public static void main(String[] args) {
        Animal monke = new Animal();
        monke.setName("Monke");
        monke.setType("Orangutan");
        monke.setSound("Monke Strong");

        monke.displayInfo();
        monke.makeSound();

    }

private void displayInfo(){
    System.out.println("This little guy is " + this.name +" the " + this.type );
}

private void makeSound(){
    System.out.println(this.sound);
}

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
