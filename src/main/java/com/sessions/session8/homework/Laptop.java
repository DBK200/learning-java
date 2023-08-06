package com.sessions.session8.homework;

import java.time.LocalDate;

public class Laptop extends Electronics
{
    private int RAM;
    private Brand brand;
    private double price;
    final private int ID;

    public Laptop()
    {
       super();
       ID = 0;
       brand = Brand.valueOf("Unknown");
       price = 0;
    }
    public Laptop(LocalDate dateOfFabrication, int RAM, Brand brand, double price, int ID)
    {
        super(dateOfFabrication);
        this.RAM = RAM;
        this.brand = brand;
        this.price = price;
        this.ID = ID;
    }

    public int getRAM()
    {
        return RAM;
    }

    public void setRAM(int RAM)
    {
        this.RAM = RAM;
    }

    public Brand getBrand()
    {
        return brand;
    }

    public void setBrand(Brand brand)
    {
        this.brand = brand;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getID()
    {
        return ID;
    }

    @Override
    public String toString()
    {
        return "The Laptop details are displayed bellow\n" +
                "RAM = " + RAM +
                ", Brand = " + brand +
                ", Price = " + price +
                ", ID laptop = " + ID +
                ", Date of fabrication = " + dateOfFabrication + '\n';
    }
}