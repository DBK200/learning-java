package com.sessions.session15;

public class PracticeROX
{
    public static void main(String[] args) {

        PersonROX person1 = new PersonROX(1, "Alex", "RO", 23);
        PersonROX person2 = new PersonROX(2, "Alex", "DE", 23);
        PersonROX person3 = new PersonROX(2, "Alex", "RO", 23);
        // person1 = person2 -> person2 = person3 => person1=person3
//        System.out.println(person1.equals(person2));
//        System.out.println(person1.equals("SomeString"));
//        System.out.println(person1.equals(person1));
        //hashcode
        System.out.println(person1.equals(person2)); // returns false
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        System.out.println(person2.equals(person3)); // returns true
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());
    }
}

