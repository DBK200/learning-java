package com.sessions.session3;

/*
//
//    === Session 03 Challenge ===
//
//    1. Make sure you are seeing in IntelliJ your main branch (right corner down)
//    2. Create a new git branch called operators–nume-
//    3. Create a new package called java_operators
//    4. Practice with the operators learned in this session
//    5. Do all the git flow (git add/commit/push) so your branch java-operators-challenge
//       to be pushed to the remote repository from  GitHub.
//    6. Create a pull request and give me the link of that request, so I can make a code
//       review or give me the branch name
//
*/

public class JavaOperatorsChallenge {

    public static void main(String[] args) {

        /*-----------------
         |  Type Casting  |
         -----------------*/

        // Java defaults the data type to an [int],
        // but the compiler can guess the result.
        short shortValue1 = 1;

        // In this case, the compiler can't guess the result,
        // because 2 is set by default by Java to be [int] =>
        // [shortValue1] will be promoted to an [int] as well =>
        // expression is an [int] assigned to a [short],
        // thus the compiler error.
//        short shortValue2 = shortValue1 / 2; // error here

        // this can be solved by casting
        short shortValue3 = (short) (shortValue1 / 2); // no error here

        // The same goes if the literal number is grater than
        // the maximum integer (i.e., 2.147.483.647).
        // In this case, the literal value must be
        // suffixed with "L" to remove the error.
//        long longValue1 = 2_147_483_648;   // error here
        long longValue2 = 2_147_483_648L;  // no error here


        // Java defaults floating point literals
        // to data type [double].
        // Next declaration throws an error
//        float floatValue1 = 1.0; // error here

        // this can be solved by casting or
        // adding the suffix "f".
        float floatValue2 = (float) 1.0;  // no error here
        float floatValue3 = 1.0f;         // no error here


        /*---------------------
        |  Ternary Operator  |
        ---------------------*/

        int iIncrement = 15;
        int iSpeed = 10;
        iSpeed += (iIncrement > 0) ? iIncrement : 0;

        // this can be written with if-else
        if (iIncrement > 0) {
            iSpeed += iIncrement;
        }
        else {
            iSpeed += 0;
        }

        /*---------------
        |  Expressions  |
        ----------------*/

        // next declaration sets an array with
        // 2 null elements, because String is not a
        // primitive type.
        // Primitive types are initialised with values {0} or {false}.
        String arStrValues[] = new String[2];

        if (arStrValues[0] == null || arStrValues[1] == null) {
            System.out.println("[arStrValues] array has empty element(s)!");
        }
        else {
            System.out.printf("[arStrValues] array has %d elements.%n", arStrValues.length);
        }

        // next, because is primitive type,
        // array's elements will be initialised with 0
        int arIntValues[] = new int[2];
        if (arIntValues[0] == 0 && arIntValues[1] == 0) {
            System.out.println("[arIntValues] array has all elements empty!");
        }
        else {
            System.out.printf("[arIntValues] array has %d elements.", arIntValues.length);
        }

    }
}
