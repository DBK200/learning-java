package com.sessions.session23.challenges.factory;

import java.time.LocalDate;

public interface Vehicle {
    Vehicle startWarrantyPeriod(LocalDate startDate);
    Vehicle printDetails();
}

class Car implements Vehicle {
    private LocalDate startWarrantyDate;
    private String engineType;

    public LocalDate getStartWarrantyDate() {
        return startWarrantyDate;
    }

    public String getEngineType() {
        return engineType;
    }

    @Override
    public Car startWarrantyPeriod(LocalDate startDate) {
        startWarrantyDate = (startWarrantyDate == null) ? startDate : startWarrantyDate;
        return  this;
    }

    @Override
    public Car printDetails() {
        System.out.println("Vehicle class: " + this.getClass().getSimpleName() +
                " | Engine type: '" + getEngineType() +
                "' | Warranty period starting from: " + getStartWarrantyDate());
        return this;
    }
}

class IceCar extends Car {
    private final String engineType;

    IceCar() {
        engineType = "Internal combustion engine (ICE)";
    }

    @Override
    public String getEngineType() {
        return engineType;
    }
}

class ElectricCar extends Car {
    private final String engineType = "Three-phase electric drive";

    @Override
    public String getEngineType() {
        return engineType;
    }
}


class Motorcycle implements Vehicle {
    private LocalDate startWarrantyDate;
    private String brand = "Generic brand";

    public LocalDate getStartWarrantyDate() {
        return startWarrantyDate;
    }

    public String getBrand() {
        return brand;
    }

    public Motorcycle setBrand(String brand) {
        this.brand = brand;
        return  this;
    }
    @Override
    public Motorcycle startWarrantyPeriod(LocalDate startDate) {
        this.startWarrantyDate = startDate;
        return this;
    }

    @Override
    public Motorcycle printDetails() {
        System.out.println("Vehicle class: " + this.getClass().getSimpleName() +
                " | Brand: " + getBrand() +
                " | Warranty period starting from: " + getStartWarrantyDate());
        return this;
    }
}

/**
 * <h1>Factory class</h1>
 * <p>This class builds up all the objects based on classes that implement {@link Vehicle} interface.</p>
 */
class VehicleBuilder {
    public Vehicle build(String className) {

        return switch (String.format("%S", className)) {
            case "CAR" -> new Car();
            case "ICECAR" -> new IceCar();
            case "ELECTRICCAR" -> new ElectricCar();
            case "MOTORCYCLE" -> new Motorcycle();
            default -> null;
        };
    }
}


/**
 * <h1>Testing class</h1>
 */
class VehicleTest {
    public static void main(String[] args) {
        Vehicle passat = new VehicleBuilder().build("IceCar")
                .startWarrantyPeriod(LocalDate.now())
                .printDetails();
        // Accessing engineType variable
        System.out.println(((Car) passat).getEngineType());

        // Trying to reset the warranty starting date
        passat.startWarrantyPeriod(LocalDate.of(2023, 9, 22))
                .printDetails();
    }
}