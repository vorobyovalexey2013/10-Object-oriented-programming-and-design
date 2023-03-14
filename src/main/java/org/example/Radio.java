package org.example;

public class Radio {

    public int numberStation; //Номер текущей радиостанции.
    public int Volume; //Громкость звука.

    public int getNumberStation() {
        return numberStation;
    }

    //увеличение номара радиостанции
    public int next() {
        if (numberStation < 9) {
            numberStation = numberStation + 1;
        } else {
            numberStation = 0;
        }
        return numberStation;
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


    // выставление радиостанции
    public void setstation(int newNumberStation) {
        if (newNumberStation > 9) {
            return;
        }
        if (newNumberStation < 0) {
            return;
        } else {
            numberStation = newNumberStation;
        }
    }

    //увеличение звука
    public int increaseVolume() {
        if (Volume < 100) {
            Volume = Volume + 1;
        } else {
            Volume = 100;
        }
        return Volume;
    }

    //уменьшение номаре радиостанции
    public int reduceVolume() {
        if (Volume > 1) {
            Volume = Volume - 1;
        } else {
            Volume = 0;
        }
        return Volume;
    }

}
