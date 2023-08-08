package com.sessions.session8.homeworkOOP1;

import java.time.LocalDate;

public class LaptopWithTouchScreen extends Laptop
{
    private boolean hasSoftTouch;

    public LaptopWithTouchScreen()
    {
        super();
        this.hasSoftTouch = false;
    }

    public LaptopWithTouchScreen(LocalDate dateOfFabrication, int RAM, LaptopBrand laptopBrand, double price, int ID, boolean hasSoftTouch)
    {
        super(dateOfFabrication, RAM, laptopBrand, price, ID);
        this.hasSoftTouch = hasSoftTouch;
    }

    public boolean isHasSoftTouch()
    {
        return hasSoftTouch;
    }

    public void setHasSoftTouch(boolean hasSoftTouch)
    {
        this.hasSoftTouch = hasSoftTouch;
    }

    @Override
    public String toString()
    {
        return super.toString() +
                "Laptop has the soft touch screen function: " + hasSoftTouch + '\n';
    }
}