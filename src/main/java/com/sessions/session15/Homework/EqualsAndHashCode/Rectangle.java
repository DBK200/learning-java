package com.sessions.session15.Homework.EqualsAndHashCode;

public class Rectangle
{

    //Implement the equals() and hashCode() methods for a Rectangle class with width and height
    //    // fields. Test that two instances with the same width and height return true for equals()
    //    // and have the same hash code.
    public int width;
    public int height;

    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    // Metoda equals() compară două obiecte Rectangle doar pe baza câmpurilor width și height.
    @Override
    public boolean equals(Object object)
    {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Rectangle rectangle = (Rectangle) object;

        return width == rectangle.width && height == rectangle.height;
    }

    // Metoda hashCode() calculează codul hash pe baza câmpurilor width și height.
    @Override
    public int hashCode()
    {
        int result = width;
        result = 31 * result + height;
        return result;
    }

    public static void main(String[] args)
    {
        // Creăm două instanțe de Rectangle cu aceeași lățime și înălțime.
        Rectangle rectangle1 = new Rectangle(10, 20);
        Rectangle rectangle2 = new Rectangle(10, 20);

        // Testăm metoda equals() pentru egalitate.
        boolean areEqual = rectangle1.equals(rectangle2);
        System.out.println("Are equal: " + areEqual);  // Va afișa "Are equal: true"

        // Testăm metoda hashCode() pentru coduri hash identice.
        System.out.println("HashCode for rectangle1: " + rectangle1.hashCode());
        System.out.println("HashCode for rectangle2: " + rectangle2.hashCode());  // Acestea vor fi identice
    }
}
