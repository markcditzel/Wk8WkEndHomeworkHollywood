package models;

import javax.persistence.*;

// Annotate for Hibernate db functionality
@Entity
@Table(name="owners") // use the plural of the class name for labelling the db table
public class Owner extends Person {

    //IV

    private Temperament temperament;

    // Constructor
    public Owner(String name, int age, Gender gender, double salary, boolean employmentStatus, Temperament temperament) {
        super(name, age, gender, salary, employmentStatus);
        this.temperament = temperament;
    }

    @Enumerated(value = EnumType.STRING)
    public Temperament getTemperament() {
        return temperament;
    }

    public void setTemperament(Temperament temperament) {
        this.temperament = temperament;
    }
}

