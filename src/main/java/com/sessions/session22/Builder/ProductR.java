package com.sessions.session22.Builder;

public class ProductR
{
    /*
    //la ce foloseste builder:
    putem apela de mai multe ori aceleasi propietati
    daca eu am un obiect si nu are o variabila,cu constructor trebuie sa faci mai multe

     */
    private String name;
    private int price;
    private String description;
    private int starReview;
    private String type;
    private long id;
    private ProductR(String name,int price,String description,int starReview,String type,long id)
    // este privat ca sa poata fi apelat doar de builder

    {
        this.description=description;
        this.id=id;
        this.name=name;
        this.starReview=starReview;
        this.price=price;
        this.type=type;

    }

    public String getName()
    {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStarReview() {
        return starReview;
    }

    public String getType() {
        return type;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }


    public static  class ProductBuilderR
    {
        private String name;
        private int price;
        private String description;
        private int starReview;
        private String type;
        private long id;
        public static ProductBuilderR productBuilderR()
        {
            return new ProductBuilderR();//returneaza o instanta a clasei builder//
        }


       public  ProductBuilderR withName(String name)//seteaza valoarea ca un setter
       {
           this.name=name;
           return this;//returnam productBuilder
       }
        public  ProductBuilderR withPrice(int price)
        {
            this.price=price;
            return this;
        }
        public ProductBuilderR withType(String type)//returneaza o instanta a clasei curente
        {
            this.type=type;
            return this;
        }
        public  ProductBuilderR withId(Long id)
        {
            this.id=id;
            return this;
        }
        public  ProductBuilderR withDescription(String description)
        {
            this.description=description;
            return this;
        }
        public  ProductBuilderR withStarReview(int starReview)
        {
            this.starReview=starReview;
            return this;
        }
        public ProductR build()//care returneaza produsul ,apeleaza contructorul si ne creeaza un obiect
        {
            return new ProductR(name,price,description,starReview,type,id);
        }
    }
}


class TestR
{
    public static void main(String[] args)
    {
        //apelam builderul
        ProductR iphone=ProductR.ProductBuilderR.productBuilderR()
                .withName("11")
                .withPrice(2333)
                .withId(2L)
                .withType("ksksbf")
                .withStarReview(4)
                .build();//asta returneaza productul
        System.out.println(iphone);

        ProductR tv=ProductR.ProductBuilderR.productBuilderR()
                .withName("Samsung")
                .withDescription("This is a tv")
                .withType("TV")
                .withPrice(2000)
                .withId(32L)
                .build();
    }
}
