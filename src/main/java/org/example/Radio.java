package org.example;

public class Radio {

    private int numberStation; //Номер текущей радиостанции.
    private int volume; //Громкость звука.

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        if (numberStation < 0) {
            return;
        }
        if (numberStation > 9) {
            return;
        }
        this.numberStation = numberStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 100) {
            return;
        }
        this.volume = volume;
    }

    //увеличение номара радиостанции
    public void next() {
        if (numberStation < 9) {
            numberStation = numberStation + 1;
        } else {
            numberStation = 0;
        }
    }

    //уменьшение номаре радиостанции
    public int prev() {
        if (numberStation > 0) {
            numberStation = numberStation - 1;
        } else {
            numberStation = 9;
        }
        return numberStation;
    }

    //увеличение звука
    public int increaseVolume() {
        if (volume < 99) {
            volume = volume + 1;
        } else {
            volume = 100;
        }
        return volume;
    }

    //уменьшение номаре радиостанции
    public int reduceVolume() {
        if (volume > 1) {
            volume = volume - 1;
        } else {
            volume = 0;
        }
        return volume;
    }

}
