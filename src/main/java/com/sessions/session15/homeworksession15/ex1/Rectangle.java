package com.sessions.session15.homeworksession15.ex1;

// 1. Implement the equals() and hashCode() methods for a Rectangle class
// with width and height fields. Test that two instances with the same width
// and height return true for equals() and have the same hash code

public class Rectangle {

    private int width;
    private int height;

    // All args constructor
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }


    // Getters and setters
    // Getters
    public int getWidth(int width){
        return width;
    }

    public int getHeight(){
        return height;
    }

    // Setters
    public void setWidth(int width){
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    // override equals() method

    public boolean equals(Object object){
        if(object==null){
            return false;
        }

        if(this==object){
            return true;
        }

        Rectangle rectangle = (Rectangle) object;
        return width==rectangle.width && height==rectangle.height;
    }

    // hashcode()
}
