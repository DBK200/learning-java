package com.sessions.session20.practice;

import java.io.FileNotFoundException;

public class Exceptions {
    public static void main(String[] args) throws FileNotFoundException {
        String input = " a";//null;
        // Throws an exception: line 12 -> line 7
        try {
            trimText(input);
        }

//        // Single catch
//        catch(RuntimeException e){
//            if (e instanceof ArithmeticException) System.out.println("Arithmetic exception message: " + e.getMessage());
//            else System.out.println(e.getMessage());
//        }

        // Multi-catch. The same logic is used
        // When trying to use a Superclass -> error: they must be disjointed
        // e.g.,  catch(NullPointerException | RuntimeException)
        catch(NullPointerException | ArithmeticException e){
            System.out.println("Message: " + e.getMessage());
            System.out.println("NullPointerException or ArithmeticException");
        }
        // Catches the rest of exceptions, different from above
        catch (RuntimeException e){
            System.out.println("Message: " + e.getMessage());
            System.out.println("A RuntimeException, different than NullPointerException or ArithmeticException");
        }
        finally {
            System.out.println("End of block declaration. Always runs");
        }

    }

    private static void trimText(String text) { //throws FileNotFoundException {
        // This will throw a NullPointerException
        text.trim();
        // This will force throw an ArithmeticException
        throw new ArithmeticException();
    }
}
