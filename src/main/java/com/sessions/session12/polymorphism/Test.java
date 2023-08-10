package com.sessions.session12.polymorphism;

import com.sessions.session11.abstraction.Motorcycle;

public class Test {

    public static void main(String[] args) {
        Student student = new Student();
        User teacher = new Teacher();

        new Test().printDetails(student);
        new Test().printDetails(teacher);

        User user = (User)student; // explicit casting is not required

        Student student1 = (Student) user; // casting is required when going from
        // superclass to subclass type
        Teacher teacher1 = (Teacher) user;
//        Motorcycle motorcycle = (Motorcycle) user; // unrelated types cannot be casted

    }
         // Administrator (interface)
       // User (class)
    // Teacher Student Inspector (sub-classes)
    private User printDetails(Administrator administrator){
        String className = administrator.getClass().getSimpleName();
        System.out.println("printing details of student");
        System.out.println(className + " details");
        //covariant return types
//        return new Student();
//        return new Teacher();
        return new Teacher();
    }

}
