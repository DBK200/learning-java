package com.sessions.session9;

public class UserM {
        public int age;
        public String email;
        public String firstName;
        public String lastName;
        public int numberOfMemberFamily;
    public UserM() {

        }
    public UserM( int age, String email, String firstName, String lastName,int numberOfMemberFamily){
            this.age = age;
            this.email = email;
            this.firstName = firstName;
            this.lastName = lastName;
            this.numberOfMemberFamily = numberOfMemberFamily;
        }

        private static int hisAge = 20;
        private static String hisEmail = "marian@yahoo.com";

        public void hisAge () {
            System.out.println(hisAge);
        }

        public void setHisEmail () {
            System.out.println(hisEmail);
        }

        public int calculateSum(int firstNumber, int secondNumber){
            firstNumber = 15;
            secondNumber = 25;
            int sum = firstNumber + secondNumber;
            lastName = "Buzea";
            firstName = "Marian";
            numberOfMemberFamily = 3;
            age = 23;
            System.out.println("My name is "+ lastName + firstName);
            System.out.println("My age is "+ age);
            System.out.println("User have 2 brothers "+numberOfMemberFamily);
            return sum;
        }


    }

