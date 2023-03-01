import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void NextStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        radio.nextStation();

        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual );
    }

    @Test
    public void nextStationAfterLastStation(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void increaseVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(6);

        radio.increaseVolume();

        int expected = 7;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }


    @Test

    public void prevStation(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        radio.prevStation();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
        }

     @Test

    public  void decreaseVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(6);

        radio.decreaseVolume();

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
     }

     @Test

    public void decreaseVolumeIfCurrentIsZero(){
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
     }

     @Test

    public void prevStationIfCurrentIsMax(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
     }

     @Test

    public void setStation(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
     }

     @Test

    public void setStationIfMax(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        int expected = 9;
        int actual = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setStationIfMin(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setVolumeIfMax(){
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 100;
        int actual = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setVolumeIfMin(){
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeIfMax(){
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setStationNew(){
        Radio radio = new Radio(5);

        Assertions.assertEquals(4, radio.getCurrentRadioStation());
    }


}


