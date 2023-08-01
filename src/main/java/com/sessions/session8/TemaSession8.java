package com.sessions.session8;

public class TemaSession8 {
    public static class Product {

        private String brandname;
        private int price;
        private boolean isnew;
        private double size;
        private char energy;

        // Constructor for Product
        public Product(String brandname, int price, boolean isnew, double size, char energy) {
            this.brandname = brandname;
            this.price = price;
            this.isnew = isnew;
            this.size = size;
            this.energy = energy;
        }

        // Getters
        public String getBrandname() {
            return brandname;
        }

        public int getPrice() {
            return price;
        }

        public boolean isIsnew() {
            return isnew;
        }

        public double getSize() {
            return size;
        }

        public char getEnergy() {
            return energy;
        }
    }

    public static void main(String[] args) {
        Product myWasher = new Product("Whirlpool", 200, true, 1.5, 'A');
        Product myCar = new Product("Hyundai", 1000, false, 9.3, 'G');

        displayProductInfo(myWasher);
        displayProductInfo(myCar);
    }

    public static void displayProductInfo(Product product) {
        System.out.println("BRAND" + ":" + product.getBrandname());
        System.out.println("COST Only" + ":" + product.getPrice() + " Euro");
        System.out.println("NEW " + (product.isIsnew() ? "WASHER" : "Car"));
        System.out.println("Length" + ":" + product.getSize() + "m");
        System.out.println("Energy CLASS IS" + ":" + product.getEnergy() + "+");
        System.out.println("---------------------------------------------");
    }
}

