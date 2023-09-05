package com.sessions.session15.homeworksession15.ex2;


// 2. Create a Person class with name, age, and email fields.
// Implement the equals() method to check only the name and age fields.
// Implement the hashCode() method to use the name and age fields to
// calculate the hash code. Test that two instances with the same name
// and age return true for equals() and have the same hash code.

public class Person {
    private String name;
    private int age;
    private String email;

    // All args constructor
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getters and setters
    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Override the equals() method
    public boolean equals(Object object) {
        if(object==null){
            return false;
        }

        if(object==this){
            return true;
        }

        Person person = (Person) object;

        return name == person.name && age == person.age && email == person.email;
    }


    // hashcode()
}
