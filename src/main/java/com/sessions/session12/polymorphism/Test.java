package com.sessions.session12.polymorphism;

public class Test {

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getAge());

        UserM userM = student;
        System.out.println(userM.getAge());
//        System.out.println(userM.getName); //does not compile

        UserM user2 = new Student();
        UserM teacher = new Teacher();

        new Test().printDetails(student);
        new Test().printDetails(teacher);

        UserM userM1 = student; //explicit casting is not required
        Student student1 = (Student) userM; //casting is required when going from super class to subclass type
        Teacher teacher1 = (Teacher) userM;

    }

        //Administrator (interface)
      //User (class)
    //Teacher Student Inspector (sub-classes)
    private AdministratorM printDetails(AdministratorM administratorM) {
        String className = administratorM.getClass().getSimpleName();
        System.out.println("printing details of student");
        System.out.println(className + " details");

        //covariant return types
//        return new Student();
        return new Teacher();

    }
}
