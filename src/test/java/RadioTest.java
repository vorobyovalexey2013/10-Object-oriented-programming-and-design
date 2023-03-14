import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // ТЕСТЫ ДЛЯ ИЗМЕНЕНИЯ НОМЕРА СТАНЦИИ НА ЕДИНИЦУ
    @Test
    public void shouldIncreaseRadioStationOne() { //увеличение станции с пограничным минимальным значением
        Radio Station = new Radio();
        Station.next();
        Station.numberStation = 0;
        int expected = 1;
        int actual = Station.next();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationTwo() { //увеличение станции с пограничным максимальным значением
        Radio Station = new Radio();
        Station.next();
        Station.numberStation = 9;
        int expected = 0;
        int actual = Station.next();
        Assertions.assertEquals(expected, actual);
    }

    //ТЕСТЫ СО СНИЖЕНИЕМ НОМЕРА СТАНЦИИ
    @Test
    public void shouldPrevRadioStationOne() { //уменьшает станцию с пограничным минимальным значением
        Radio Station = new Radio();
        Station.prev();
        Station.numberStation = 1;
        int expected = 0;
        int actual = Station.prev();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationTwo() { //уменьшает станцию с пограничным максимальным значением
        Radio Station = new Radio();
        Station.prev();
        Station.numberStation = 9;
        int expected = 8;
        int actual = Station.prev();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationThree() { //уменьшает станцию с нулевым значением
        Radio Station = new Radio();
        Station.prev();
        Station.numberStation = 0;
        int expected = 9;
        int actual = Station.prev();
        Assertions.assertEquals(expected, actual);
    }

    // ТЕСТЫ С НАЗНАЧЕНИЕМ СТАНЦИИ
    @Test
    public void shoulSendRadioStationOne() { //устанавливаем выбранную станцию в пределах диапазона
        Radio Station = new Radio();
        Station.setstation(3);
        int expected = 3;
        int actual = Station.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulSendRadioStationTwo() { //устанавливаем выбранную станцию за пределами положительного диапазона
        Radio Station = new Radio();
        Station.setstation(10);
        int expected = 0;
        int actual = Station.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulSendRadioStationThree() { //устанавливаем выбранную станцию ниже положительного диапазона
        Radio Station = new Radio();
        Station.setstation(-1);
        int expected = 0;
        int actual = Station.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    //ТЕСТЫ С УВЕЛИЧЕНИЕМ ЗВУКА
    @Test
    public void shouldIncreaseVolumeOne() { //увеличивает музыку с пограничным максимальным значением
        Radio Volume = new Radio();
        Volume.increaseVolume();
        Volume.Volume = 99;
        int expected = 100;
        int actual = Volume.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeTwo() { //увеличивает музыку при пограничном значении, превышающем максимальное
        Radio Volume = new Radio();
        Volume.increaseVolume();
        Volume.Volume = 101;
        int expected = 100;
        int actual = Volume.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    //ТЕСТЫ С УМЕНЬШЕНИЕМ ЗВУКА
    @Test
    public void shouldReduceVolumeOne() { //умельшаеи музыку с пограничным маинимальным значением
        Radio Volume = new Radio();
        Volume.reduceVolume();
        Volume.Volume = 1;
        int expected = 0;
        int actual = Volume.reduceVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeTwo() { //умельшаеи музыку с пограничным маинимальным значением, меньше минимального
        Radio Volume = new Radio();
        Volume.reduceVolume();
        Volume.Volume = 0;
        int expected = 0;
        int actual = Volume.reduceVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeЕркуу() { //умельшаеи музыку с среднем значении в пределах
        Radio Volume = new Radio();
        Volume.reduceVolume();
        Volume.Volume = 50;
        int expected = 49;
        int actual = Volume.reduceVolume();
        Assertions.assertEquals(expected, actual);
    }
}
