
package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldNextRadiostation() {
        radio.nextRadiostation();
        radio.nextRadiostation();
        radio.nextRadiostation();
        radio.nextRadiostation();
        radio.nextRadiostation();
        radio.nextRadiostation();
        radio.nextRadiostation();
        radio.nextRadiostation();
        radio.nextRadiostation();
        radio.nextRadiostation();
        assertEquals(0, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldPrevRadiostation() {
        radio.prevRadiostation();
        radio.prevRadiostation();
        radio.prevRadiostation();
        assertEquals(7, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldSelectingRadiostation() {
        radio.setCurrentRadiostation(7);
        assertEquals(7, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldSelectingRadiostation1() {
        radio.setCurrentRadiostation(11);
        assertEquals(0, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldSelectingRadiostation2() {
        radio.setCurrentRadiostation(-1);
        assertEquals(0, radio.getCurrentRadiostation());
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

    @Test
    void increaseVolume() {
        int currentVolume = 1;
        radio.setVolume(currentVolume);
        radio.increaseVolume();
        assertEquals(2, radio.getVolume());
    }

    @Test
    void increaseVolumeone() {
        int currentVolume = 2;
        radio.setVolume(currentVolume);
        radio.increaseVolume();
        assertEquals(3, radio.getVolume());
    }

    @Test
    void increaseVolumetwo() {
        int currentVolume = 3;
        radio.setVolume(currentVolume);
        radio.increaseVolume();
        assertEquals(4, radio.getVolume());
    }

    @Test
    void increaseVolumethree() {
        int currentVolume = 4;
        radio.setVolume(currentVolume);
        radio.increaseVolume();
        assertEquals(5, radio.getVolume());
    }

    @Test
    void increaseVolumefour() {
        int currentVolume = 5;
        radio.setVolume(currentVolume);
        radio.increaseVolume();
        assertEquals(6, radio.getVolume());
    }

    @Test
    void increaseVolumefive() {
        int currentVolume = 6;
        radio.setVolume(currentVolume);
        radio.increaseVolume();
        assertEquals(7, radio.getVolume());

    }

    @Test
    void DecreaseVolume() {
        int currentVolume = 1;
        radio.setVolume(currentVolume);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }
    @Test
    void DecreaseVolumeone() {
        int currentVolume = 2;
        radio.setVolume(currentVolume);
        radio.decreaseVolume();
        assertEquals(1, radio.getVolume());
    }
    @Test
    void DecreaseVolumetwo() {
        int currentVolume = 3;
        radio.setVolume(currentVolume);
        radio.decreaseVolume();
        assertEquals(2, radio.getVolume());
    }
    @Test
    void DecreaseVolumethree() {
        int currentVolume = 4;
        radio.setVolume(currentVolume);
        radio.decreaseVolume();
        assertEquals(3, radio.getVolume());
    }
    @Test
    void DecreaseVolumefour() {
        int currentVolume = 5;
        radio.setVolume(currentVolume);
        radio.decreaseVolume();
        assertEquals(4, radio.getVolume());
    }
    @Test
    void DecreaseVolumefive() {
        int currentVolume = 6;
        radio.setVolume(currentVolume);
        radio.decreaseVolume();
        assertEquals(5, radio.getVolume());
    }
}