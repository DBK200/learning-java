package com.sessions.session17;
@FunctionalInterface
public interface MySupplier {

    //The Supplier - an operation that takes no input argument and returns a result

    String generateDescription();

    class Practice{
        public static void main(String[] args) {
            MySupplier mySupplier = () -> "eerereraeraer";
            System.out.println(mySupplier.generateDescription());
        }
    }
}
