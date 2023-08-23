package com.sessions.session12.homework.OOP;

public class Employee extends User
{
    Employee()
    {

    }
    public static void main(String[] args)
    {
        User user1 = new User("Roxana Enache", 20, 0635246342, "Student","roxanaenache2003@gmail.com");
        User user2 = new User("Ionut Munteanu", 19, 0247365452, "Developer","ionut1@gmail.com");
        User user3 = new User("Anca Vacareanu", 19, 02474565452, "Student","ancavac23@gmail.com");
        User user4 = new User("Ana Buris", 18, 02473235452, "Student","anaaa12@gmail.com");
        System.out.println("Angajati:");
        System.out.println("1.");
        System.out.println("Numele: " +user1.name);
        System.out.println("Varsta:" +user1.age);
        System.out.println("Nr de telefon:" +user1.phoneNumber);
        System.out.println("Ocupatia:" +user1.occupation);
        System.out.println("Email:" +user1.email);

        System.out.println("2.");
        System.out.println("Numele: " +user2.name);
        System.out.println("Varsta:" +user2.age);
        System.out.println("Nr de telefon:" +user2.phoneNumber);
        System.out.println("Ocupatia:" +user2.occupation);
        System.out.println("Email:" +user2.email);

        System.out.println("3.");
        System.out.println("Numele: " +user3.name);
        System.out.println("Varsta:" +user3.age);
        System.out.println("Nr de telefon:" +user3.phoneNumber);
        System.out.println("Ocupatia:" +user3.occupation);
        System.out.println("Email:" +user3.email);

        System.out.println("4.");
        System.out.println("Numele: " +user4.name);
        System.out.println("Varsta:" +user4.age);
        System.out.println("Nr de telefon:" +user4.phoneNumber);
        System.out.println("Ocupatia:" +user4.occupation);
        System.out.println("Email:" +user4.email);
    }
}
