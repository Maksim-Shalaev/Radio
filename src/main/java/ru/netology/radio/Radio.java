package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor

public class Radio {

    private int numbersOfStations = 10;
    private int currentVolume;
    private int currentStation;

    public Radio(int numbersOfStations) {
        this.numbersOfStations = numbersOfStations;
    }

    public int getNumbersOfStations() {
        return numbersOfStations;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setNumbersOfStations(int numbersOfStations) {
        this.numbersOfStations = numbersOfStations;
    }

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



    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        } else {
            currentStation = (numbersOfStations - 1);
            if (newCurrentStation > (numbersOfStations - 1)) {
                return;
            }
            currentStation = newCurrentStation;
        }
        currentStation = newCurrentStation;
    }


//    public Radio() {
//        this.numbersOfStations = 10;
//    }
//
//    public Radio(int numbersOfStations) {
//        this.numbersOfStations = numbersOfStations;
//    }
//
//    public int getNumbersOfStations() {
//        return numbersOfStations;
//    }
//
//    public int getCurrentVolume() {
//        return currentVolume;
//    }
//
//    public int getCurrentStation() {
//        return currentStation;
//    }
//
//    public void setCurrentVolume(int newCurrentVolume) {
//        if (newCurrentVolume < 0) {
//            return;
//        } else {
//            currentVolume = 100;
//            if (newCurrentVolume >= 100) {
//                return;
//            }
//            currentVolume = newCurrentVolume;
//        }
//        currentVolume = newCurrentVolume;
//    }
//
//    public void setCurrentStation(int newCurrentStation) {
//        if (newCurrentStation < 0) {
//            return;
//        } else {
//            currentStation = (numbersOfStations - 1);
//            if (newCurrentStation > (numbersOfStations - 1)) {
//                return;
//            }
//            currentStation = newCurrentStation;
//        }
//        currentStation = newCurrentStation;
//    }

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
        if (currentStation >= (numbersOfStations - 1)) {
            currentStation = 0;
            return currentStation;
        } else {
            currentStation = currentStation + 1;
            return currentStation;
        }
    }

    public int previousStation() {
        if (currentStation <= 0) {
            currentStation = (numbersOfStations - 1);
            return currentStation;
        } else {
            currentStation = currentStation - 1;
            return currentStation;
        }
    }
}



