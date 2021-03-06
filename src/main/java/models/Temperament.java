package models;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public enum Temperament {

    AGGRESSIVE("Aggressive"),
    PASSIVE("Passive"),
    CRAZY("Crazy");

    private String temperament;

    Temperament(String temperament) {
        this.temperament = temperament;
    }

    public String getTemperament() {
        return temperament;
    }
}
