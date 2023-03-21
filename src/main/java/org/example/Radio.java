package org.example;

public class Radio {

    private int numberStation; //Номер текущей радиостанции.
    private int volume; //Громкость звука.
    private int maxStation;
    public Radio (){
    maxStation = 9;
    }
    public Radio (int stationCount){
    maxStation = stationCount - 1;
    }
    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        if (numberStation < 0) {
            return;
        }
        if (numberStation > maxStation) {
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
        if (numberStation < maxStation) {
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
            numberStation = maxStation;
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
