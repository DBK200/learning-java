package com.sessions.session20;

public class ExceptionPracticeR
{
    /*
                                Exceptii
        -este un obiect sau o clasa,sunt folosite pt a face handle la erori,ele intrerup  si indica o problema
        -aplicatia este mai stabila,codul este mai citibil,incurajeaza un design modular
        -sunt doua tipuri:

        A-checked-IoEXCEPTION(trebuie sa fie declarate)-care trebuie tratat ca sa functioneze
                           1.SQL
                           2.FileNotFoundException
        B-unchecked-RunTimeEXCEPTION(nuu trebuie sa fie declarate)-nu trebuie neaparat sa le prindem cu try.. catch
                           1.NullPointerException
                           2.ArrayIndexOutOfBounds
                           3.IllegalArgumentException

        Exception hierarchy-Throwable class are doua clase :Error si Exception

        Exception handaling-1.try-catch block
                           -2.catch block with multiple exception types.
                              REGULI:1-Tipuri de exceptie trebuie sa nu fie o subclasa
                                     2-"or" |
                                     3-ordinea conteaza ,incepem cu cele mai specifice
                                     4-daca folosim resurse e imp sa inchidem resursa la final
                           -3.finally block-este plasata dupa try-catch,folosit sa inchidem resurse
                           -4.try-with-multi-catch

                                Erori
        -sunt probleme mai serioase ,situatii pe care aplicatia nu ar trebui sa le prinda si sa le anticipeze
        -
        -

     */

    public static void main(String[] args)
    {
        String input=null;

        //try-catch block

        try {
            //in try avem codul care s ar putea sa arunce o exceptie
            trimText(input);
        }catch (RuntimeException e)
        {
            //facem handle la exceptie
            System.out.println("1:");
            System.out.println(e.getMessage());
        }

        //catch block with multiple exception types
        try{
            trimText(input);
        }catch (NumberFormatException | ArithmeticException e)
        {
            System.out.println("2:");
            System.out.println(e.getMessage());
            System.out.println("inside catch block");
        }

        //finally block-ruleaza mereu
        try{
            trimText(input);
        }catch (ArithmeticException e)
        {
            System.out.println("3:");
            System.out.println(e.getMessage());
            System.out.println("inside catch block");
        }finally {
            System.out.println("Closing resources");
            System.out.println("inside finally block");
        }

        //try-with-multiples-catch uri
        try{
            trimText(input);
        }catch (NullPointerException e) {
            System.out.println("4:");
            System.out.println(e.getMessage());
            System.out.println("inside catch block-NullPointer exception");
        }catch (ArithmeticException e) {
            System.out.println("4");
            System.out.println(e.getMessage());
            System.out.println("inside catch block-arithmetic exception");
        }



    }
    private static void trimText(String text)
    {
        //trows-instantiaza un nou obiect
        //trow-arunca o exceptie
        throw new ArithmeticException();
        //text.trim();
    }

}
