package com.inanc.randd;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    private void className() {
        System.out.println("Class Name: " + getClass().getSimpleName());
    }

    public void startEngine(){
        System.out.println("Starting the engine of " + name );
    }

    public void drive(){
        System.out.println("Driving " + name);
        runEngine();
    }

    protected void runEngine(){
        System.out.println("Running the engine for " + name);
    }

    public void printClassType() {
        System.out.println("Class Type: " + getClass().getSimpleName());
    }

}
