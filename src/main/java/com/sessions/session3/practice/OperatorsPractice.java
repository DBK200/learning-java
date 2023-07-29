package com.sessions.session3.practice;

public class OperatorsPractice {

    public static void main(String[] args) {

        //post-unary operators expression++, expression--
//        int x = 0;
//        int y = x++;
//        System.out.println("x = " + x);
//        System.out.println("y = " +y);

        //pre-unary operators ++expression, --expression
//        int x = 0;
//        int y = ++x;
//        System.out.println("x = " + x);
//        System.out.println("y = " +y);
//
//        x += 2;
//        System.out.println("x = " + x);

        //other unary operators +,-,!
//        int x = 1;
//        int y = -x;
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//
//        boolean z = true;
//        boolean w = !z;
//        System.out.println("x = " + z);
//        System.out.println("y = " + w);

        //Multiplication/Division/Modulus *, /, %
//        int x = 3;
//        int y = 2;
//        System.out.println(x * y); // order of operations
//        System.out.println( x % y);

        //Addition/Subtraction +, -
//        int x = 2 + 3 - 1;
//        System.out.println(x);
//
//        int x = 2 * 5 + 3 * 4 - 8;
//        System.out.println(x);
//
//        x = 2 * (5 + 3) * (4 - 8);
//        System.out.println(x);
//
//        x = 2 * (5 + 3 * (4 - 8));
//        System.out.println(x);

        //NUMERIC PROMOTIONS
        // 1 .If two values have different data types, Java will automatically promote one of the values
        //to the larger of the two data types.

//        int x = 2; // range from –2,147,483,648 to 2,147,483,647. (4bytes)
//        long y = 3; // range –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (8bytes)

//        int sum = x + y; //does not compile
//        long sum = x + y;
//        System.out.println(sum);


        // 2. If one of the values is integral and the other is floating-point, Java will automatically
        //promote the integral value to the floating-point value’s data type.
//        int x = 2;
//        double y = 3.2;
//        double sum = x+y;
//        System.out.println(sum);

        //3. Smaller data types, byte, short, and char, are first promoted to int any time
        //they’re used with a Java binary arithmetic operator, even if neither of the operands is
        //int.
//        short x = 1;
//        short y = 2;
//        short sum = x + y; //does not compile
//        int sum = x + y;
//        System.out.println(sum);

        //4. After all promotion has occurred and the operands have the same data type, the resulting
        //value will have the same data type as its promoted operands.
//        float result1 = 2 + 3L + 2.3f;
//        double result2 = 2 + 3L + 2.3f + 3.4;

// ----------------------------------------------------------------------------
        //CASTING PRIMITIVE VALUES -
        // convert from floating-point to integral value
//        int x = 1.0; // does not compile
//        int x = (int) 1.0;
        //going from a larger numerical data type to a smaller numerical data type
//        int x = (int) 1l;
//        System.out.println(x);

        //Overflow
//        long x = 40000;
//        System.out.println("Long value is " + x);
//        short y = (short) x; // short minimum value of -32,768 and a maximum value of 32,767
//        System.out.println("Short value is " + y);

//        System.out.println(2147483647+1); // 2147483647 is the maximum int value, -2147483648
//        System.out.println(2147483647+2);
//        System.out.println(10^(-100)); // 2147483647 is the maximum int value, -2147483648

        //Underflow
//        double x = Math.pow(2, -1074);
//        System.out.println(x);
//        x = Math.pow(2, -1075);
//        System.out.println(x);
//        x = Math.pow(2, -1076);
//        System.out.println(x);



// ----------------------------------------------------------------------------
        //Relational operators <, >, <=, >=, instanceof
        //Equal to/not equal to ==, !=
        //Logical operators &, ^, |
//        boolean x = true | false;
//        System.out.println(x);
//
//        boolean y = true & true;
//        System.out.println(y);
//
//        boolean z = true ^ false;
//        System.out.println(z);

        //Short-circuit logical operators &&, ||
//        int x = 0;
////        boolean y = true | 1<++x;
//        boolean y = true || 1<++x;
//        System.out.println(y);
//        System.out.println(x);

        //Ternary operators boolean expression ? expression1 : expression2
//        String x = 3 < 2 ? "rosu" : "albastru";
//        System.out.println(x);

        //Assignment operators =, +=, -=, *=, /=, %=, &=, ^=, !=, <<=, >>=, >>>=
//        int x = 1;
//        System.out.println(x);
//        x += 2; // x=x+2;
//        System.out.println(x);

        //Shift operators <<, >>, >>>
//        int x=1; //1 is 0001 in binary,
//        System.out.println(x << 1); // shift 1 bit to left means 0010 which is 2
//        System.out.println(x << 2); // shift 2 bits to left means 0100 which is 4

    }

}
