package com.sessions.session11.tema.ex4;

public class Area extends Shape
{
    public static void main(String[] args)
    {
        Area object=new Area();
        System.out.print("Aria patratului este: ");
        double squareArea= object.squareArea3(3);
        System.out.println(squareArea);

        System.out.print("Aria dreptunghiului este: ");
        double rectangleArea= object.rectangleArea1(2,4);
        System.out.println(rectangleArea);

        System.out.print("Aria cercului: ");
        double circleArea=object.circleArea2(1);
        System.out.println(circleArea);

    }
    @Override
    public double rectangleArea1(double length,double breadth)
    {
        return length*breadth;
    }
    @Override
    public double circleArea2( double radius)
    {
        return Math.PI * radius * radius;//aici am cautat pe net ca n am stiut cum sa scriu
    }
    @Override
    public double squareArea3(double side)
    {
        return side*side;
    }
}
