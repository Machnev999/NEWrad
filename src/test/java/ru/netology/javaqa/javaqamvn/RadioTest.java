package ru.netology.javaqa.javaqamvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void shouldSetCurrentStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(5);

        int expected = 5;
        int actual = rad.getCurrentStation();

       Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation10() {
        Radio rad = new Radio();

        rad.setCurrentStation(10);

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNegativeNumber() {
        Radio rad = new Radio();

        rad.setCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);

        rad.nextStation();

        int expected = 6;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetNextStation10() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetPreviousStationFrom1() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);

        rad.prevStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetPreviousStationFrom0() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.prevStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(3);

        int expected = 3;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeBigNumber() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);

        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolumePlusOne() {
        Radio rad = new Radio();
        rad.setCurrentVolume(3);

        rad.plusVolume();

        int expected = 4;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolumePlusOneFrom10() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        rad.plusVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolumeMinusOne() {
        Radio rad = new Radio();
        rad.setCurrentVolume(3);

        rad.minusVolume();

        int expected = 2;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolumeMinusOneFrom0() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.minusVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}