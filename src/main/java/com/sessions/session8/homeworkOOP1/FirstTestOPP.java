package com.sessions.session8.homeworkOOP1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FirstTestOPP
{
    public static void main(String[] args)
    {
        Electronics electronicProduce = new Electronics();

        System.out.println("Electronic made with no args constructor bellow");
        System.out.println(electronicProduce);

        Electronics electronic = new Electronics(LocalDate.of(2018, 8, 22));

        System.out.println("Electronic made with all args constructor bellow");
        System.out.println(electronic);

        Laptop laptop = new Laptop(LocalDate.of(2016,8, 23), 32, LaptopBrand.DELL, 4999.99, 1);
        System.out.println("You'll see a DELL laptop details bellow");
        System.out.println(laptop);

        laptop.setBrand(LaptopBrand.Asus);

        System.out.println("We changed the brand of the laptop in: " + laptop.getBrand());

        System.out.println("The RAM capacity is: " + laptop.getRAM() + " and the price of the laptop is: " + laptop.getPrice());

        LaptopWithTouchScreen touchScreenLaptop = new LaptopWithTouchScreen();

        System.out.println();
        System.out.println("We'll see a laptop with touch screen bellow");
        System.out.println(touchScreenLaptop);

        MobilePhone mobilePhone = new MobilePhone(LocalDate.of(2001, 6, 13),
                PhoneBrand.Huawei, 1699.99, true);

        System.out.println("You'll see a mobile phone bellow");
        System.out.println(mobilePhone);

        System.out.println("Number of mobile phones is: " + MobilePhone.getNumberOfPhones());

        MobilePhone anotherMobilePhone = new MobilePhone(LocalDate.of(2022, 1, 25),
                PhoneBrand.Apple, 3699.99, false);

        System.out.println("\nYou'll see a another mobile phone bellow");
        System.out.println(mobilePhone);

        System.out.println("Number of mobile phones is: " + MobilePhone.getNumberOfPhones());

        List<Electronics> electronics = new ArrayList<>();

        electronics.add(mobilePhone);
        electronics.add(laptop);
        electronics.add(electronicProduce);
        electronics.add(electronic);
        electronics.add(touchScreenLaptop);
        electronics.add(anotherMobilePhone);

        for (Electronics e : electronics)
        {
            if(e.getDateOfFabrication().isAfter(LocalDate.of(2019,9,12)))
            {
                System.out.println(e);
            }
        }
    }
}