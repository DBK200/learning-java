package com.sessions.Extra.Records.Fundaments;

public class RecordDemo {
    public static void main(String[] args) {
       //Create an array of Employee records

//        Employee[] empList=new Employee[5];
//        empList[0]=new Employee("Doe, John",1047);
//        empList[1]=new Employee("Jones Robert",1048);
//        empList[2]=new Employee("Jones, , Robert",1049);
//        empList[3]=new Employee("Doe, John   ",1047);

        //The ID number is pending
        /*
        records are immutable, this cannot be changed later
        so in order to add an actual id a new record must be created.
         */
//        empList[4]=new Employee(", Robert");

        //Display names and IDs
//        for(Employee e:empList){
//            System.out.println("The employee ID for "+e.name()+ " is "+ e.idNum());
//        }

        //------
        Employee emp=new Employee("Robins, Phill",1048);
        //Display the name unmodified
        System.out.println("Employee full name is: "+emp.name());

        //Display only last name
        System.out.println("Employee last name is "+ emp.lastName());


    }
}
