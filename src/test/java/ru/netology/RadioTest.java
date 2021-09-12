package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldGetAndSetNameRadio() {
        Radio radio = new Radio();
        String expected = "Радио";

        assertNull(radio.getName());
        radio.setName(expected);
        assertEquals(expected, radio.getName());
    }

    @Test
    public void shouldGetAndSet() {
        Radio radio = new Radio();
        assertEquals(9, radio.getMaxNumberStation());
        assertEquals(0, radio.getMinNumberStation());
        assertEquals(10, radio.getMaxVolume());
        assertEquals(0, radio.getMinVolume());
        assertEquals(0, radio.getCurrentNumberStation());
        assertEquals(0, radio.getCurrentVolume());
        assertFalse(radio.on);

    }

    @Test
    public void nextNumberStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(0);
        radio.nextNumberStation();
       assertEquals(1, radio.getCurrentNumberStation());
    }

    @Test
    public void prevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(9);
        radio.prevNumberStation();
        assertEquals(8, radio.getCurrentNumberStation());
    }

    @Test
    public void nextNumberStationUpperLimit() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(9);
        radio.nextNumberStation();
        assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    public void prevNumberStationUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(0);
        radio.prevNumberStation();
        assertEquals(9, radio.getCurrentNumberStation());
    }

    @Test
    public void nextVolume() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(0);
        radio.nextVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void prevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.prevVolume();
        assertEquals(9, radio.getCurrentVolume());
    }


    @Test
    public void nextVolumeUpperLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.nextVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void prevVolumeUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.prevVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldRadioIsOn() {
        Radio radio = new Radio();
        radio.isOn();
        assertFalse(radio.isOn());
    }
}