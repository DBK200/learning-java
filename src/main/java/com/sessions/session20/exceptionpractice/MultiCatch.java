package com.sessions.session20.exceptionpractice;

public class MultiCatch {
    public static void main(String[] args) {


//    Syntax: To use multi-catch, you specify multiple exception types in a single catch block, separated by the pipe | symbol
//    (| is often referred to as the "or" operator).

//        try {
//            // Code that may throw exceptions
//        } catch (ExceptionType1 | ExceptionType2 | ... |ExceptionTypeN e){
//            // Exception handling code
//        }

//        Order Matters: the order should be from the most specific exception type to the most general.
//        This is because the catch block will catch exceptions in the order they are listed, and
//        once an exception is caught, subsequent catch clauses are not evaluated.

//       Correct order
//      catch(IOException | FileNotFoundException e){ ...}

//      Incorrect order (will result in a compilation error)
//      catch(FileNotFoundException | IOException e){ ...}

//        Effective Final:The caught exception variable (e in the example)is effectively final within the catch
//        block.You cannot reassign it to a new value.


//        try {
//            // Code that may throw exceptions
//        } catch (ExceptionType1 | ExceptionType2 e) {
//            e = new ExceptionType1(); // Not allowed; compilation error
//        }

//        Common Superclass:When catching multiple exceptions, they should have a common superclass or interface.This is
//        because multi -catch requires a common type that can represent all the specified exception types.

//         Correct: IOException and IllegalArgumentException both have Throwable as a common ancestor.
//         catch(IOException | IllegalArgumentException e){ ...}

//         Incorrect: There is no common ancestor between FileNotFoundException and IllegalArgumentException.
//        catch (FileNotFoundException | IllegalArgumentException e) { ...}

//        Resource Cleanup:If you are catching exceptions related to resources (e.g., IOException when working with files), it' s important
//        to ensure proper resource cleanup.You can use try -with - resources for this purpose.

//        try (FileInputStream fis = new FileInputStream("file.txt")) {
//            // Code that reads from the file
//        } catch (IOException e) {
//            // Handle the exception and potentially log it
//        }
        // The FileInputStream is automatically closed when exiting the try block.

//        Avoid Overuse:While multi -catch can simplify code in some cases, it should not be overused.Use it when you
//        genuinely want to handle different exceptions in the same way.Overuse can make your code less readable and
//        maintainable.
    }
}
