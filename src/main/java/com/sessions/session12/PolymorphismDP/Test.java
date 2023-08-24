package com.sessions.session12.PolymorphismDP;

public class Test {
    public static void main(String[] args) {
        Student student=new Student();


        System.out.println(student.getName());
        System.out.println(student.getAge());

//        User user=student;

   //     System.out.println(user.getAge());
//        user.getName(); //compile error

        User user2=new Student();
        User teacher=new Teacher();

        new Test().printDetails(student);
        new Test().printDetails(teacher);

        User user=(User) student; //explicit casting is not required
        Student student1=(Student) user;
        Teacher teacher1=(Teacher) user;
    }

    private User printDetails(User user){
        System.out.println("Printing details of student");
//covariant return types
        //return new Student();
        return new Teacher();

    }
}
