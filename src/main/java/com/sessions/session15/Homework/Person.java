package com.sessions.session15.Homework;

public class Person {
    private String name;
    private int age;
    private int id;
    private String email;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    Person(int id, String name, int age, String email) {
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

        return id == person.id && name.equals(name) && age == person.age;
    }

    public int hashCode() {
        return age + name.hashCode();
    }

    public static void main(String[] args) {
        Person person1 = new Person(1, "Marian", 20, "marian@yahoo.com");
        Person person2 = new Person(1, "Marian", 20, "marian2@yahoo.com");
        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}
