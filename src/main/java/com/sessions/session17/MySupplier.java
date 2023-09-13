package com.sessions.session17;

public interface MySupplier {
    //The Supplier-an operation than takes no input arguments and returns a result
    String generateDescription();
}

interface MyConsumer {
    //The Consumer- an operation than takes a single input argument and returns no result
    void printArea(int a);
}

interface MyFunction {
    //The Functions-an operation that takes a single input argument and returns a result
    int squareNumber(int x);
}
interface MyPredicate{
    //The Predicates -aboolean operation than takes a single input argument
    boolean checkSize(String str);
}

class Practice {

    public static void main(String[] args) {
        //Supplier
        MySupplier mySupplier = () -> "egsrhtjjhdgd";
        System.out.println(mySupplier.generateDescription());
        //Constructor
        MyConsumer myConsumer = (int a) -> {
            System.out.println("The area is : " + a);
        };
        myConsumer.printArea(62);
        //Functions
        MyFunction myFunction = x -> x * x;
        System.out.println(myFunction.squareNumber(4));
        //Predicates
        MyPredicate myPredicate=str -> str.length()>0;
        System.out.println(myPredicate.checkSize("FDGFH"));
    }

}
