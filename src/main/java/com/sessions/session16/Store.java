package com.sessions.session16;

public class Store {

    private String name;
    private int noOfEmployees;

    public Store(String name, int noOfEmployees){
        this.name=name;
        this.noOfEmployees=noOfEmployees;
    }

    public boolean equals(Object object){
        //check if null..
        // check if is the same object
        Store store=(Store) object;
        return name.equals(store.name) && noOfEmployees == store.noOfEmployees;
    }

    public int hashCode(){
        return name.length();
    }
}

class HashCodePractice{
    public static void main(String[] args) {
        Store store1= new Store("magazin12", 3);
        Store store2= new Store("magazin1", 3);
        System.out.println(store1.equals(store2));
        System.out.println(store1.hashCode());
        System.out.println(store2.hashCode());
    }

}
