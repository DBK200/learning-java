package com.sessions.session12.polimorfism;

import com.sessions.session10.immutabillity.User;

public class TestR
{
    public static void main(String[] args)
    {
        StudentR student=new StudentR();

        System.out.println(student.getName());
        System.out.println(student.getAge());

        UserR user=student;//i am dat alta forma la "student"
        System.out.println(user.getAge());
        //System.out.println(user.getName);nu compileaza
        UserR user2=new StudentR();//student este un user (parinte)
        new TestR().printDetails(student);




        UserR user3=(UserR) student;//explicit casting is not required
        StudentR student1=(StudentR) user;
        //castig is required when going from superclass to subclass type
        //Teacher teacher=(Teacher)user;

    }
             //Adminstrator(interface)
            //User(class)
    //Teacher Student Inspector(subclass)
    private void printDetails(AdministratorR administrator)//poate sa accepte si UserR user
    {
        String className=administrator.getClass().getSimpleName();
        System.out.println("printing details of student");
        System.out.println(className + "details");
    }
    //private UserR printDetails(AdministratorR administrator2)
    {
//        String className=administrator2.getClass().getSimpleName();
//        System.out.println("printing details of student");
//        System.out.println(className + "details");
        //return new UserR();
       // return new StudentR();
        //return new AdministratorR();
        //return new Teacher();
    }
}
