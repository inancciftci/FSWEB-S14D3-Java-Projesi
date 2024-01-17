package com.inanc.randd;

public class HybridCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerCharge, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the hybrid engine of " + getName());
    }

    @Override
    public void drive() {
        System.out.println("Driving " + getName() + " (Hybrid)");
        runEngine();
    }
}
