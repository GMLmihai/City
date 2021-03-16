package com.company.the_city;

public class GasStationUtils {


    public static void refill(GasStation[] gasStations, int amount) {
        for (GasStation gasStation : gasStations) {
            gasStation.setFuel(gasStation.getAllFuel() + amount);
        }
    }

    public static void annualCheck(GasStation gasStation) {
        if (gasStation.getAllFuel() < 10) {
            System.out.println("Gas station should refuel!");
        }
    }
}





