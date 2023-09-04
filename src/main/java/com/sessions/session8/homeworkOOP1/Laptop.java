package com.sessions.session8.homeworkOOP1;

import java.time.LocalDate;

public class Laptop extends Electronics
{
    private int RAM;
    private LaptopBrand laptopBrand;
    private double price;
    final private int ID;

    public Laptop()
    {
       super();
       ID = 0;
       laptopBrand = LaptopBrand.valueOf("Unknown");
       price = 0;
    }
    public Laptop(LocalDate dateOfFabrication, int RAM, LaptopBrand laptopBrand, double price, int ID)
    {
        super(dateOfFabrication);
        this.RAM = RAM;
        this.laptopBrand = laptopBrand;
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

    public LaptopBrand getBrand()
    {
        return laptopBrand;
    }

    public void setBrand(LaptopBrand laptopBrand)
    {
        this.laptopBrand = laptopBrand;
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
                ", Brand = " + laptopBrand +
                ", Price = " + price +
                ", ID laptop = " + ID + '\n' +
                super.toString();
    }
}