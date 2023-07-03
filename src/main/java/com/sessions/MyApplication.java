package com.sessions;

public class MyApplication {

    /**
     * This method is the entry point of the Java application
     * public - access modifier (it can also be private default or protected)
     * static - a java keyword, it means that the method is static
     * - belongs to the class rather than the object of a class
     * - can be invoked without the need for creating an instance of a class
     * - an access static data member and can change the value of it
     * void - the return type of the method, void means that it doesn't return anything
     * main - the name of the method
     * String[] - an array [] of type String
     *
     * @param args parameter of the method
     */

    public static void main(String[] args) {

        Laptop myLaptop=new Laptop();
        myLaptop.setDisplaySize(14);
        myLaptop.setHasSSD(true);
        myLaptop.setPrice(200);
        myLaptop.setNew(true);
        System.out.println(myLaptop.getPrice());
        System.out.println(myLaptop.getDisplaySize());
        System.out.println(myLaptop.getHasSDD());
        System.out.println(myLaptop.isNew());
        System.out.println("Price with discount: " + myLaptop.applyDiscount(2));

        Phone myPhone=new Phone();
        myPhone.setDisplaySize(7);
        myPhone.setBrandName("SAMSUNG");
        myPhone.setPrice(150);
        System.out.println(myPhone.getPrice());
        System.out.println(myPhone.getDisplaySize());
        System.out.println(myPhone.getBrandName());


        TV myTV=new TV();
        myTV.setHas4K(true);
        myTV.setBrandName("LG");
        myTV.setPrice(250);
        myTV.setYearOfFabrication(2022);
        System.out.println(myTV.getPrice());
        System.out.println(myTV.getScreenSize());
        System.out.println(myTV.getAllDetails());

        System.out.println("testing something else");
        System.out.println("some updates");
        System.out.println("some more updates");


    }


}
