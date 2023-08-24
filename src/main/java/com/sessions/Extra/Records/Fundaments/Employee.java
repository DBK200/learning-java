package com.sessions.Extra.Records.Fundaments;
/*
       Declare an employee record.
       This automatically creates a record class with private,
       final fields called name and idNum,
       and with read-only accessors called name() and idNum()
        */
public record Employee(String name, int idNum) {

    //Use a canonical constructor to remove any spaces
//    public Employee(String name, int idNum){
//        this.name=name.trim();
//        this.idNum=idNum;
//    }

    //compact canonical constructor to remove spaces
    public Employee {
        name=name.trim();

        //Perform a minimalist check that name follows the 'lastname, firstname' format.

        //1. Confirm that the name contains only one comma.
        int i=name.indexOf(','); //look for comma separating names;
        int j=name.lastIndexOf(',');

        if(i!=j) throw new IllegalArgumentException("Multiple commas found.");

        //2.Confirm tgat a comma is present after at least one leading character,
        //and that at least one character follows the comma.

        if(i<1 | name.length() == i+1) throw new IllegalArgumentException("Required format: last, first");
    }

    //-------- use a non-canonical constructor in a record
    static int pendingID=-1; // instance fields are not allowed, but static is ok

    //non-canonical constructor
    public Employee(String name){
        this(name,pendingID);
    }

    //An instance method that returns only the last name without the first name
    String lastName(){
        return name.substring(0,name.trim().indexOf(','));
    }

}
