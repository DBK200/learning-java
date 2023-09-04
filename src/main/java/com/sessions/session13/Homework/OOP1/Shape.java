package com.sessions.session13.Homework.OOP1;

public class Shape
{
    //Shape: Create a Shape class that has the following attributes:
    // shape name, length, and width. Implement methods for
    //calculating the area and perimeter of the shape.
    private String name;
    private int lenth;
    private int width;
    Shape(String name,int lenth,int width)
    {
        this.name=name;
        this.lenth=lenth;
        this.width=width;
    }
    //metoda cu care calculam aria
    public int aria()
    {
        return lenth*width;
    }
    //metoda cu care calculam perimetru
    public int perimetru()
    {
        return 2*lenth+2*width;
    }
    public static void main(String[] args)
    {
        Shape shape=new Shape("Rectangle",3,2);
        System.out.println("Name:"+shape.name);
        System.out.println("Lenth:"+shape.lenth);
        System.out.println("Width:"+shape.width);
        System.out.println("Aria:"+shape.aria());
        System.out.println("Perimetru:"+shape.perimetru());
    }
}
