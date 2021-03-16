package com.company.the_city;


import java.util.concurrent.Callable;

public class City {
    public static void main(String[] args) {
        GasStation petrom = new GasStation();
        GasStation rompetrol = new GasStation();



        Car dacia = new Car("Andrei", "Dacia", "Red", 60, CarType.SEDAN,  20, 180);

        Car mercedes = new Car();
        mercedes.setOwner("Mihai");
        mercedes.setBrand("Mercedes");
        mercedes.setColor("Black");
        mercedes.setCarType(CarType.SUV);
        mercedes.setConsumptionPer100Km(20);
        mercedes.setMaxSpeed(300);

        dacia.setFuel(60);
        dacia.start();
        dacia.move(100, 70);
        dacia.stop();

        mercedes.setFuel(50);
        mercedes.start();
        CarServiceUtils.paintCar(mercedes, "Blue");
        mercedes.setFuel(100);
        mercedes.start();
        mercedes.move(60,50);
        mercedes.makeWrongDecision();

        CarServiceUtils.printCarsReport();

    }
}
