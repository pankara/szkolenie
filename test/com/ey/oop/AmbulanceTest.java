package com.ey.oop;


import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AmbulanceTest {

    @Test
    public void testInitialNumberOfBeds() {
        int expectedNumberOfBeds = 5;
        Ambulance ambulance = new Ambulance(50, 10, expectedNumberOfBeds);
        assertEquals(ambulance.numberOfBeds, expectedNumberOfBeds);
    }

    @Test
    public void testTurnOnLights() {
        Ambulance ambulance = new Ambulance(50, 10, 1);
        ambulance.turnOnLights();
        assertTrue(ambulance.isLightsOn());
    }

    @Test
    public void testTurnOffLights() {
        Ambulance ambulance = new Ambulance(50, 10, 1);
        ambulance.turnOnLights();
        ambulance.turnOffLights();
        assertFalse(ambulance.isLightsOn());
    }

    @Test
    public void testNewAmbulanceLightsAreOff(){
        Ambulance ambulance = new Ambulance(50, 10, 1);
        assertFalse(ambulance.isLightsOn());
    }
}