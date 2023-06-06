package ru.netology.radio;

public class Radio {

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
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

    public int increaseVolume() {

        if (currentVolume >= 100) {
            currentVolume = 100;
            return currentVolume;
        } else
            return currentVolume = currentVolume + 1;
    }

    public int decreaseVolume() {
        if (currentVolume <= 0) {
            currentVolume = 0;
            return currentVolume;
        } else
            return currentVolume = currentVolume - 1;
    }

//    public int currentStation;
//
//    public int getCurrentStation() {
//        return currentStation;
//    }
//
//    public void setCurrentStation(int newCurrentStation) {
//        if (newCurrentStation < 0) {
//            return;
//        } else {
//            currentStation = 9;
//            if (newCurrentStation > 9) {
//                return;
//            }
//            currentStation = newCurrentStation;
//        }
//        currentStation = newCurrentStation;
//    }
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



