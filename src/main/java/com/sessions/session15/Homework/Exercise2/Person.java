package com.sessions.session15.Homework.Exercise2;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String email;
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof Person)) {
            return false;
        }
        Person person = (Person) object;
        return name.equals(person.name) && age == person.age;
    }
    public int hashCode() {
        return age + name.hashCode();
    }
}
