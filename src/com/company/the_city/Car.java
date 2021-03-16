package com.company.the_city;

public class Car {

    String owner;
    String brand;
    String color;
    int fuel;
    CarType carType;
    boolean damaged;
    boolean started;
    static int numberOfCars = 0;
    int consumptionPer100Km;
    int maxSpeed;

    public Car() {
        numberOfCars++;
    }

    public Car(String owner, String brand, String color, int fuel, CarType carType, int consumptionPer100Km, int maxSpeed) {
        this.owner = owner;
        this.brand = brand;
        this.color = color;
        this.fuel = fuel;
        this.carType = carType;
        this.damaged = false;
        this.started = false;
        this.consumptionPer100Km = consumptionPer100Km;
        this.maxSpeed = maxSpeed;
        numberOfCars++;
    }

    public void start() {
        if (!damaged) {
            if (fuel > 0) {
                this.started = true;
                System.out.println(this.color + " " + this.brand + " owned by " + owner + " has started!");
            } else {
                System.out.println(this.color + " " + this.brand + " owned by " + owner + " doesn't have fuel, it can't start!");
            }
        } else {
            System.out.println(this.color + " " + this.brand + " owned by " + owner + " it's damaged, it can't started");
        }

    }

    public void move(int averageSpeed, int distance) {
        if (this.started) {
            if (averageSpeed < this.maxSpeed) {
                if (fuel - ((distance * consumptionPer100Km) / 100) >= 0) {
                    System.out.println("The " +  this.color + " " + this.brand + " started moving with an averange speed of " + averageSpeed + " km!");
                    this.fuel = this.fuel - ((distance * consumptionPer100Km) / 100);
                    System.out.println("The " + this.color + " " + this.brand + " moved " + distance + " km! It still has " + this.fuel + " liters of fuel!");
                } else {
                    System.out.println("There is not enough fuel in the tank. Recharge");
                }
            } else {
                System.out.println("The " + this.color + " " + this.brand + " can't go that fast!");
            }
        } else {
            System.out.println("We cannot make a stopped car increase speed and more.");
        }
    }

    public void refuel(int fuelAmount, GasStation gasStation){
        if (!this.started){
            this.fuel = this.fuel + gasStation.getFuel(fuelAmount);
        }else {
            System.out.println("You must stop the car before putting gas!");
        }
    }

    public void makeWrongDecision() {
        if (this.started) {
            System.out.println("The " + this.color + " " + this.brand + " crashed!");
            this.stop();
            this.damaged = true;
        } else {
            System.out.println("You can't crash a stopped car!");
        }
    }

    public void stop() {
        if (this.started) {
            this.started = false;
            System.out.println(this.color + " " + this.brand + " owned by " + owner + " has stopped!");
        } else {
            System.out.println(this.color + " " + this.brand + "was already stopped!");
        }
    }

    public String getOwner() {
        return owner;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getFuel() {
        return fuel;
    }

    public CarType getCharType() {
        return carType;
    }

    public boolean isDamaged() {
        return damaged;
    }

    public boolean isStarted() {
        return started;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public int getConsumptionPer100Km() {
        return consumptionPer100Km;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public static void setNumberOfCars(int numberOfCars) {
        Car.numberOfCars = numberOfCars;
    }

    public void setConsumptionPer100Km(int consumptionPer100Km) {
        this.consumptionPer100Km = consumptionPer100Km;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}


