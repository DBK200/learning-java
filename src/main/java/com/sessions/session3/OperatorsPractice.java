package com.sessions.session3;

public class OperatorsPractice
{
    public static void main(String[] args)
    {
//post-unary operators expression++, expression--

        int x=0;
        int y=2;
        int z=y++;
        int r=x--;
        System.out.println(x++);
        System.out.println(y++);
        System.out.println(r);
        System.out.println("x= " +y);


        //pre-unary operators ++expression, --expression

        int f=0;
        f+=4;
        System.out.println("f = " + x);


        //other unary operators +,-,!
        int j = -x;
        int V=j;
        System.out.println("x = " + x);
        System.out.println("V=");
        System.out.println(V);


        //Multiplication/Division/Modulus *, /, %

        int s = 4;
        int w = 9;
        System.out.print("s*w=");
        System.out.println(s*w);
        System.out.print("s%2=");
        System.out.println( s % 2);
        System.out.print("s/w=");
        System.out.println(s/w);


        //Addition/Subtraction +, -

        int t=4*3+8/2-5*3;
        int l=3-8+4/8*4;
        System.out.print("t=");
        System.out.println(t);
        System.out.print("l=");
        System.out.println(l);


        //NUMERIC PROMOTIONS
        // 1 .If two values have different data types, Java will automatically promote one of the values
        //to the larger of the two data types.
//        int x = 2; // range from –2,147,483,648 to 2,147,483,647. (4bytes)
//        long y = 3; // range –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (8bytes)
//        int sum = x + y; //does not compile

        double p=3;
        long k=3;
        double sum=p+k;
        double produs=p*k;
        System.out.print("suma=");
        System.out.println(sum);
        System.out.print("produs=");
        System.out.println(produs);



        // 2. If one of the values is integral and the other is floating-point, Java will automatically
        //promote the integral value to the floating-point value’s data type.
        int u = 1;
        double q = 6.2;
        double suma = u+q;
        System.out.print("suma=");
        System.out.println(suma);


        //3. Smaller data types, byte, short, and char, are first promoted to int any time
        //they’re used with a Java binary arithmetic operator, even if neither of the operands is
        //int.

        short m = 3;
        short b = 2;
        int c=3;
        double e=6;
        //short scadere = m - b; //does not compile
        int scadere = m - b ;
        double sumaaa=c+e;
        System.out.print("Scadere=");
        System.out.println(scadere);
        System.out.print("Suma=");
        System.out.println(sumaaa);


        //4. After all promotion has occurred and the operands have the same data type, the resulting
        //value will have the same data type as its promoted operands.
        float result1 = 2 + 3L + 2.3f;
        double result2 = 2 + 3L + 2.3f + 3.4;
        long result3=2+5*6+4L+3;
        int result4=3+7-8/3-8*4;
        short result5=1+2_1+1*1-1/1;



// ----------------------------------------------------------------------------
        //CASTING PRIMITIVE VALUES -
        // convert from floating-point to integral value
        //int X = 1.0; // does not compile
        int X = (int) 1.0;
        //going from a larger numerical data type to a smaller numerical data type
        int G = (int) 1l;
        System.out.print("G=");
        System.out.println(G);

        //Overflow
        long Y = 40000;
        System.out.println("Long value is " + x);
        short I = (short) x; // short minimum value of -32,768 and a maximum value of 32,767
        System.out.println("Short value is " + y);

//        System.out.println(2147483647+1); // 2147483647 is the maximum int value, -2147483648
//        System.out.println(2147483647+2);
//        System.out.println(10^(-100)); // 2147483647 is the maximum int value, -2147483648


        //Underflow
        double J = Math.pow(2, -1074);
        System.out.print("J=");
        System.out.println(J);
        double  N = Math.pow(2, -1075);
        System.out.print("N=");
        System.out.println(N);
        double  L = Math.pow(2, -1076);
        System.out.print("L=");
        System.out.println(L);



// ----------------------------------------------------------------------------
        //Relational operators <, >, <=, >=, instanceof
        //Equal to/not equal to ==, !=
        //Logical operators &, ^, |
        boolean B = true | false;
        boolean M=true & false;
        boolean W = true ^ true;
        System.out.print("B=");
        System.out.println(B);
        System.out.print("M=");
        System.out.println(M);
        System.out.print("W=");
        System.out.println(W);


        //Short-circuit logical operators &&, ||
        int d = 0;
        boolean D = true | 1<++x;
        boolean A = true || 1<++x;
        System.out.print("D=");
        System.out.println(D);
        System.out.print("A=");
        System.out.println(A);

        //Ternary operators boolean expression ? expression1 : expression2
        String a = 5 < 2 ? "alb" : "albastru";
        System.out.print("a=");
        System.out.println(a);

        //Assignment operators =, +=, -=, *=, /=, %=, &=, ^=, !=, <<=, >>=, >>>=

        int Z = 1;
        System.out.print("Z=");
        System.out.println(Z);
        Z += 2; // Z=Z+2;
        System.out.print("Z=");
        System.out.println(Z);


        //Shift operators <<, >>, >>>

        int H=1; //1 is 0001 in binary,
        int T=3;
        System.out.println(H << 1); // shift 1 bit to left means 0010 which is 2
        System.out.println(H << 2); // shift 2 bits to left means 0100 which is 4
        System.out.print("T<<1=");
        System.out.println(T<<1);
        System.out.print("T<<2=");
        System.out.println(T<<2);
        System.out.println("   ");


    }
}
