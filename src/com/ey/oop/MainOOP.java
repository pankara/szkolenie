package com.ey.oop;

public class MainOOP {
    public static void main(String[] args) {
        Vehicle lorry = new Vehicle(10);
        lorry.describe();

        Car myCar = new Car(50, 8);
        myCar.describe();

        Ambulance ambulance = new Ambulance(100, 10, 2);
        ambulance.turnOnLights();
        ambulance.fillUpGas(15);
        ambulance.drive(100);
        ambulance.describe();
    }
}
