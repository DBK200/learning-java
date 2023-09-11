package com.sessions.session17;
@FunctionalInterface
public interface MyPredicates
{
    //The Predicates - a boolean-valued operation that takes a single input argument\

    boolean checkSize(String str);

}
class Practice
{
    public static void main(String[] args)
    {
        MyPredicates predicates=(String x)->x.length()>0;
        System.out.println(predicates.checkSize("jdh"));
        System.out.println(predicates.checkSize("jddash"));
        System.out.println(predicates.checkSize("jdhadfdsg"));
    }
}
