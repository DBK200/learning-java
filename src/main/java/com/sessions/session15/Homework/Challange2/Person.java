package com.sessions.session15.Homework.Challange2;

public class Person {

    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }


    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (obj == this){
            return true;
        }
        if (!(obj instanceof Person person)){
            return false;
        }
        return name.equals(person.name) && age == person.age;
    }
    public int hashCode(){
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        return result;
    }
}
