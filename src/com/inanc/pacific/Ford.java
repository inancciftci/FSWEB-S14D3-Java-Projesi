package com.inanc.pacific;

public class Ford extends Car{
    private int wheels;
    private boolean engine;

    public Ford(int cylinders, String name) {
        super(cylinders, name);
        this.wheels = 4;
        this.engine = true;
    }

    @Override
    public String brake() {
        return getName() + " is braking.";
    }

    @Override
    public String accelerate() {
        return getName() + " is accelerating.";
    }

    @Override
    public String startEngine() {
        return getName() + "'s engine is starting.";
    }

}
