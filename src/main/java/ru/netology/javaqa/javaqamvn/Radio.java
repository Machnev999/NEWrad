package ru.netology.javaqa.javaqamvn;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public int getCurrentStation () {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            newCurrentStation = 0;
        }
        if (newCurrentStation > 9) {
            newCurrentStation = 9;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation += 1;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume (int newVolume) {
        if (newVolume > 10) {
            newVolume = 10;
        }
        currentVolume = newVolume;
    }

    public void plusVolume() {
        if (currentVolume < 10) {
            currentVolume += 1;
        }
    }

    public void minusVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}