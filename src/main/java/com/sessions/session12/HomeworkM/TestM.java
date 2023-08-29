package com.sessions.session12.HomeworkM;


public class TestM {

    public static void main(String[] args) {
        StudentM studentM = new StudentM();
        System.out.println(studentM.getName());
        System.out.println(studentM.getAge());

        UserBM userBM1 = studentM;
//        System.out.println(UserBM.getAge());
        UserBM userBM = studentM;

        UserBM user3 = new StudentM();
        System.out.println(userBM.getAge());
//        new TestM().printDetails(studentM);
//
//        private AdministratorBM printDetails (AdministratorBM administratorBM){
//            String className = administratorBM.getClass().getSimpleName();
//            System.out.println("printing details of student");
//            System.out.println(className + " details");

        }
    }


