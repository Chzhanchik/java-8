package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldNextRadioStation() {
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNextRadioStation1() {
        radio.setCurrentRadioStation(1);
        radio.nextRadioStation();
        assertEquals(2, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevRadioStation() {
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevRadioStation1() {
        radio.setCurrentRadioStation(1);
        radio.prevRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSelectingRadioStation() {
        radio.setCurrentRadioStation(5);
        assertEquals(5, radio.getCurrentRadioStation());
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
        radio.setVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getVolume());
    }

    @Test
    public void shouldIncreaseVolume1() {
        radio.setVolume(1);
        radio.increaseVolume();
        assertEquals(2, radio.getVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void shouldDecreaseVolume1() {
        radio.setVolume(3);
        radio.decreaseVolume();
        assertEquals(2, radio.getVolume());
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
}