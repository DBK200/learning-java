package com.sessions.session17;

public class BookR
{
    private String tittle;
    BookR(String tittle)
    {
        this.tittle=tittle;
    }
    public String getTittle()
    {
        return tittle;
    }
}

class AnonymousClassR
{
    public static void main(String[] args)
    {
        BookR book=new BookR("Leaders eat last")
        {
            public String getTittle()
            {
                return "I can not find the tittle";
            }
        };

        //Anonymous class
//        PrinterR printer=new PrinterR()
//        {
//            @Override
//            public void printStuff()
//            {
//                System.out.println("Printing some stuff...");
//            }
//        };
//
//        printer.printStuff();

        PrinterR printer=stuff->stuff+" printed in the console...";
        System.out.println(printer.printStuff("ceva de printat"));



    }
}
