package com.sessions.homework13plus.h14;

import java.util.HashSet;
import java.util.Set;

public class Person {
    int age;
    String name;
    String email;

    public Person(int age, String name, String email) {
        this.age = age;
        this.name = name;
        this.email = email;
    }

    public static void main(String[] args) {
        Person p1 = new Person(18, "John","john@gmail.com");
        Person p2 = new Person(18, "John", "john2@gmail.com");

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode() +" " +p2.hashCode());

        Set<Person> set= new HashSet<>();
        set.add(p1);
        set.add(p2);
        System.out.println(set.size());

    }

    @Override
    public boolean equals(Object obj){
        if(obj == null) {return  false;}
        if(obj == this) {return true;}
        if( !(obj instanceof Person)) {return false;}

        Person person =  (Person) obj;
        return name.equals(person.name) && age == person.age;
    }

    @Override
    public int hashCode() {
        int result = 100;
        result = 54 * result + name.hashCode();
        result = 54 * result + age;
        return result;
    }

}
