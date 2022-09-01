package ru.netology.javaqa.javaqamvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void shouldSetCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);

        Assertions. assertEquals(5, rad.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStation110() {
        Radio rad = new Radio();
        rad.setCurrentStation(110);

        Assertions. assertEquals(110, rad.getCurrentStation());
    }

    @Test
    public void shouldGetNumberOfStations() {
        Radio rad = new Radio(15);

        Assertions. assertEquals(15, rad.getNumberOfStations());
    }

    @Test
    public void shouldSetNumberOfStations() {
        Radio rad = new Radio ();
        rad.setNumberOfStations(15);

        Assertions. assertEquals(15, rad.getNumberOfStations());
    }

    @Test
    public void shouldConstructorSetNumberOfStations() {
        Radio rad = new Radio (15);

        Assertions. assertEquals(15, rad.getNumberOfStations());
    }

    @Test
    public void shouldSetNumberOfStationsLess10() {
        Radio rad = new Radio ();
        rad.setNumberOfStations(5);

        Assertions. assertEquals(10, rad.getNumberOfStations());
    }

    @Test
    public void shouldConstructorSetNumberOfStationsLess10() {
        Radio rad = new Radio (5);

        Assertions. assertEquals(10, rad.getNumberOfStations());
    }

    @Test
    public void shouldSetNumberOfStationsNegative() {
        Radio rad = new Radio ();
        rad.setNumberOfStations(-5);

        Assertions. assertEquals(10, rad.getNumberOfStations());
    }

    @Test
    public void shouldConstructorSetNumberOfStationsNegative() {
        Radio rad = new Radio (-5);

        Assertions. assertEquals(10, rad.getNumberOfStations());
    }

    @Test
    public void shouldSetNumberOfStations10() {
        Radio rad = new Radio ();
        rad.setNumberOfStations(10);

        Assertions. assertEquals(10, rad.getNumberOfStations());
    }

    @Test
    public void shouldConstructorSetNumberOfStations10() {
        Radio rad = new Radio (10);

        Assertions. assertEquals(10, rad.getNumberOfStations());
    }
    @Test
    public void shouldSetFactoryStation() {
        Radio rad = new Radio();

        Assertions. assertEquals(9, rad.getMaxStation());
    }

    @Test
    public void shouldSetStationNegative() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);

        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void shouldGetNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);

        rad.nextStation();

        Assertions. assertEquals(6, rad.getCurrentStation());
    }

    @Test
    public void shouldGetNextStationFromMax() {
        Radio rad = new Radio(20);
        rad.setCurrentStation(rad.getMaxStation());

        rad.nextStation();

        Assertions. assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void shouldGetPreviousStationFrom1() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);

        rad.prevStation();

        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void shouldGetPreviousStationFrom0() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.prevStation();

        Assertions. assertEquals(9, rad.getCurrentStation());
    }

    @Test
    public void shouldConstructorGetPreviousStationFrom0() {
        Radio rad = new Radio(13);
        rad.setCurrentStation(0);

        rad.prevStation();

        Assertions. assertEquals(12, rad.getCurrentStation());
    }

    @Test
    public void shouldGetPreviousStationFromMax() {
        Radio rad = new Radio(20);

        rad.prevStation();

        Assertions.assertEquals(19, rad.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(3);

        Assertions.assertEquals(3, rad.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeBigNumber() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1000);

        Assertions.assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void shouldGetVolumePlusOne() {
        Radio rad = new Radio();
        rad.setCurrentVolume(3);

        rad.plusVolume();

        Assertions.assertEquals(4, rad.getCurrentVolume());
    }

    @Test
    public void shouldGetVolumePlusOneFrom100() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.plusVolume();

        Assertions.assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void shouldGetVolumeMinusOne() {
        Radio rad = new Radio();
        rad.setCurrentVolume(3);

        rad.minusVolume();

        Assertions.assertEquals(2, rad.getCurrentVolume());
    }

    @Test
    public void shouldGetVolumeMinusOneFrom0() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.minusVolume();

        Assertions.assertEquals(0, rad.getCurrentVolume());
    }

}
