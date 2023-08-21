package com.sessions.session12.practice.polymorphism;

public class User implements Administrator {
    private int age = 20;

    public int getAge() {
        return age;
    }
}

class Student extends User {
    private String name = "Alex";

    public String getName() {
        return name;
    }
}

class Teacher extends User {
    // some code
}

interface Administrator {
    // some abstract and default methods
}

class Test {
    static User user = new Teacher();
    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException {
        Student student = new Student();
        System.out.println(student.getName() + " is " + student.getAge() + " years old");

        // user1 object can't access methods from child class Student
        // because is a class User type
        User user1 = student;
        System.out.println(user1.getAge());

        // user2 object can't access methods from child class Student
        // because is a class User type
        User user2 = new Student();
        System.out.println(user2.getAge());
        System.out.println("Class reference type of [user2] is: " + typeInstanceOf(user2));

        User teacher = new Teacher();

        // Level 1. Administrator
        // Level 2. User
        // Level 3. Student, Teacher
        new Test().printDetails(student);
        new Test().printDetails(teacher);

        System.out.println("Class reference type [getObjectReferenceName]: " + getObjectReferenceName("user"));
        System.out.println("Class reference type [typeInstanceOf]: " + typeInstanceOf(user));
        new Test().printDetails(user);

        // Redundant. Explicit casting is not required
        User user3 = (User) student;

        // Casting is required when assigning superclass to subclass
        Student student1 = (Student) user3;

        // Casting is possible only for related types
        // (String) User ... won't compile
    }

    /**
     * This method returns the class reference type name of the given parameter.
     * @param obj object to be checked
     * @return the name of the class reference type
     * @throws ClassNotFoundException
     */
    static String typeInstanceOf(Object obj) throws ClassNotFoundException{
        if(Class.forName("com.sessions.session12.practice.polymorphism.User").isInstance(obj))
            return "User";

        else if(Class.forName("com.sessions.session12.practice.polymorphism.Student").isInstance(obj))
            return "Student";

        else if(Class.forName("com.sessions.session12.practice.polymorphism.Teacher").isInstance(obj))
            return "Teacher";

        else return "Unknown";
    }

    /**
     * This method returns the class of the instance variable's type
     * @param fieldName the name of an instance variable from current class
     * @return the type class of the instance variable
     * @throws NoSuchFieldException
     */
    static String getObjectReferenceName(String fieldName) throws NoSuchFieldException{
        return Test.class.getDeclaredField(fieldName).getType().getSimpleName();
    }

    private void printDetails(Administrator administrator){
        String className = administrator.getClass().getSimpleName();
        System.out.println(className + " details");
    }
}