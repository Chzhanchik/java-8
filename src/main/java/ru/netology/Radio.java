package ru.netology;

public class Radio {
    private String name;
    private int minNumberStation = 0;
    private int maxNumberStation = 9;
    private int currentNumberStation;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;
    boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public void setMinNumberStation(int minNumberStation) {
        this.minNumberStation = minNumberStation;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public void setMaxNumberStation(int maxNumberStation) {
        this.maxNumberStation = maxNumberStation;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentNumberStation(int currentNumberStation) {
        if (currentNumberStation > maxNumberStation) {
            return;
        }
        if (currentNumberStation < minNumberStation) {
            return;
        }
        this.currentNumberStation = currentNumberStation;
    }

    public void nextNumberStation() {
        if (currentNumberStation == maxNumberStation) {
            this.currentNumberStation = minNumberStation;
            return;
        }
        this.currentNumberStation++;
    }

    public void prevNumberStation() {
        if (currentNumberStation == minNumberStation) {
            this.currentNumberStation = maxNumberStation;
            return;
        }
        this.currentNumberStation--;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }
    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void nextVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume++;
    }

    public void prevVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume--;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}