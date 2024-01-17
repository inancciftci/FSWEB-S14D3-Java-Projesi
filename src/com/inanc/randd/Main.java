package com.inanc.randd;

public class Main {
    public static void main(String[] args) {
        CarSkeleton gasCar = new GasPoweredCar("Gas Car", "Gasoline-powered vehicle", 10.5, 8);
        gasCar.startEngine();
        gasCar.drive();
        gasCar.printClassType();

        System.out.println("*********");

        CarSkeleton electricCar = new ElectricCar("Electric Car", "Electric vehicle", 150.0, 500);
        electricCar.startEngine();
        electricCar.drive();
        electricCar.printClassType();

        System.out.println("*********");

        CarSkeleton hybridCar = new HybridCar("Hybrid Car", "Combining gas and electric", 8.0, 300, 6);
        hybridCar.startEngine();
        hybridCar.drive();
        hybridCar.printClassType();
    }
}
