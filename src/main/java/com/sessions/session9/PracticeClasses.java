//package com.sessions.session9;
//
//import java.time.LocalDate;
//
//public class PracticeClasses {
//
//    // variabila care nu e statica - nu poate fi apelata intr-o metoda statica, dar ceea ce este static poate fi folosit oriunde in cadrul clasei, adica atat in metode
//    // statice cat si non-statice
//
//    public int age; // instance variable
//                    // we need an instance in order to call this variable
//
//    public String name;
//    public boolean car;
//
//    // static variables
//    public static int counter;
//    final private static int counter2 = 0;
//
//    public static void main(String[] args) {
//       int result = calculateSum(2, 3);
//        System.out.println(result);
//        // counter2 = 2;
//
////        age // does not compile
//        PracticeClasses myObject = new PracticeClasses();
//        System.out.println(myObject.age);
//        System.out.println(myObject.name);
//        System.out.println(myObject.car);
//
//        System.out.println(counter);
//
//    }
//
//    private static int calculateSum(int primulNumar, int alDoileaNumar){
////        int sum = primulNumar + alDoileaNumar;
////        return sum;
//        int x = counter;
//        return primulNumar + alDoileaNumar;
//    }
//
//    static LocalDate getCurrentDate(){
//        LocalDate currentDate = LocalDate.now();
//        return currentDate;
//    }
//
//    private static void printVariables(String name){
//        int x = 0;
//        System.out.println(name);
//    }
//
//    private static void printVariables2(){
//        int x = 0;
//    }
//}
