public class Radio {
    private int currentStation;

    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int station) {
        if (station < 0) {
            return;
        }
        if (station > 9) {
            return;
        }
        currentStation = station;
    }

    public void setCurrentVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 100) {
            return;
        }
        currentVolume = volume;
    }

    public void next() {
        if (currentStation < 9) {
            currentStation ++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation --;
        }
    }

    public void up() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void down() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
