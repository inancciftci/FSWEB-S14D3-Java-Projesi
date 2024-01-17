package com.inanc.randd;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the gas engine of " + getName());
    }

    @Override
    public void drive() {
        System.out.println("Driving " + getName() + " (Gas Powered)");
        runEngine();
    }
}
