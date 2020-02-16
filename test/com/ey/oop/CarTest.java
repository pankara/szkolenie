package com.ey.oop;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CarTest {
    @Test
    public void testNewCarShouldHaveInitialValuesSetToZero() {
        Car car = new Car(5, 5);
        assertEquals(car.totalDistance, 0.0);
        assertEquals(car.gasAmount, 0.0);
    }

    @Test
    public void testNewCarShouldHaveRangeZero() {
        Car car = new Car(5, 10);
        assertEquals(car.rangeInKilometers(), 0.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenNegativeMileageIsGiven() {
        Car car = new Car(5, -1.0);
    }

    @Test
    public void testCarShouldHaveProperRange() {
        Car car = new Car(50, 10);
        car.fillUpGas(10);
        assertEquals(car.rangeInKilometers(), 100.0);
    }

    @Test
    public void testCarShouldHaveProperMileageAndMaxGasAmount() {
        double expectedMileage = 10.0;
        double expectedMaxGasAmount = 100.0;
        Car car = new Car(expectedMaxGasAmount, expectedMileage);

        assertEquals(car.maxGasAmount, expectedMaxGasAmount);
        assertEquals(car.mileage, expectedMileage);
    }

    @Test
    public void shouldFillUpTheTankWithProperAmountOfGas() {
        double requestedFillUpAmount = 10.0;
        double expectedGasAmount = 10.0;
        Car car = new Car(50.0, 5.0);
        car.fillUpGas(requestedFillUpAmount);
        assertEquals(car.gasAmount, expectedGasAmount);
    }

    @Test(dataProvider = "requiredExpectedGasAmount")
    public void shouldFillUpTheTankWithProperAmountOfGasParametrized(double requestedFillUpAmount, double expectedGasAmount) {
        Car car = new Car(50.0, 5.0);
        car.fillUpGas(requestedFillUpAmount);
        assertEquals(car.gasAmount, expectedGasAmount);
    }

    @DataProvider(name = "requiredExpectedGasAmount")
    public Object[][] requiredExpectedGasAmount() {
        return new Object[][]{
                {10.0, 10.0},
                {50.0, 50.0},
                {51.0, 50.0}
        };
    }

    @Test(dataProvider = "requiredExpectedDistanceGasAmount")
    public void shouldHaveProperTotalDistanceAndGasAmountAfterDriving(double requestedDistance, double expectedTotalDistance, double expectedGasAmount) {
        Car car = new Car(50.0, 10.0);
        car.fillUpGas(20.0);
        car.drive(requestedDistance);
        assertEquals(car.gasAmount, expectedGasAmount);
        assertEquals(car.totalDistance, expectedTotalDistance);
    }

    @DataProvider(name = "requiredExpectedDistanceGasAmount")
    public Object[][] requiredExpectedDistanceGasAmount() {
        return new Object[][]{
                {300.0, 0.0, 20.0},
                {100.0, 100.0, 10.0},
                {200.0, 200.0, 0.0},

        };
    }
}
