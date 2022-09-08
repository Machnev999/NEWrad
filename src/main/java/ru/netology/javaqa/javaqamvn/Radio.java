package ru.netology.javaqa.javaqamvn;

public class Radio {

    private int currentStation; // создал переменную для выбранной станции
    private int currentVolume; // для выбранного звука

    public int getCurrentStation () { // отдаю значения выбранной станции
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) { // выбираю станцию и записываю его как НОВУЮ станцию
        if (newCurrentStation < 0) { 
            newCurrentStation = 0;
        }
        if (newCurrentStation > 9) {
            newCurrentStation = 9;
        }
        currentStation = newCurrentStation; // присваиваю значение новой станции как "выбранная станция"
    }

    public void nextStation() { // увеличение станции
        if (currentStation < 9) {
            currentStation += 1;// если станция меньше 9, то увеличивай на 1
        } else {
            currentStation = 0;// иначе (если станция 9) - должна стать 0.
        }
    }

    public void prevStation() { //уменьшение станции
        if (currentStation > 0) { //если станция больше 0, то уменьшаем на 1
            currentStation = currentStation - 1;
        } else {
            currentStation = 9; // иначе (если мы пытаемся уменьшить станцию после 0, то выставляй 9
        }
    }

    public int getCurrentVolume() { // отдавай значение выбранной станции
        return currentVolume;
    }

    public void setCurrentVolume (int newVolume) { //выбираем громкость  и присваеваем ей значение как новой громкости
        if (newVolume > 10) {  //есть границы повышения громкость выходит выше 10, то оставляем 10.
            newVolume = 10;
        }
        currentVolume = newVolume;
    }

    public void plusVolume() { // увеличение громкости производится если она меньше 10 . в таком случае она может увеличваться на 1 единицу
        if (currentVolume < 10) {
            currentVolume += 1;
        }
    }

    public void minusVolume() { // уменьшение громкости производится таким образом,что если выбранная громкость больше, то мы можем производить ее уменьшение 
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
