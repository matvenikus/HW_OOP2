public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation = 5;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = 50;

    public Radio(int maxStation, int minStation, int currentStation, int maxVolume, int minVolume, int currentVolume){
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentStation = currentStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }
    public int getMaxStation(){
        return maxStation;
    }
    public int getMinStation(){
        return minStation;
    }
    public int getCurrentVolume(){
        return currentVolume;
    }
    public int getMaxVolume(){
        return maxVolume;
    }
    public int getMinVolume(){
        return minVolume;
    }

    public void setCurrentStation(int station) {
        if (station < minStation) {
            station = 0;
        }
        if (station > maxStation) {
            station = 0;
        }
        currentStation = station;
    }

    public void setCurrentVolume(int volume) {
        if (volume < minVolume) {
            volume = 0;
        }
        if (volume > maxVolume) {
            volume = 0;
        }
        currentVolume = volume;
    }

    public void next() {
        if (currentStation < maxStation) {
            currentStation ++;
        } else {
            currentStation = minStation;
        }
    }

    public void prev() {
        if (currentStation > minStation) {
            currentStation --;
        }
    }

    public void up() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void down() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}