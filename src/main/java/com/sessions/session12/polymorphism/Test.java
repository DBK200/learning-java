package com.sessions.session12.polymorphism;

public class Test {

    public static void main(String[] args) {
        StudentDv studentDv=new StudentDv();
        System.out.println(studentDv.getName());
        System.out.println(studentDv.getAge());

        UserDv userDv=studentDv;
        System.out.println(userDv.getAge());


        new Test().printDetails(studentDv);

        UserDv userDv1=(UserDv) studentDv;//explicit casting is not required
        StudentDv studentDv1= (StudentDv) userDv1;//casting is required when going from
        Teacher teacher=(Teacher) userDv1;


    }
        //Administrator(interface)
        // User
    //Student
    private Administrator printDetails(Administrator administrator){
        String className= administrator.getClass().getSimpleName();
        System.out.println("printing details of student");
        System.out.println(className+" details");

       //covariant return types
                return new StudentDv();
//                return  new UserDv();


    }
}
