package com.sessions.session23.structural.FacadePattern;

public class ShapeMaker {
    public static void main(String[] args) {
        DrawService drawService = new DrawService();
        drawService.draw("blue","circle",1);


    }
}
class Line{
    public void chooseLineThickness(int pixels){
        System.out.println("Thickness is " +pixels);
    }

}
class Color{
    public void chooseColor(String color){
        System.out.println("Color is " +color);
    }
}
class Shape{
    public void getShape(String shape){
        System.out.println("Shape is "+shape);
    }

}

class DrawService {
    private final Line lineObject = new Line();
    private final Color colorObject = new Color();
    private final Shape shapeObject = new Shape();

    public void draw(String color, String shape, int pixels){
        lineObject.chooseLineThickness(pixels);;
        colorObject.chooseColor(color);
        shapeObject.getShape(shape);
    }
}