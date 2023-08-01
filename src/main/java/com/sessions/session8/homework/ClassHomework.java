package com.sessions.session8.homework;

public class ClassHomework {

    public static void main(String[] args){

        Student student1 = new Student(1234567891012L, "Braga", "Antonio", "Facultatea de info");
        System.out.println("First student: " + student1.getLastName() + " " + student1.getFirstName() + " from " + student1.getFaculty()
        + " identified by " + student1.getFacultyIdentificationCard());

        Student student2 = new Student();
        student2.setCnp(1234563213456L);
        student2.generateFacultyIdentificationCard();
        student2.setLastName("Popescu");
        student2.setFirstName("Ion");
        student2.setFaculty("Facultate de arhitectura");

        System.out.println("The second student is identified by " + student2.getFacultyIdentificationCard() + " from " + student2.getFaculty() + " with CNP " + student2.getCnp()
        + ", and his/her name is " + student2.getLastName() + " " + student2.getFirstName());

        System.out.println();

        Car car = new Car(1242 ,"Mercedes" ,"Red");
        car.carInfo();
        car.setCarSerialNumber(4312);
        System.out.println("After modifying the car, the new serial number is: " + car.getCarSerialNumber());
        car.setBrand("Dacia");
        System.out.println("After modifying the car, the new brand is: " + car.getBrand());
        car.setColor("Black");
        System.out.println("After modifying the car, the new color is: " + car.getColor());
        car.carInfo();

        System.out.println();

        House house = new House();
        house.printHouseDimensions();
        System.out.println("Before building the house it has 0 rooms");
        house.setLength(520);
        house.setWidth(300);
        house.setHeight(25);
        house.setNumberOfRooms(4);
        System.out.println("After building the house, it has " + house.getNumberOfRooms() + " rooms");
        house.printHouseDimensions();

        System.out.println();

        Phone phone = new Phone(2313,"Samsung", "S10", 64);
        System.out.println("Old phone: SN" + phone.getPhoneSerialNumber() + " " + phone.getBrand() + " " + phone.getVersion() + " " + phone.getMemoryGB() + "gb");
        phone.setBrand("Iphone");
        phone.setVersion("10");
        phone.setMemoryGB(128);
        phone.setPhoneSerialNumber(1241);
        System.out.println("New phone: " + phone.getBrand() + " " + phone.getVersion() + " " + phone.getMemoryGB() + "gb SN" + phone.getPhoneSerialNumber());

    }
}
