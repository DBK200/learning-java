package com.sessions.session15.practice;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> productMap = new HashMap<>(Map.of("a",1,"b",2,"c",3));
        productMap.put("d",4);
        System.out.println("Map is: " + productMap);
        System.out.println("The price of 'a' is " + productMap.get("a"));

        productMap.put("b", 4);
        System.out.println("The price of 'b' is " + productMap.get("b"));

    }
}

class Hash {
    public static void main(String[] args) {
        String sName1 = new String("Alex");
        Person person1 = new Person(1, sName1, "RO", 23);
        //Person person2 = new Person("John", "RO", 22);
        Person person2 = new Person(2,"Alex", "RO", 23);
        String sName2 = new String("Alex");
        System.out.println(sName2.hashCode());
        System.out.println("Alex".hashCode());
        // + " | " + "Alex".hashCode() + " | " + sName1 == sName2);
        Person person3 = new Person(1, sName2, "RO", 23);

        //System.out.println(person1.equals("Ssss"));
        System.out.println(person1.equals(person2)
                + " | hashCode p1 = " + person1.hashCode()
                + " | hashCode p2 = " + person2.hashCode());
        System.out.println(person1.equals(person3)
                + " | hashCode p1 = " + person1.hashCode()
                + " | hashCode p3 = " + person3.hashCode());

    }

}

class Person {

    private String name;
    private String country;
    private int age;

    private int id;

    public Person(int id, String name, String country, int age) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.age = age;
    }

    @Override
    public boolean equals(Object object) {

        if(object == null) return false;

        // If [object] is current object
        // exits immediately returning TRUE
        if(this == object) {
            return true;
        }

        // Checks if [object] is not an instance of
        // [Person] class, returns FALSE.
        // This also avoids throwing an exception at runtime.

        // This declaration is a bit more restrictive
//        if(this.getClass() != object.getClass()) {
        if(!(object instanceof Person)) {
            return false;
        }

        Person person = (Person) object;

        return person.id == id
                && person.name.equals(name)
                && person.country.equals(country)
                && person.age == age;
    }

    @Override
    public int hashCode() {
        return id + name.hashCode();
        // super.hashCode();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
