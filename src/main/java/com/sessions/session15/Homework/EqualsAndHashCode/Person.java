package com.sessions.session15.Homework.EqualsAndHashCode;

import com.sessions.session15.PersonROX;

public class Person
{
    //Create a Person class with name, age, and email fields. Implement the equals() method
    //    // to check only the name and age fields. Implement the hashCode() method to use the name and
    //    // age fields to calculate the hash code. Test that two instances with the same name and age
    //    // return true for equals() and have the same hash code.

    public String name;
    public int age;
    public String email;
    Person(String name,int age,String email)
    {
        this.name=name;
        this.age=age;
        this.email=email;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    // Metoda equals() care compară două obiecte pentru egalitate bazată pe nume și vârstă.
    @Override
    public boolean equals(Object object)
    {
        // Verificăm dacă obiectul curent este identic cu obiectul dat.
        if (this == object)
        {
            return true;
        }

        // Verificăm dacă obiectul dat este null sau nu aparține clasei Person.
        if (object == null || getClass() != object.getClass())
        {
            return false;
        }

        // Facem conversia obiectului dat la tipul Person.
        Person person = (Person) object;

        // Verificăm dacă vârsta nu este egală, returnăm false.
        if (age != person.age) {
            return false;
        }

        // Verificăm dacă numele este diferit, returnăm false.
        if (name != null ? !name.equals(person.name) : person.name != null)
        {
            return false;
        }

        // Dacă toate verificările sunt trecute, returnăm true pentru a indica egalitatea.
        return true;
    }

    // Metoda hashCode() calculează codul hash pe baza numelui și vârstei.
    @Override
    public int hashCode()
    {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    public static void main(String[] args)
    {
        Person person1 = new Person("John", 30, "john@example.com");
        Person person2 = new Person("John", 30, "johndoe@example.com");

        // Testează metoda equals()
        boolean areEqual = person1.equals(person2);
        System.out.println("Are equal: " + areEqual);

        // Testează metoda hashCode()
        System.out.println("HashCode for person1: " + person1.hashCode());
        System.out.println("HashCode for person2: " + person2.hashCode());
    }

}
