package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    Conditioner conditioner = new Conditioner();

    @Test
    public void shouldIncreaseCurrentTemperature() {

        conditioner.setCurrentTemperature(25);
        conditioner.increaseCurrentTemperature();
        int expected = 26;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentTemperatureOnMax() {

        conditioner.setCurrentTemperature(29);
        conditioner.increaseCurrentTemperature();
        int expected = 29;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentTemperature() {

        conditioner.setCurrentTemperature(21);
        conditioner.decreaseCurrentTemperature();
        int expected = 20;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentTemperatureOnMin() {

        conditioner.setCurrentTemperature(17);
        conditioner.decreaseCurrentTemperature();
        int expected = 17;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }
}