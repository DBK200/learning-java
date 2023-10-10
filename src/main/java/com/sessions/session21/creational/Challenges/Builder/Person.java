package com.sessions.session21.creational.Challenges.Builder;



public class Person {
    //for a person

    private final String firstName;
    private final String lastName;
    private final int age;
    private final String address;
    private final int phoneNum;

    private Person(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNum = builder.phoneNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNum() {
        return phoneNum;
    }
    public static class Builder{
        private final String firstName;
        private final String lastName;
        private int age;
        private String address;
        private int phoneNum;

        public Builder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder address(String address){
            this.address = address;
            return this;
        }
        public Builder phoneNum(int phoneNum){
            this.phoneNum = phoneNum;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }
    public String toString(){
        return "Person:\nfirstName: " + firstName + "\nlastName: " + lastName + "\nage: " + age + "\naddress: "
                +address + "\nphoneNum: " + phoneNum;
    }
}

class Main2{
    public static void main(String[] args) {
        Person person = new Person.Builder("Mike", "John")
                .age(26)
                .address("123 abc")
                .phoneNum(123445)
                .build();

        System.out.println(person);

    }
}

