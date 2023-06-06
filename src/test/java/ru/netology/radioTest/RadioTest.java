package ru.netology.radioTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {

    @Test
    public void shouldShowCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(55);
        int expected = 55;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowCurrentVolumeNeg() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 1;
        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 100;
        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 99;
        int actual = radio.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseUnderMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.decreaseVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldShowCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowCurrentStationNeg() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotShowStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-11);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 6;
        int actual = radio.nextStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeAfterMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 0;
        int actual = radio.nextStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangePreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 8;
        int actual = radio.previousStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeAfterMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 9;
        int actual = radio.previousStation();
        Assertions.assertEquals(expected, actual);
    }
}

