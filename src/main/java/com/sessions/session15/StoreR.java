package com.sessions.session15;

public class StoreR
{
    String name;
    private int noOfEmployess;
    public StoreR(String name,int noOfEmployess)
    {
        this.name=name;
        this.noOfEmployess=noOfEmployess;
    }

    @Override
    public boolean equals(Object obj)
    {
        StoreR store=(StoreR)obj;
        return name.equals(store.name)&&noOfEmployess==store.noOfEmployess;
    }

    @Override
    public int hashCode()
    {
        return noOfEmployess;
    }
}
class HashCode
{
    public static void main(String[] args)
    {
        StoreR store1=new StoreR("Magazin1",3);
        StoreR store2=new StoreR("Magazin1",3);
        System.out.println(store1.equals(store2));
        System.out.println(store1.hashCode());
        System.out.println(store2.hashCode());

    }
}

