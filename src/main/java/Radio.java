public class Radio {
    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
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

    public void next (int station) {
        if (station < 9){
            station++;
        } else {
            station = 0;
        }
        currentStation = station;
    }

    public void prev (int station) {
        if (station <= 9) {
            station--;
        }
        if (station <= 0){
            station = 9;
        }
        currentStation = station;
    }

    public int currentVolume;

    public int getCurrentVolume(){
        return currentVolume;
    }

    public void setCurrentVolume (int volume) {
        if (volume < 100) {
            return;
        }
        if (volume > 100) {
            return;
        }
        currentVolume = volume;
    }

    public void up (int volume) {
        if (volume < 100) {
            volume ++;
        } else {
            volume = 0;
        }
        currentVolume = volume;
    }

    public void down (int volume) {
        if (volume <= 100){
            volume --;
        }
        if (volume <= 0){
            volume = 0;
        }
        currentVolume = volume;
    }
}
