package com.sessions;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        car.setCylinders(12);
        car.setEngineType("Petrol");
        car.setFourWD(true);
        car.setBrand("Mustang");
        car.setTwelveCylinder(true);
        System.out.println(car.getBrand());
        System.out.println(car.getEngineType());
        System.out.println(car.getCylinders());
        System.out.println(car.fourWD());
        System.out.println(car.getTwelveCylinder());
        System.out.println();
        GPU gpu = new GPU();
        gpu.setBrandName("NVIDIA GeForce RTX", 3080);
        gpu.setGraphicsProcessor("GA", 102);
        gpu.setCores(8704);
        gpu.setMemorySize(10, "GB");
        gpu.setMemoryType("GDDR6");
        gpu.setBusWidth(320);
        System.out.print(gpu.getBrandName());
        System.out.println(gpu.getBrandName1());
        System.out.print(gpu.getGraphicsProcessor());
        System.out.println(gpu.getGraphicsProcessor1());
        System.out.println(gpu.getCores());
        System.out.print(gpu.getMemorySize());
        System.out.println(gpu.getMemorySize1());
        System.out.println(gpu.getMemoryType());
        System.out.println(gpu.getBusWidth());


    }
}