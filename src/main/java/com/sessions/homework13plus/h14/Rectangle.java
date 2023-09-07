package com.sessions.homework13plus.h14;

import java.util.HashSet;
import java.util.Set;

public class Rectangle {
    private int width, heigth;

    public Rectangle(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3,4);
        Rectangle r2 = new Rectangle(3,4);

        System.out.println(r1.equals(r2));
        System.out.println(r1.hashCode() +" " + r2.hashCode());

        Set<Rectangle> set = new HashSet<>();
        set.add(r1);
        set.add(r2);
        System.out.println(set.size());



    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    @Override
    public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Rectangle )) {
                return false;
            }
            Rectangle rectangle = (Rectangle) obj;
            return width == rectangle.width && heigth == rectangle.heigth;
    }

    @Override
    public int hashCode() {
        int result = 15;
        result = 28 * result + width;
        result = 28 * result + heigth;
        return result;
    }
}
