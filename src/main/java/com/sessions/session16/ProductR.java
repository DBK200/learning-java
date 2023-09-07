package com.sessions.session16;

public class ProductR
{
    private int id;
    private String name;
    private String description;

    public ProductR(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product:" + " id=" + id + " name=" + name + " description= " + description;
    }
}

    class PracticeR
    {
        public static void main(String[] args)
        {
            ProductR product=new ProductR(23,"laptop","this is a good laptop");
            String result=product.toString();
            System.out.println(result);
        }
    }



