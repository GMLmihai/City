package com.company.the_city;

public class CarServiceUtils {
    public static void paintCar(Car car, String color){
        car.setColor(color);
        System.out.println(car.getColor() + " " + car.getBrand() + " owned by " + car.getOwner() + " was repaired");
    }


    public static void repairCars(Car[] cars) {
        for (Car car : cars) {
            if (car != null && car.isDamaged()) {
                car.setDamaged(false);
                System.out.println(car.getColor() + " " + car.getBrand() + " owned by " + car.getOwner() + " was repaired!");
            }
        }
    }
    public static void printCarsReport() {
        if (Car.numberOfCars < 1) {
            System.out.println("The city has no cars!");
        } else if (Car.numberOfCars == 1) {
            System.out.println(" There is only one car in the city!");
        } else {
            System.out.println("There are " + Car.numberOfCars + " in the city");
        }
    }

}

