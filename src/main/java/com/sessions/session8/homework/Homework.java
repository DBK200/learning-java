package com.sessions.session8.homework;

import java.time.LocalDate;

public class Homework
{
    public static void main(String[] args)
    {
        Electronics electronic = new Electronics(LocalDate.of(2001, 5, 12));

        System.out.println("Details of the electronics are displayed bellow\n" + electronic);

        Laptop laptop1 = new Laptop(electronic.getDateOfFabrication(), 32, Brand.Asus, 3199.99, 1);

        System.out.println(laptop1);
    }
}
