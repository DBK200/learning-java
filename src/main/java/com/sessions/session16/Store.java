package com.sessions.session16;

public class Store {

    private String name;
    private int noOfEmployees;

    public Store(String name, int noOfEmployees){
        this.name = name;
        this.noOfEmployees = noOfEmployees;
    }

    public boolean equals(Object object){
        if(object==null){
            return false;
        }
        if(this==object){
            return true;
        }

        // object trebuie transformat in store
        Store store = (Store) object;
        return name.equals(store.name) && noOfEmployees==store.noOfEmployees;
    }

    // doua obiecte egale au acelasi hashcode, dar daca doua obiecte au acelasi hashcode nu
    // inseamna neaparat ca sunt egale
    public int hashCode(){
        return name.length() + noOfEmployees;
    }
}

class HashCodePractice{
    public static void main(String[] args) {
        Store store1 = new Store("magazin12", 3);
        Store store2 = new Store("magazin1", 3);
        System.out.println(store1.equals(store2));
        System.out.println(store1.hashCode());
        System.out.println(store2.hashCode());

    }
}
