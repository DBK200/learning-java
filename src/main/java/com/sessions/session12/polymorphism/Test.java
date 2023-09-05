package com.sessions.session12.polymorphism;

public class Test {

    public static void main(String[] args) {
        Student student = new Student(); // avem acces la ce se afla in clasa Student dar si in clasa lui parinte, clasa User

//        System.out.println(student.getName());
//        System.out.println(student.getAge());

      //  User user = student; // se schimba tipul referintei, adica din referinta student se face o referinta de tip User
                            // tipul referintei da acces catre metode
        //user.getAge();
//        user.getName; \\ does not compile

        User user2 = new Student();
        User teacher = new Teacher();

        new Test().printDetails(student);
        new Test().printDetails(teacher);

        User user = (User) student; // explicit casting is not required
        Student student1 = (Student) user; // face un User de subtipul Student
        Teacher teacher1 = (Teacher) user; // casting is required when going from superclass to subclass type
        int x=4;
        double x2 = x;
        x2=5.6;
            // Administrator (interface)
            // User (class)
        // Teacher     Student     Inspector (sub-class)
    }

    private Administrator printDetails(Administrator administrator) {
        String className = administrator.getClass().getSimpleName();
        System.out.println("printing details of student");
        System.out.println(className + " details");

        // covariant return types
        // return new Student();
        // return new Student();

        return new Teacher();
        // interfata nu poate fi instantiata dar i se poate da o implementare pe loc; ar putea da return si de tip Administrator dar e de preferat sa nu

    }
}
