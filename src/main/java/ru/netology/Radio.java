package ru.netology;

public class Radio {
    private String name;
    private int currentRadioStation;
    private int volume;

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setVolume(int volume) {
        if (volume > 10) {
            return;
        }
        if (volume < 0) {
            return;
        }
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void nextRadioStation() {
        if (currentRadioStation == 9) {
            setCurrentRadioStation(0);
            return;
        }
        setCurrentRadioStation(currentRadioStation + 1);
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            setCurrentRadioStation(9);
            return;
        }
        setCurrentRadioStation(currentRadioStation - 1);
    }

    public void increaseVolume() {
        if (volume == 10) {
            return;
        }
        setVolume(volume + 1);
    }

    public void decreaseVolume() {
        if (volume == 0) {
            return;
        }
        setVolume(volume - 1);
    }
}