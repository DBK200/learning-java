package com.sessions.session12.polymorphims.Homework.Homework3Exercises;

public class OperatorsExercises {

    public static void main(String[] args) {

        //Exercises with operators
        //1. Length and breadth of a rectangle are 5 and 7 respectively. Write a program to calculate the area and perimeter of the rectangle.

//        int breadth = 7;
//        int length = 5;
//
//        int area = breadth * length;
//        int perimeter = (breadth + length) * 2;
//        System.out.println(area);
//        System.out.println(perimeter);


        //2. Write a program to calculate the perimeter of a triangle having sides of length 2,3 and 5 units.

//        double side1 = 2.3;
//        int side2 = 5;
//
//        double perimeter = side1 + side1 + side2;
//        System.out.println(perimeter);


        //3.Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.

//        int x = (((8 + 2345) / 3) %5)*5;
//        System.out.println(x);


        //4.Now, solve the above question using assignment operators (eg. +=, -=, *=).

//        int x = 2345 + 8;
//        x /= 3;
//        x %= 5;
//        x *= 5;
//        System.out.println(x);


        //5.Write a program to check if the two numbers 23 and 45 are equal.

//        if(23 == 45){
//            System.out.println("The numbers are equal");
//        }else {
//            System.out.println("The numbers are not equal");
//        }


        //6.Write a program to print the power of 7 raised to 5.

//        int x = 7;
//        for(int i = 0; i < 4; i ++){
//            x *= 7;
//        }
//        System.out.println(x);


        //7.Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if both the conditions 'a < 50' and 'a < b' are true.

//        int a = 55;
//        int b = 70;
//        System.out.println(a < b && a < b);


        //8.Now solve the above question to check if atleast one of the conditions 'a < 50' or 'a < b' is true.

//        int a = 55;
//        int b = 70;
//        System.out.println(a < 50 || a < b);


        //9.If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ), write a program to calculate his total marks and percentage marks.

//        int mark1 = 78;
//        int mark2 = 45;
//        int mark3 = 62;
//
//        int totalMarks = mark1 + mark2 + mark3;
//        double percentageMark = (totalMarks / 300.0) * 100;
//
//        DecimalFormat decimalFormat = new DecimalFormat("#.00");
//        String formattedNum = decimalFormat.format(percentageMark);
//
//        System.out.println(totalMarks);
//        System.out.println(formattedNum);

        //10.Suppose the values of variables 'a' and 'b' are 6 and 8 respectively, write two programs to swap the values of the two variables.
            //1.first program by using a third variable
//        int a = 6;
//        int b = 8;
//        int c = a;
//        a = b;
//        b = c;
//        System.out.println("a = " + a + " " + "b = " + b);
            //2.second program without using any third variable
//        int a = 6;
//        int b = 8;
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println("a = " + a + " " + "b = " + b);


        //11.Write a program to convert Fahrenheit into Celsius.

//        int fahrenheit = 80;
//        int celsius = (fahrenheit - 32) * 5/9;
//        System.out.println(celsius);


        //12.The total number of students in a class are 90 out of which 45 are boys. If 50% of the total students secured grade 'A' out of which 20 are boys, then write a program to calculate the total number of girls getting grade 'A'.

//        int gradeA = 90 / 2;
//        int boysWithGradeA = 20;
//        int girlsWithGradeA = gradeA - boysWithGradeA;
//        System.out.println(girlsWithGradeA);


        //13.Write a program to calculate the sum of the first and the second last digit of a 5 digit.

//        int number = 12345;
//        int firstDigit = number / 10000;
//        int secondLastDigit = (number / 10) % 10;
//        int sum = firstDigit + secondLastDigit;
//        System.out.println(sum);


        //14.Take a 4 digit number. Write a program to display a number whose digits are 2 greater than the corresponding digits of the number TAKEN.

//        int number = 5696;
//        int firstDigit = number / 1000;
//        int secondDigit = (number / 100) % 10;
//        int thirdDigit = (number / 10) % 10;
//        int fourthDigit = number %10;
//
//        System.out.println((firstDigit + 2) + "" + (secondDigit + 2) + "" + ((thirdDigit + 2) %10)+ "" + (fourthDigit + 2));


        //15. Write a program to calculate the sum of the digits of a 3-digit number.

//        int number = 123;
//        int firstDigit = number / 100;
//        int secondDigit = (number / 10) % 10;
//        int thirdDigit = number %10;
//
//        System.out.println(firstDigit + secondDigit + thirdDigit);


        //16.Write a program to reverse a 3-digit number.

//        int number = 132;
//        int firstDigit = number / 100;
//        int secondDigit = (number / 10) % 10;
//        int thirdDigit = number %10;
//        System.out.println(thirdDigit + "" + secondDigit + "" + firstDigit);








    }

}
