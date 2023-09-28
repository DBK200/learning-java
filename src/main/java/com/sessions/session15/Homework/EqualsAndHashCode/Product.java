package com.sessions.session15.Homework.EqualsAndHashCode;

public class Product
{
     //Create a Product class with name, price, and id fields.
    // Implement the equals() method to check only the id field.
    // Implement the hashCode() method to use the id field to calculate the hash code.
    // Test that two instances with the same id return true for equals() and have the same hash code.
    // Then change the id of one instance and test that they are no longer equal and have different hash codes.

    public String name;
    public int price;
    public int idField;

    public Product(String name, int price, int idField)
    {
        this.name = name;
        this.price = price;
        this.idField = idField;
    }

    // Metoda equals() compară două obiecte Product doar pe baza câmpului idField.
    @Override
    public boolean equals(Object object)
    {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Product product = (Product) object;

        return idField == product.idField;
    }

    // Metoda hashCode() calculează codul hash pe baza câmpului idField.
    @Override
    public int hashCode() {
        return idField;
    }

    public static void main(String[] args)
    {
        // Creăm două instanțe de Product cu același idField.
        Product product1 = new Product("Product A", 50, 1);
        Product product2 = new Product("Product B", 60, 1);

        // Testăm metoda equals() pentru egalitate.
        boolean areEqual = product1.equals(product2);
        System.out.println("Are equal: " + areEqual);  // Va afișa "Are equal: true"

        // Testăm metoda hashCode() pentru coduri hash identice.
        System.out.println("HashCode for product1: " + product1.hashCode());
        System.out.println("HashCode for product2: " + product2.hashCode());  // Acestea vor fi identice

        // Schimbăm idField pentru a testa că nu mai sunt egale și au coduri hash diferite.
        product2.idField = 2;

        // Testăm din nou metoda equals() pentru egalitate.
        areEqual = product1.equals(product2);
        System.out.println("Are equal (after changing idField): " + areEqual);  // Va afișa "Are equal: false"

        // Testăm metoda hashCode() pentru coduri hash diferite.
        System.out.println("HashCode for product1 (after changing idField): " + product1.hashCode());
        System.out.println("HashCode for product2 (after changing idField): " + product2.hashCode());  // Acestea vor fi diferite
    }
}
