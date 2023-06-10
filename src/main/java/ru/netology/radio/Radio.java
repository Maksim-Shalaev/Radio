package ru.netology.radio;

public class Radio {

    private int currentVolume;
    private int currentStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        } else {
            currentVolume = 100;
            if (newCurrentVolume >= 100) {
                return;
            }
            currentVolume = newCurrentVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        } else {
            currentStation = 9;
            if (newCurrentStation > 9) {
                return;
            }
            currentStation = newCurrentStation;
        }
        currentStation = newCurrentStation;
    }

    public int increaseVolume() {
        if (currentVolume >= 100) {
            currentVolume = 100;
            return currentVolume;
        } else {
            return currentVolume = currentVolume + 1;
        }
    }

    public int decreaseVolume() {
        if (currentVolume <= 0) {
            currentVolume = 0;
            return currentVolume;
        } else {
            return currentVolume = currentVolume - 1;
        }
    }

    public int nextStation() {
        if (currentStation >= 9) {
            currentStation = 0;
            return currentStation;
        } else {
            currentStation = currentStation + 1;
            return currentStation;
        }
    }

    public int previousStation() {
        if (currentStation <= 0) {
            currentStation = 9;
            return currentStation;
        } else {
            currentStation = currentStation - 1;
            return currentStation;
        }
    }
}
//    public int increaseVolume() {
//
//        if (currentVolume < 0) {
//            currentVolume = 0;
//            return currentVolume;
//        } else if (currentVolume >= 100) {
//            currentVolume = 100;
//            return currentVolume;
//        } else
//            return currentVolume = currentVolume + 1;
//    }

//    public int decreaseVolume() {
//        if (currentVolume < 100)
//    }



