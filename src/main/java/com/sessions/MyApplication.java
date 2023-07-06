package com.sessions;

public class MyApplication {

    public static void main(String[] args) {

        //post-unary operators expression++, expression--
//            int x = 2;
//        System.out.println(x--); // output 2, x = x +1
//        System.out.println(++x);
//        System.out.println(x); //output 3



        //pre-unary operators ++expression, --expression
//            int y = 0;
//            ++y;
//        System.out.println(y);

        // +, - , !
//        int x = 2;
//        int y = -x;
//        System.out.println(y);
//
//        boolean x = 1<3;
//        System.out.println(x);
//        boolean y = !x;
//
//        System.out.println(y);

        // binary operators *, /, +, -
//        int x = 2 + 3;
//        System.out.println(x);

//        int x = 3 % 2;
//        System.out.println(x);
//        int y = 4 / 2;
//        System.out.println(y);

//        int x = 1 * 2 + 3 / 6;

        //NUMERIC PROMOTIONS
        // 1 .If two values have different data types, Java will automatically promote one of the values
        //to the larger of the two data types.

//        int x = 2;
//        long y = 3;
//        long sum = x + y;

        // 2. If one of the values is integral and the other is floating-point, Java will automatically
        //promote the integral value to the floating-point value’s data type.
//        long x = 2;
//        float y = 2.2345f;
        // long z = x + y; <- does not compile
//        System.out.println(x + y);

        //3. Smaller data types, byte, short, and char, are first promoted to int any time
        //they’re used with a Java binary arithmetic operator, even if neither of the operands is
        //int.
//        short x = 1;
//        short y = 2;
//        int sum = x + y;

        //4. After all promotion has occurred and the operands have the same data type, the resulting
        //value will have the same data type as its promoted operands.
//        float result1 = 2 + 3L + 2.3f;
//        double result2 = 2 + 3L + 2.3f + 3.4;

        //Casting primitive variables
//        int x = (int)1.0; // from floating point to integer
//        System.out.println(x);

//        long x = 1;
//        long x = 1;
//        int y = (int) x;

//        long x = 400000;
//        short y = (short) x; // short minimum value of -32,768 and a maximum value of 32,767
//        System.out.println(y);
        //int -2147483647 si +214748364
//        System.out.println(2147483647 + 1); // 2147483647 is the maximum int value, -2147483648

        //Underflow
//        double x = Math.pow(2, -1074);
//        System.out.println(x);
//        x = Math.pow(2, -1075);
//        System.out.println(x);
//        x = Math.pow(2, -1076);
//        System.out.println(x);

        //Relational operators <, >, <=, >=, instanceof
        //Equal to/not equal to ==, !=
        //Logical operators &, ^, |

//        String x = "my string";
//        System.out.println( x instanceof String);

//        int x = 1;
//        boolean myBoolean = 2 == 2;
//
//        boolean y = true;
//        boolean z = x < 23;
//        System.out.println(y | z);

        //Short-circuit logical operators &&, ||
//        int x = 0;
//        boolean y = true | 1<++x;

//        boolean hasDiscout = true || 1 < ++x;
//        System.out.println(y);
//        System.out.println(x);

        //ternary operators
//        int price = 2;
        //  conditie logica ? "daca conditia e adevarata" : "daca conditia este falsa"
//        String car =  price > 3 ? "Trabant" : "Ferrari";
//        System.out.println(car);

        //assignment operators
//        int x = 2;
////        x = x + 2;
//        x *=3; // x = x * 3
//        System.out.println(x);

        //Shift operators <<, >>, >>>
//        int x=1; //1 is 0001 in binary,o
//        System.out.println(x << 1); // shift 1 bit to left means 0010 which is 2
//        System.out.println(x << 2); // shift 2 bits to left means 0100 which is 4

        //equality
        // == compares two objects based on memory reference
        //.equals() method does a content comparison
        String x = "test";
        String y = "test";
        System.out.println(x == y);

//        String x = new String("test");
//        String y = new String("test");
//        System.out.println(x==y);

    }

}
