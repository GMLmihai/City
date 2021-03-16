package com.company.the_city;

public class GasStation {
    private int fuel = 300;

    public int getFuel(int fuelAmount){
        if (fuel != 0) {
            if (this.fuel - fuelAmount > 0){
                this.fuel = this.fuel - fuelAmount;
                return fuelAmount;
            }else {
                System.out.println("Gas station only has " + this.fuel + " literes of fuel!");
                System.out.println("Filing with " + this.fuel);
                this.fuel = 0;
                return this.fuel;
            }
        }else {
            System.out.println("Gas station is empty");
            return 0;
        }
    }
    public int getAllFuel(){
        return this.fuel;
    }
    public void setFuel(int fuel){
        this.fuel = fuel;
    }
}
