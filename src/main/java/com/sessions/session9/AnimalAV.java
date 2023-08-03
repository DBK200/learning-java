package com.sessions.session9;

public class AnimalAV {
    protected String name;
    protected int age;
    private String family;

    public AnimalAV(String family, int age, String name) {
        this.family = family;
        this.age = age;
        this.name = name;
    }

    public AnimalAV(){
        this("dog", 2); // trebuie sa fie primul statement
        System.out.println("gsdgfd");
    } //nu e default, default e cel facut automat de Java - no arg

    public AnimalAV(String name, int age) {
        this.name = name;
        this.age = age;
    } //nu mai poate fi folosit constructorul default daca nu il specificam noi

    public AnimalAV(String name) {
        this.name = name;
        this.age = 2;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
