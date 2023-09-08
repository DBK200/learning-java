package com.sessions.session16;

public class Product {

    private int id;
    private String name;
    private String description;

    public Product(int id,String name,String description){
        this.id=id;
        this.name=name;
        this.description=description;
    }

    @Override
    public String toString(){
        return "Product: id= " +id+" name=" +name+" description= "+ description ;
    }

}
class Practice{

    public static void main(String[] args) {
        Product product=new Product(23,"Laptop","This is a good laptop");
        String result=product.toString();
        System.out.println(result);
    }
}