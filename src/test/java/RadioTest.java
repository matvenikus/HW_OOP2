import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio rad = new Radio (9,0,5, 100,0,50);
    @Test
    public void shouldSetMinAndMaxStation() {

        Assertions.assertEquals(0, rad.getMinStation());
        Assertions.assertEquals(9, rad.getMaxStation());
    }

    @Test
    public void shouldSetCurrentStation(){
        rad.setCurrentStation(5);

        Assertions.assertEquals(5, rad.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationIfMax(){
        rad.setCurrentStation(10);

        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationIfZero(){
        rad.setCurrentStation(0);

        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationIfMinus(){
        rad.setCurrentStation(-5);

        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void shouldSetNextStation() {
        rad.setCurrentStation(8);

        rad.next();

        Assertions.assertEquals(9, rad.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationIfMax() {
        rad.setCurrentStation(9);

        rad.next();

        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationIfZero() {
        rad.setCurrentStation(0);

        rad.next();

        Assertions.assertEquals(1, rad.getCurrentStation());
    }

    @Test
    public void shouldSetPreviousStation() {
        rad.setCurrentStation(8);

        rad.prev();

        Assertions.assertEquals(7, rad.getCurrentStation());
    }

    @Test
    public void shouldSetPreviousStationIfMax() {
        rad.setCurrentStation(9);

        rad.prev();

        Assertions.assertEquals(8, rad.getCurrentStation());
    }

    @Test
    public void shouldSetPreviousStationIfZero() {
        rad.setCurrentStation(0);

        rad.prev();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetMinAndMaxVolume() {

        Assertions.assertEquals(0, rad.getMinVolume());
        Assertions.assertEquals(100, rad.getMaxVolume());
    }

    @Test
    public void shouldSetVolume() {
        rad.setCurrentVolume(100);

        Assertions.assertEquals(100,rad.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeIfZero() {

        rad.setCurrentVolume(0);

        Assertions.assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeIfMinus() {

        rad.setCurrentVolume(-10);

        Assertions.assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeIfMax() {

        rad.setCurrentVolume(101);

        Assertions.assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void ShouldIncreaseVolume() {
        rad.setCurrentVolume(55);

        rad.up();

        Assertions.assertEquals(56, rad.getCurrentVolume());
    }

    @Test
    public void ShouldIncreaseVolumeIfMax() {
        rad.setCurrentVolume(100);

        rad.up();

        Assertions.assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void ShouldIncreaseVolumeIfZero() {
        rad.setCurrentVolume(0);

        rad.up();

        Assertions.assertEquals(1, rad.getCurrentVolume());
    }

    @Test
    public void ShouldDecreaseVolumeIfMax() {
        rad.setCurrentVolume(100);

        rad.down();

        Assertions.assertEquals(99, rad.getCurrentVolume());
    }

    @Test
    public void ShouldDecreaseVolumeIfZero() {
        rad.setCurrentVolume(0);

        rad.down();

        Assertions.assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void ShouldDecreaseVolume() {
        rad.setCurrentVolume(55);

        rad.down();

        Assertions.assertEquals(54, rad.getCurrentVolume());
    }
}

