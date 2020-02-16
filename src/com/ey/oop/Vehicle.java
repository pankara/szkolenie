package com.ey.oop;

public class Vehicle {
    protected int numberOfWheels;

    public Vehicle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }

    public void describe(){
        System.out.printf("Number of wheels: %s.\n", this.numberOfWheels);
    }
}
