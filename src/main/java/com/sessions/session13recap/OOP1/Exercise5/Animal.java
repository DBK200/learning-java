package com.sessions.session13recap.OOP1.Exercise5;

public class Animal {
    private String name;
    private String type;
    private String sound;
    public Animal(String name, String type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }
    public void makeSound() {
        System.out.println("Sound: " + sound);
    }
    public void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }
}
