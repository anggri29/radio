public class Radio {
    private int currentStation;
    private int defaultVolume;
    private int numberOfStations;

    public Radio() {
        this.numberOfStations = 10;
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station < numberOfStations) {
            this.currentStation = station;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void nextStation() {
        currentStation = (currentStation + 1) % numberOfStations;
    }

    public void prevStation() {
        currentStation = (currentStation - 1 + numberOfStations) % numberOfStations;
    }

    public void setCurrentVolume(int volume) {
        if (volume < 0) {
            defaultVolume = 0;
        } else if (volume > 100) {
            defaultVolume = 100;
        } else {
            defaultVolume = volume;
        }
    }

    public int getCurrentVolume() {
        return defaultVolume;
    }

    public void increaseVolume() {
        if (defaultVolume < 100) {
            defaultVolume++;
        }
    }

    public void decreaseVolume() {
        if (defaultVolume > 0) {
            defaultVolume--;
        }
    }
}