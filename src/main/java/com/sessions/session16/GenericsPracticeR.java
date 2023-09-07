package com.sessions.session16;

import java.util.ArrayList;
import java.util.List;

public class GenericsPracticeR
{
    public static void main(String[] args)
    {
        List<String>  stringList=new ArrayList<>();
        stringList.add("jdfg");

        OrderR<String,Integer> order=new OrderR<>(12,"numele","item name",23);
        System.out.println(order.getItem());

        String[] stringArray={"a","b","c"};
        Integer[] integerArray={1,2,3,4,};
        printArray(stringArray);
        printArray(integerArray);
    }

    private static <E> void printArray(E[] array)
    {
        for(E element:array)
        {
            System.out.println(element);
        }
    }
}

class OrderR<T,U>
{
    private int id;
    private String name;
    private T item;//tipul T e un tip generic de date
    private U category;

    public OrderR(int id,String name,T item,U category)
    {
        this.id=id;
        this.name=name;
        this.item=item;
        this.category=category;
    }
    public T getItem()
    {
        return item;
    }


}
