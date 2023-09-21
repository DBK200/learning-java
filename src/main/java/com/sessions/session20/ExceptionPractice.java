package com.sessions.session20;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionPractice {

    public static void main(String[] args) {
        String input = null;
//-------------------------------------
        try {
            trimText(input);
//        } catch (NullPointerException | ArithmeticException e) {
//            logica..handle exception,.;loguri
//        }
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("inside catch block - arithmetic/exception exception");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("inside catch block - runtime");
        } finally { // executes everytime
            System.out.println("closing resources");
            System.out.println("inside finally block");
        }
    }
    private static void trimText(String text) throws NullPointerException {
        // throw si throws
//        throw new NullPointerException();
    }

}
