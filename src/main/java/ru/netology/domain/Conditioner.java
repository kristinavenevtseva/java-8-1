package ru.netology.domain;

public class Conditioner {

    private String name;
    private boolean on;
    private int currentTemperature;
    private int maxTemperature = 29;
    private int minTemperature = 17;

    public void increaseCurrentTemperature() {
        if (currentTemperature >= maxTemperature) {
            return;
        }
        currentTemperature++;
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature <= minTemperature) {
            return;
        }
        currentTemperature--;
    }

    public int getCurrentTemperature() {

        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {

        this.currentTemperature = currentTemperature;
    }
}
