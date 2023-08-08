package com.sessions.session8.homeworkOOP1;

import java.time.LocalDate;

public class MobilePhone extends Electronics
{
    private PhoneBrand phoneBrand;
    private double price;
    private boolean hasHDVideoCamera;
    private final int phoneID;
    private static int nrOfPhones = 0;

    public MobilePhone()
    {
        super();
        phoneBrand = PhoneBrand.valueOf("Unknown");
        price = 0;
        hasHDVideoCamera = false;
        phoneID = ++nrOfPhones;
    }
    public MobilePhone(LocalDate dateOfFabrication, PhoneBrand phoneBrand, double price, boolean hasHDVideoCamera)
    {
        super(dateOfFabrication);
        this.phoneBrand = phoneBrand;
        this.price = price;
        this.hasHDVideoCamera = hasHDVideoCamera;
        this.phoneID = ++nrOfPhones;
    }

    public PhoneBrand getBrand()
    {
        return phoneBrand;
    }

    public void setBrand(PhoneBrand laptopBrand)
    {
        this.phoneBrand = laptopBrand;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public boolean isHasHDVideoCamera()
    {
        return hasHDVideoCamera;
    }

    public void setHasHDVideoCamera(boolean hasHDVideoCamera)
    {
        this.hasHDVideoCamera = hasHDVideoCamera;
    }

    public int getPhoneID()
    {
        return phoneID;
    }

    public static int getNumberOfPhones()
    {
        return nrOfPhones;
    }

    @Override
    public String toString()
    {
        return  "The ID of the moblie phone is: " + phoneID
                + "\nThe phone brand is: " + phoneBrand
                + "\nThe price of the phone is: " + price + "$\n"
                + "Video camera HD: " + hasHDVideoCamera
                + super.toString();
    }
}