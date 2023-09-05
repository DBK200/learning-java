package com.sessions.session15.Homework;


public class Rectangle {
    private int width;
    private int height;
    private int id;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    Rectangle(int id, int width, int height) {
        this.width = width;
        this.height = height;
        this.id = id;
    }
    public boolean equals (Object object){
        if (object == null) {
            return false;
        }

        if (object == this) {
            return true;
        }

        if (!(object instanceof Rectangle)) {
            return false;
        }
        Rectangle rectangle1 = (Rectangle) object;

        return id==rectangle1.id && width==rectangle1.width && height==rectangle1.height;
    }
    public int hashCode() {
        return id;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(1,8, 8);
        Rectangle rectangle2 = new Rectangle(1,8,8);
        System.out.println(rectangle1.equals(rectangle2));
        System.out.println(rectangle1.hashCode());
        System.out.println(rectangle2.hashCode());



    }
}
