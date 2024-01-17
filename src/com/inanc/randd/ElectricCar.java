package com.inanc.randd;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the electric engine of " + getName());
    }

    @Override
    public void drive() {
        System.out.println("Driving " + getName() + " (Electric)");
        runEngine();
    }
}
