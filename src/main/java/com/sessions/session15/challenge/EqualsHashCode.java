package com.sessions.session15.challenge;

/*
    Challenges - equals and hashCode

    1. Implement the equals() and hashCode() methods for a Rectangle class with width and height fields.
       Test that two instances with the same width and height return true for equals() and have the same hash code.
    2. Create a Person class with name, age, and email fields.
       Implement the equals() method to check only the name and age fields.
       Implement the hashCode() method to use the name and age fields to calculate the hash code.
       Test that two instances with the same name and age return true for equals() and have the same hash code.
    3. Create a Student class with name, age, studentId, and email fields.
       Implement the equals() method to check all fields except the studentId.
       Implement the hashCode() method to use all fields except the studentId to calculate the hash code.
       Test that two instances with the same name, age, and email return true for equals() and have the same hash code.
    4. Create a Song class with title, artist, and length fields.
       Implement the equals() method to check only the title and artist fields.
       Implement the hashCode() method to use the title and artist fields to calculate the hash code.
       Test that two instances with the same title and artist return true for equals() and have the same hash code.
    5. Create a ToString class with name, price, and id fields.
       Implement the equals() method to check only the id field.
       Implement the hashCode() method to use the id field to calculate the hash code.
       Test that two instances with the same id return true for equals() and have the same hash code.
       Then change the id of one instance and test that they are no longer equal and have different hash codes.
*/

import java.util.Objects;

public class EqualsHashCode {

    public static void main(String[] args) {
        /*-------------------
         |  Exercise no. 1  |
         -------------------*/
        Rectangle rct1 = new Rectangle(10,20);
        Rectangle rct2 = new Rectangle(10,20);
        Rectangle rct3 = new Rectangle(5,20);

        System.out.println("== Exercise no. 1 ==\n");
        System.out.println("rct1 equals rct2 returned " + rct1.equals(rct2));
        System.out.println("rct1 equals rct3 returned " + rct1.equals(rct3));
        System.out.println("rct2 equals rct3 returned " + rct2.equals(rct3));

        printHashCode(rct1, rct2, rct3);

        System.out.println("\n" + "=".repeat(20) + "\n");

        /*-------------------
         |  Exercise no. 2  |
         -------------------*/
        Person person1 = new Person("Name1", 33, "name1@mail.com");
        Person person2 = new Person("Name1", 33, "name11@mail.com");
        Person person3 = new Person("Name3", 33, "n@mail.com");

        System.out.println("== Exercise no. 2 ==\n");
        System.out.println("person1 equals person2 returned " + person1.equals(person2));
        System.out.println("person1 equals person3 returned " + person1.equals(person3));
        System.out.println("person2 equals person3 returned " + person2.equals(person3));

        printHashCode(person1, person2, person3);

        System.out.println("\n" + "=".repeat(20) + "\n");

        /*-------------------
         |  Exercise no. 3  |
         -------------------*/
        Student student1 = new Student("Name1", 33, 1,"name1@mail.com");
        Student student2 = new Student("Name1", 33, 2,"name1@mail.com");
        Student student3 = new Student("Name3", 39, 3, "n@mail.com");

        System.out.println("== Exercise no. 3 ==\n");
        System.out.println("student1 equals student2 returned " + student1.equals(student2));
        System.out.println("student1 equals student3 returned " + student1.equals(student3));
        System.out.println("student2 equals student3 returned " + student2.equals(student3));

        printHashCode(student1, student2, student3);

        System.out.println("\n" + "=".repeat(20) + "\n");

        /*-------------------
         |  Exercise no. 4  |
         -------------------*/
        Song song1 = new Song("Artist1", "Title1", 1);
        Song song2 = new Song("Artist1", "Title1", 2);
        Song song3 = new Song("Artist3", "Title3", 3);

        System.out.println("== Exercise no. 4 ==\n");
        System.out.println("song1 equals song2 returned " + song1.equals(song2));
        System.out.println("song1 equals song3 returned " + song1.equals(song3));
        System.out.println("song2 equals song3 returned " + song2.equals(song3));

        printHashCode(song1, song2, song3);

        System.out.println("\n" + "=".repeat(20) + "\n");

        /*-------------------
         |  Exercise no. 5  |
         -------------------*/
        Product product1 = new Product("Product1", 10, 1);
        Product product2 = new Product("Product2", 20, 1);
        Product product3 = new Product("Product3", 30, 2);

        System.out.println("== Exercise no. 5 ==\n");
        System.out.println("product1 equals product2 returned " + product1.equals(product2));
        System.out.println("product1 equals product3 returned " + product1.equals(product3));
        System.out.println("product2 equals product3 returned " + product2.equals(product3));

        printHashCode(product1, product2, product3);

        System.out.println("\n" + "=".repeat(20) + "\n");
    }

    @SafeVarargs
    private static <T> void printHashCode(T... parameters){
        if (parameters == null) return;
        System.out.print("HashCodes: ");
        int i = 0;
        for (T element: parameters) {
            System.out.printf("[param%d: %d]" + ((i == parameters.length - 1) ? "%n" : ", "),
                    ++i, element.hashCode());
        }
    }
}


/*
    5. Create a ToString class with name, price, and id fields.
       Implement the equals() method to check only the id field.
       Implement the hashCode() method to use the id field to calculate the hash code.
       Test that two instances with the same id return true for equals() and have the same hash code.
       Then change the id of one instance and test that they are no longer equal and have different hash codes.
*/
class Product {
    private String name;
    private int price;
    private int id;

    public Product(String name, int price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        if(object == this) return true;
        if (!(object instanceof Product product)) return false;
        return product.id == id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Hash algorithm
    // (https://stackoverflow.com/questions/664014/what-integer-hash-function-are-good-that-accepts-an-integer-hash-key)
    private int hash(int x) {
        x = ((x >>> 16) ^ x) * 0x45d9f3b;
        x = ((x >>> 16) ^ x) * 0x45d9f3b;
        x = (x >>> 16) ^ x;
        return x;
    }

    // Unhash algorithm for previous hashing algorithm
    // (https://stackoverflow.com/questions/664014/what-integer-hash-function-are-good-that-accepts-an-integer-hash-key)
    private int unhash(int x) {
        x = ((x >>> 16) ^ x) * 0x119de1f3;
        x = ((x >>> 16) ^ x) * 0x119de1f3;
        x = (x >>> 16) ^ x;
        return x;
    }
}


/*
    4. Create a Song class with title, artist, and length fields.
       Implement the equals() method to check only the title and artist fields.
       Implement the hashCode() method to use the title and artist fields to calculate the hash code.
       Test that two instances with the same title and artist return true for equals() and have the same hash code.
*/
class Song{
    private String artist;
    private String title;
    private int length;

    public Song(String artist, String title, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    @Override
    public boolean equals(Object object) {
        if (Objects.isNull(object)) return false;
        if (object == this) return true;
        if (!(object instanceof Song song)) return false;

        return Objects.equals(artist, song.artist)
                && Objects.equals(title, song.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artist, title);
    }
}


/*
    3. Create a Student class with name, age, studentId, and email fields.
       Implement the equals() method to check all fields except the studentId.
       Implement the hashCode() method to use all fields except the studentId to calculate the hash code.
       Test that two instances with the same name, age, and email return true for equals() and have the same hash code.
*/
class Student {
    private String name;
    private int age;
    private int studentId ;
    private String email;

    public Student(String name, int age, int studentId, String email) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.email = email;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        if (object == this) return true;
        if (!(object instanceof Student student)) return false;
        return Objects.equals(name, student.name)
                && student.age == age
                && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }

}


/*
    2. Create a Person class with name, age, and email fields.
       Implement the equals() method to check only the name and age fields.
       Implement the hashCode() method to use the name and age fields to calculate the hash code.
       Test that two instances with the same name and age return true for equals() and have the same hash code.
*/
class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        if (this == object) return true;
        if (!(object instanceof Person person)) return false;
        return person.age == age
                && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

/*
    1. Implement the equals() and hashCode() methods for a Rectangle class with width and height fields.
       Test that two instances with the same width and height return true for equals() and have the same hash code.
*/
class Rectangle{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int hashCode() {
//        return hash(width) + hash(height);
        return Objects.hash(width, height);
    }

    @Override
    public boolean equals(Object object) {

        if(object == null) return false;
        if(this == object) return true;
        if(!(object instanceof Rectangle rct)) return false;

        return rct.width == width
                && rct.height == height;
    }

}