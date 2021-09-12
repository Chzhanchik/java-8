package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldNextRadioStation() {
        radio.nextRadioStation();
        radio.nextRadioStation();
        radio.nextRadioStation();
        radio.nextRadioStation();
        radio.nextRadioStation();
        radio.nextRadioStation();
        radio.nextRadioStation();
        radio.nextRadioStation();
        radio.nextRadioStation();
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevRadioStation() {
        radio.prevRadioStation();
        radio.prevRadioStation();
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSelectingRadioStation() {
        radio.setCurrentRadioStation(7);
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSelectingRadioStation1() {
        radio.setCurrentRadioStation(11);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSelectingRadioStation2() {
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        assertEquals(10, radio.getVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setVolume(2);
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldVolumeOverMax() {
        radio.setVolume(11);
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldVolumeOverMin() {
        radio.setVolume(-1);
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldIncreaseMaxVolume() {
        radio.setVolume(10);
        radio.increaseVolume();

        assertEquals(10, radio.getVolume());
    }

    @Test
    void shouldDecreaseMinVolume() {
        radio.setVolume(0);
        radio.decreaseVolume();

        assertEquals(0, radio.getVolume());
    }

}