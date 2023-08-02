package com.sessions.session8.tema;

public class Obiecte
{
    public static void main(String[] args)
    {
        //1:Phone

        Phone myPhone=new Phone();
        myPhone.setPaintColor("White");
        myPhone.setBatteryCapacity(3000);
        myPhone.setNumberOfCameras(2);

        //2:Student

        Student myStudent=new Student();
        myStudent.setName("Roxana");
        myStudent.setAge(20);
        myStudent.setSex("Feminin");
        myStudent.setOccupation("Student");

        //3:ATV

        ATV myAtv=new ATV();
        myAtv.setBrand("ATV017");
        myAtv.setFuelType("Diseil");
        myAtv.setPaintColor("Black");
        myAtv.setNumberOfWheels(4);

        //4:Frigider

        Frigider myFrigider=new Frigider();
        myFrigider.setBrand("Arctic");
        myFrigider.setColor("White");
        myFrigider.setPrice(2000);
        myFrigider.setSize(2);



    }
}
