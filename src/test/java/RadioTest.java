import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // ТЕСТЫ ДЛЯ ИЗМЕНЕНИЯ НОМЕРА СТАНЦИИ НА ЕДИНИЦУ
    @Test
    public void shouldIncreaseRadioStationOne() { //увеличение станции с пограничным минимальным значением
        Radio station = new Radio();
        station.setNumberStation(1);
        station.next();
        int expected = 2;
        int actual = station.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationTwo() { //увеличение станции с пограничным максимальным значением
        Radio station = new Radio();
        station.setNumberStation(9);
        station.next();
        int expected = 0;
        int actual = station.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    //ТЕСТЫ СО СНИЖЕНИЕМ НОМЕРА СТАНЦИИ
    @Test
    public void shouldPrevRadioStationOne() { //уменьшает станцию с пограничным минимальным значением
        Radio station = new Radio();
        station.setNumberStation(1);
        station.prev();
        int expected = 0;
        int actual = station.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationTwo() { //уменьшает станцию с пограничным максимальным значением
        Radio station = new Radio();
        station.setNumberStation(9);
        station.prev();
        int expected = 8;
        int actual = station.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationThree() { //уменьшает станцию с нулевым значением
        Radio station = new Radio();
        station.setNumberStation(0);
        station.prev();
        int expected = 9;
        int actual = station.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    // ТЕСТЫ С НАЗНАЧЕНИЕМ СТАНЦИИ
    @Test
    public void shoulSendRadioStationOne() { //устанавливаем выбранную станцию в пределах диапазона
        Radio Station = new Radio();
        Station.setNumberStation(3);
        int expected = 3;
        int actual = Station.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulSendRadioStationTwo() { //устанавливаем выбранную станцию за пределами положительного диапазона
        Radio Station = new Radio();
        Station.setNumberStation(10);
        int expected = 0;
        int actual = Station.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shoulSendRadioStationThree() { //устанавливаем выбранную станцию ниже положительного диапазона
        Radio Station = new Radio();
        Station.setNumberStation(-1);
        int expected = 0;
        int actual = Station.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    //ТЕСТЫ С УВЕЛИЧЕНИЕМ ЗВУКА
    @Test
    public void shouldIncreaseVolumeOne() { //увеличивает музыку с пограничным максимальным значением
        Radio volume = new Radio();
        volume.setVolume(99);
        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeTwo() { //увеличивает музыку при пограничном значении, превышающем максимальное
        Radio volume = new Radio();
        volume.setVolume(100);
        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeThree() { //увеличивает музыку при среднем значении
        Radio volume = new Radio();
        volume.setVolume(50);
        volume.increaseVolume();
        int expected = 51;
        int actual = volume.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    //ТЕСТЫ С УМЕНЬШЕНИЕМ ЗВУКА
    @Test
    public void shouldReduceVolumeOne() { //умельшаеи музыку с пограничным маинимальным значением
        Radio volume = new Radio();
        volume.setVolume(1);
        volume.reduceVolume();
        int expected = 0;
        int actual = volume.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeTwo() { //умельшаеи музыку с пограничным маинимальным значением, меньше минимального
        Radio volume = new Radio();
        volume.setVolume(0);
        volume.reduceVolume();
        int expected = 0;
        int actual = volume.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeThree() { //умельшаеи музыку с среднем значении в пределах
        Radio volume = new Radio();
        volume.setVolume(50);
        volume.reduceVolume();
        int expected = 49;
        int actual = volume.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    //Тесты с установлением номера станции
    @Test
    public void shouldSetStationOne() {
        Radio volume = new Radio();
        volume.setVolume(3);
        int expected = 3;
        int actual = volume.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationTwo() {
        Radio volume = new Radio();
        volume.setVolume(101);
        int expected = 0;
        int actual = volume.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationThree() {
        Radio volume = new Radio();
        volume.setVolume(-1);
        int expected = 0;
        int actual = volume.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}