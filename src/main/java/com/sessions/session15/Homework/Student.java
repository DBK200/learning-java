package com.sessions.session15.Homework;

public class Student {
    private String name;
    private String email;
    private int age;
    private int studentID;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public int getStudentID() {
        return studentID;
    }
    Student(String name, String email, int age, int studentID){
        this.name = name;
        this.email = email;
        this.age = age;
        this.studentID = studentID;
    }
    public boolean equals (Object object) {
        if (object == null) {
            return false;
        }

        if (object == this) {
            return true;
        }

        if (!(object instanceof Student)) {
            return false;
        }
            Student student = (Student) object;

            return  age==student.age && name.equals(name) && email.equals(email);
        }


    public int hashCode() {
        return name.hashCode()+age+email.hashCode();
    }

    public static void main(String[] args) {
        Student student1 = new Student("Bogdan", "bogdan@yahoo.com",25,10);
        Student student2 = new Student("Bogdan", "bogdan@yahoo.com",25,10);
        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
    }
    }

