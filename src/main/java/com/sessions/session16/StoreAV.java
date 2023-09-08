package com.sessions.session16;

public class StoreAV {
    private String name;
    private int noOfEmployees;
    public StoreAV(String name, int noOfEmployees) {
        this.name = name;
        this.noOfEmployees = noOfEmployees;
    }

    @Override
    public boolean equals (Object object) {
        //check if null...
        //check if the same object
        StoreAV store = (StoreAV) object;
        return name.equals(store.name) && noOfEmployees == store.noOfEmployees;
    }

    @Override
    public int hashCode() {
        return name.length() + noOfEmployees;
    }
}

class HashCodePractice {
    public static void main(String[] args) {

        StoreAV store1 = new StoreAV("magazin1", 3);
        StoreAV store2 = new StoreAV("magazin2", 6);

        System.out.println(store1.equals(store2));
        System.out.println(store1.hashCode());
        System.out.println(store2.hashCode());
    }
}
