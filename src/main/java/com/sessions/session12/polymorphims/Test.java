package com.sessions.session12.polymorphims;

public class Test {

    public static void main(String[] args) {
        Student student = new Student();

        System.out.println(student.getName());
        System.out.println(student.getAge());

        User user = student;
        System.out.println(user.getAge());

        User user2 = new Student();
        User teacher = new Teacher();

        new Test().printDetails(student);
        new Test().printDetails(teacher);

        User user1 =(User) student; //explicit casting is not required

        Student student1 = (Student) user1;  //casting is required when going from superclass to subclass type
        Teacher teacher1 = (Teacher) user1;

    }
    //Administrator (interface)
    //User (class)
    //Teacher Student Inspector (subclasses)

    private User printDetails(Administrator administrator) {
        System.out.println(administrator.getClass().getSimpleName() + " printing details of student");

//        return new Student();
//        return new User();
        return new Teacher();


    }
}
