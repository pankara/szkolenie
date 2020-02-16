package com.ey.oop;

public class Car extends Vehicle{
    protected double totalDistance = 0.0;
    protected double gasAmount = 0.0;
    protected double maxGasAmount;
    protected double mileage;

    public Car(double maxGasAmount, double mileage) {
        super(4);
        if (maxGasAmount <= 0.0 || mileage <= 0.0){
            throw new IllegalArgumentException("maxGasAmount and mileage has to be greater than 0.0");
        }
        this.maxGasAmount = maxGasAmount;
        this.mileage = mileage;
    }

    public void fillUpGas(double requestedGasAmount) {
        double availableTankVolume = this.maxGasAmount - this.gasAmount;
        if (requestedGasAmount > availableTankVolume) {
            this.gasAmount = this.maxGasAmount;
        } else {
            this.gasAmount += requestedGasAmount;
        }
    }

    public void drive(double distanceInKilometers) {
        if (distanceInKilometers > this.rangeInKilometers()) {
            System.out.println("Not enough gas in tank!");
        } else {
            System.out.printf("Driving %s kilometers\n", distanceInKilometers);
            this.totalDistance += distanceInKilometers;
            this.gasAmount -= mileage * distanceInKilometers / 100;
        }
    }

    public double rangeInKilometers() {
        return this.gasAmount / this.mileage * 100;
    }

    public void describe() {
        System.out.printf("Number of wheels: %s\t|\t", this.numberOfWheels);
        System.out.printf("Current amount of gas in tank: %s\t|\t", this.gasAmount);
        System.out.printf("Current range: %s\t|\t", this.rangeInKilometers());
        System.out.printf("Current total distance: %s\n", this.totalDistance);
    }
}