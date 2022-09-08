package ru.netology.javaqa.javaqamvn;

public class Radio {

    private int currentStation;
    private int numberOfStations = 10; // общее количество станций . можно задавать данное колличество станций
    private int minStation = 0;
    private int maxStation = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100; // вынесли данные о границах в поля

    public Radio () { // создаем конструктор
    }

    public Radio (int numberOfStations) { //  можно задаваться колличесвто станций .данное значение имеет границы до 10 и 10 включительно
        if (numberOfStations < 10) {
            numberOfStations = 10;
        }
        this.numberOfStations = numberOfStations;
    }


    public int getNumberOfStations() { // отдает значение колличества станций
        return numberOfStations;
    }

    public void setNumberOfStations(int numberOfStations) { // задает значение количеству станций. может быть только меньше 10 или 10.
        if (numberOfStations < 10) {
            numberOfStations = 10;
        }
        this.numberOfStations = numberOfStations;
    }

    public int getMaxStation() { // отдает значение максимальной станции. максимальная станция имеет целочисленное значение общего колличества станций - 1
        maxStation = numberOfStations - 1;
        return maxStation;
    }

    public int getCurrentStation() { // отдает значение выбранной станции
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {// задает значение выбранной станции . если выбранная станция меньше 0 ,то равно 0
        if (currentStation < 0) {
            currentStation = 0;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() { //след .станиця
        currentStation = currentStation < (numberOfStations - 1) ? (currentStation += 1) : minStation; // выбранная станция меньше значения общеего ко-во станций? да  - увеличиваем тек.станцию на +1 . нет - равно 0
    }

    public void prevStation() { // пред. станция 
        currentStation = currentStation > minStation ? (currentStation - 1) : (numberOfStations - 1);// выбранная станция больше 0? да - уменьшая станцию. нет - возьми общее кол-во станций и уменьше на -1
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume (int currentVolume) { // выбранная громкость записывается в новое значение "новая громкость"
        if (currentVolume > 100) { // граница. если больше 100, то оставляем 100.
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }

    public void plusVolume() { // увеличение громкости
        if (currentVolume < maxVolume) { // если выбранная громксть меньше максимальной...
            currentVolume += 1;// ... то возьми ее и увеличь на одну
        }
    }

    public void minusVolume() { // уменьшение громкости
        if (currentVolume > minVolume) {  //если выбранная громкость больше минимальной....
            currentVolume = currentVolume - 1; // ...то возьми ее и уменьшь на 1
        }
    }

}
