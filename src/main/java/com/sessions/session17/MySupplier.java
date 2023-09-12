package com.sessions.session17;

public interface MySupplier {
    //The Supplier - an operation that takes no input arguments and returns a result
    String generateDescription();
}

class Practice{
    public static void main(String[] args) {

        MySupplier mySupplier = () -> "asaf";
        System.out.println(mySupplier.generateDescription());
    }
}
