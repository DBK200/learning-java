package com.sessions.session12.polimofirsm;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println(student.getName());
        System.out.println(student.getAge());

//        User user = student;
//        System.out.println(user.getAge());
//       // System.out.println(user.getName()); //does not compile
//
//        User user2 = new Student();
//
//        new Test().printDetails(student);
//
          User user = (User) student; //explicit casting not required
          Student student1 = (Student)user;
    }
    private Administrator printDetails(Administrator administrator)
    {
        String className = administrator.getClass().getSimpleName();

        System.out.println("printing details of student");
        System.out.println(className + " details");
        return new Administrator(){};
        //return new Teacher();
        //return new Student();

    }


}
